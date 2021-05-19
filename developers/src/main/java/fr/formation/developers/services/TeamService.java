package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.Team;

public interface TeamService {

	Team getTeamByName(String name);

	void deleteTeamByName(String name);

	void createTeam(Team teamhttp);

}
