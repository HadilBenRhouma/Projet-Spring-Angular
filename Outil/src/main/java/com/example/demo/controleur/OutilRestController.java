package com.example.demo.controleur;

// Fix the package name and use the correct folder structure.

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Outil; // Import the correct entity.
import com.example.demo.service.IOutilService; // Import the service interface for Outil.

@RestController
public class OutilRestController {

	@Autowired
	IOutilService outilService; // Use the Outil service interface.

	@RequestMapping(value = "/outils", method = RequestMethod.GET)
	public List<Outil> findOutils() {
		return outilService.findAll();
	}

	@GetMapping(value = "/outils/id?id={id}")
	public Outil findOutilById(@PathVariable Long id) {
		return outilService.findOutil(id);
	}

	@PostMapping(value = "/outils/save")
	public Outil addOutil(@RequestBody Outil p) {
		return outilService.addOutil(p);
	}

	@DeleteMapping(value = "/outils/{id}")
	public void deleteOutil(@PathVariable Long id) {
		outilService.deleteOutil(id);
	}

	@PutMapping(value = "/outils/update/{id}")
	public Outil updateOutil(@PathVariable Long id, @RequestBody Outil p) {
		p.setId(id);
		return outilService.updateOutil(p);
	}
}