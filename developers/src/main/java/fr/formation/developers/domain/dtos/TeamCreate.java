package fr.formation.developers.domain.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TeamCreate {
	@NotNull
	@Size(min = 1, max = 255)
	private String teamName;
	@NotNull
	boolean agile;

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", agile=" + agile + "]";
	}

	public TeamCreate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public boolean isAgile() {
		return agile;
	}

	public void setAgile(boolean agile) {
		this.agile = agile;
	}

}
