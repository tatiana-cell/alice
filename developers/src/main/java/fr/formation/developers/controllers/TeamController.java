package fr.formation.developers.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.Team;
import fr.formation.developers.services.TeamService;

@RestController
@RequestMapping("/teams")

public class TeamController {
	public final TeamService service;

	public TeamController(TeamService service) {
		this.service = service;
	}

	ArrayList<Team> teams = new ArrayList<Team>();

	public List<Team> getListTeams() {
		return this.teams;
	}

	@GetMapping("/{name}")
	public Team getTeamByName(@PathVariable("name") String name) {

		return service.getTeamByName(name);
		/*
		 * for (Team team : teams) { String teamName = team.getTeamName(); if
		 * (teamName.equals(name)) { System.out.println("The Team named " + name +
		 * " has been found"); return team; } } { System.out.println("The team named " +
		 * name + "has not been found."); return null; }
		 */

	}

	@DeleteMapping("/{name}")
	public void deleteTeamByName(@PathVariable("name") String name) {
		/*
		 * Team team = getTeamByName(name); if (teams.contains(team)) {
		 * teams.remove(team); System.out.println("The team named " + name +
		 * " has been successfully deleted"); } else {
		 * System.out.println("Our list doesn't have a team named " + name); }
		 * 
		 * for (Team t : teams) { System.out.println(t.toString()); }
		 */
		service.deleteTeamByName(name);
	}

	@PostMapping
	public void createTeam(@Valid @RequestBody Team teamhttp) {
		/*
		 * teams.add(teamhttp); for (Team team : teams) {
		 * System.out.println(team.toString()); }
		 */
		service.createTeam(teamhttp);

	}

}
