package fr.formation.developers.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.formation.developers.controllers.TeamController;
import fr.formation.developers.domain.dtos.Team;

@Service
public class TeamServiceImpl implements TeamService {
	TeamController controller;

	@Override
	public Team getTeamByName(String name) {
		List<Team> teams = controller.getListTeams();
		for (Team team : teams) {
			String teamName = team.getTeamName();
			if (teamName.equals(name)) {
				System.out.println("The Team named " + name + " has been found");
				return team;
			}
		}
		{
			System.out.println("The team named " + name + "has not been found.");
			return null;
		}
	}

	@Override
	public void deleteTeamByName(String name) {
		Team team = getTeamByName(name);
		List<Team> teams = controller.getListTeams();
		teams.remove(name);

	}

	@Override
	public void createTeam(Team teamhttp) {

	}

}
