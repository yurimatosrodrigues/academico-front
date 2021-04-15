package br.gov.sp.etec.academicofront.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import br.sp.gov.etec.academicofront.dto.Login;

@Controller
public class LoginController {
	//final String url = "https://api-academico.herokuapp.com/login/";
	final String url = "localhost:8080/login/";
	RestTemplate rest = new RestTemplate();
			
	@GetMapping("/lista")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listalogin");		
				
		ArrayList<Login> logins = rest.getForObject(url+"consultar_login", ArrayList.class);		
		modelAndView.addObject(new Login());
		modelAndView.addObject("logins", logins);
		return modelAndView;
	}
	
	@PostMapping("/salvar")
	public String salvar(Login login) {
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		Map<String, Object> map = new HashMap<>();
		map.put("username", login.getUsername());
		map.put("nome", login.getNome());
		map.put("password", login.getPassword());
		map.put("tipoLogin", login.getTipoLogin());
					
		HttpEntity<Map<String, Object>> entity = new HttpEntity<>(map, headers);
		
		ResponseEntity<Login> response = rest.postForEntity(url+"/adicionar_login", entity, Login.class);
		
		return "redirect:/lista";		
	}

}
