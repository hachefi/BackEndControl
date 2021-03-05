package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Etudiant;
import com.example.demo.repository.EtudiantRepository;

@RestController
@RequestMapping("etudiants")
@CrossOrigin
public class EtudiantController {
	
	@Autowired
	EtudiantRepository etudiantRepo;
	
	@GetMapping("")
	public List<Etudiant> showAll() {
		return etudiantRepo.findAll();
	}
	@PostMapping("/save")
	public void saveEtudiant(@RequestBody Etudiant etd) {
		 etudiantRepo.save(etd);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEtudiant(@PathVariable Integer id) {
		etudiantRepo.deleteById(id);
	}
	@GetMapping("/count")
	public Long countEtudiant() {
		return etudiantRepo.count();
	}
	@PutMapping("/update/{id}")
	public Etudiant updateEtudiant(@RequestBody Etudiant etd , @PathVariable Integer id ) {
		Etudiant student=etudiantRepo.findById(id).get();
		student.setId(id);
		student.setPrenom(etd.getPrenom());
		student.setEmail(etd.getEmail());
		student.setNiveau(etd.getNiveau());
		student.setFilliere(etd.getFilliere());
		student.setAbsences(etd.getAbsences());
		etudiantRepo.save(student);
		return student;
	}
}
