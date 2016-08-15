package pruebaspring.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	//Procesar solicitud GET de /
	@RequestMapping(value="/", method=GET)
	public String home() {
		return "index";
	}
}
