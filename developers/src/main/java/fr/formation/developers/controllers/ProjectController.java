package fr.formation.developers.controllers;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.ProjectCreate;
import fr.formation.developers.domain.dtos.ProjectUpdate;

@RestController
@RequestMapping("/projects")

public class ProjectController {
	@GetMapping("/{projectName}")
	public ProjectCreate getProject(@PathVariable("projectName") String projectName) {
		ProjectCreate project = new ProjectCreate();
		project.setProjectName(projectName);
		project.setProjectDescription("Un projet eblouissant");
		project.setStartDate(LocalDate.of(2020, 10, 12));
		project.setAnnualBudget(100000);
		System.out.println(project);
		return project;
	}

	@PostMapping
	public void createProject(@Valid @RequestBody ProjectCreate project) {
		System.out.println(project);
	}

	@PatchMapping("/{projectName}/description")
	public void changeDescription(@PathVariable("projectName") String projectName, @RequestBody ProjectUpdate partial) {
		System.out.println("Update " + projectName + " with new description :" + partial.getProjectDescription());
	}

	@PatchMapping("/{projectName}/budget")
	public void changeBudget(@PathVariable("projectName") String projectName, @RequestBody ProjectUpdate partial) {
		System.out.println("Update " + projectName + " with new escription : " + partial.getAnnualBudget());
	}

}
