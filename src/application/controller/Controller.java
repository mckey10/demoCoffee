package application.controller;

import application.model.I_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@Autowired
	I_Model model;

	@PostMapping(value = "/addUser")
	public boolean addUsers(@RequestParam(name = "user") String nameUser) {
		return model.addUsers(nameUser);
	}


}
