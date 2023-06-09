package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Holidays {

	@Autowired
	Holidays() {

	}

	@RequestMapping(value = "/holidays", method = RequestMethod.GET)
	public String handleLogin() {
		return null;

	}

	@RequestMapping(value = "/hashed", method = RequestMethod.POST)
	public String aftlog() {
		return null;

	}
	// Other controller methods
}