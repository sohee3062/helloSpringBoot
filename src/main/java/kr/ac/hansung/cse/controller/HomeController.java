package kr.ac.hansung.cse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	// @RequestMapping(value="/", method = RequestMethod.GET).
	@GetMapping("/")
	public String home(Model model) {

		model.addAttribute("message", "hello world");
		return "index";

	}
}
