package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import auth.PassHash;

@Controller
public class Manage {

	PassHash passHash;

	@Autowired
	Manage(PassHash phd) {
		passHash = phd;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String handleLogin() {

		// Further processing, e.g., user authentication

		return "login";
	}

	@RequestMapping(value = "/hashed", method = RequestMethod.POST)
	public String aftlog(@RequestParam("password") String password, Model model) {
		String hashedPassword = passHash.hashPassword(password);
		model.addAttribute("password", password);
		model.addAttribute("hashedPassword", hashedPassword);
		System.out.println(hashedPassword);

		return "hashed";
	}
	// Other controller methods
}
