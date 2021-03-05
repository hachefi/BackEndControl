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

import com.example.demo.entity.Absence;
import com.example.demo.repository.AbsenceRepository;

@RestController
@RequestMapping("absences")
@CrossOrigin
public class AbsenceController {
	@Autowired
	AbsenceRepository absRepo;
	@GetMapping("")
	public List<Absence> showAll() {
		return absRepo.findAll();
	}
	@PostMapping("/save")
	public void saveAbsence(@RequestBody Absence ab) {
		 absRepo.save(ab);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteAbsence(@PathVariable Integer id) {
		absRepo.deleteById(id);
	}
	@PutMapping("/update/{id}")
	public Absence updateEtudiant(@RequestBody Absence ab, @PathVariable Integer id ) {
		Absence absence=absRepo.findById(id).get();
		absence.setId(id);
		absence.setSeance(ab.getSeance());
		absence.setDate(ab.getDate());
		absence.setHeure(ab.getHeure());
		absence.setMotif(ab.getMotif());
		absence.setEtudiant(ab.getEtudiant());
		absRepo.save(absence);
		return absence;
	}
}
