package cl.prueba.pelis.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("cine")
public class HomeController {

	@GetMapping("/inicio")
	public String getInit() {
		return "hola hola!";
	}
}
