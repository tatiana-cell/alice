package fr.formation.developers.domain.dtos;

import javax.validation.constraints.NotNull;

public class ProjectUpdate {
	@NotNull
	private String projectDescription;
	@NotNull
	private long annualBudget;

	public ProjectUpdate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public long getAnnualBudget() {
		return annualBudget;
	}

	public void setAnnualBudget(long annualBudget) {
		this.annualBudget = annualBudget;
	}

	@Override
	public String toString() {
		return "ProjectUpdate [description=" + projectDescription + ", budget=" + annualBudget + "]";
	}

}
