package com.oficina.oficina.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oficina.oficina.model.Manutencao;
import com.oficina.oficina.model.Mecanico;
import com.oficina.oficina.service.ManutencaoService;
import com.oficina.oficina.service.MecanicoService;

@Controller
public class ManutencaoController {
	
	@Autowired
	private ManutencaoService service;
	
	@Autowired
	private MecanicoService mecanicoService;
	
	@GetMapping("/")
	public ModelAndView findAll() {
		
		ModelAndView mv = new ModelAndView("/manutencao");
		mv.addObject("listaManutencao", service.findAll());
		
		
		return mv;
	}
	
	
	
	@GetMapping("/add")
	public ModelAndView add(Manutencao manutencao) {
		
		ModelAndView mv = new ModelAndView("/manutencaoAdd");
		mv.addObject("listaMecanico", mecanicoService.findAll());
		mv.addObject("manutencao", manutencao);
		
		return mv;
	}
	
	
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		
		return add(service.findOne(id));
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		
		service.delete(id);
		
		return findAll();
	}

	@PostMapping("/save")
	public ModelAndView save(@Valid Manutencao manutencao, BindingResult result) {
		
		if(result.hasErrors()) {
			return add(manutencao);
		}
		
		Mecanico mecanico = mecanicoService.findOne(manutencao.getMecanico().getId());
		
		manutencao.setMecanico(mecanico);
		
		service.save(manutencao);
		
		return findAll();
	}

}
