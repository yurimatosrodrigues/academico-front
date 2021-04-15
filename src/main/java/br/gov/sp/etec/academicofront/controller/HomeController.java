package br.gov.sp.etec.academicofront.controller;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.sp.gov.etec.academicofront.dto.EventoDto;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index(Model model){
		
		EventoDto evento = new EventoDto();
		evento.setNomeEvento("Escola Aberta");
		evento.setDescricao("Semana aberta para comunidade");
		LocalDate dataInicio = LocalDate.now();
		evento.setDataInicio(dataInicio);
		evento.setDataFim(dataInicio.plusDays(5));
		
		model.addAttribute("eventos", Arrays.asList(evento,evento,evento));
		
		return "home/index";		
	}

}
