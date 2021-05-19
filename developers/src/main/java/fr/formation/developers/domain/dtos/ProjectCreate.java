package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProjectCreate {
	@NotNull
	@NotBlank
	@Size(min = 1, max = 255)
	private String projectName;
	@NotNull
	@Size(min = 100, max = 1000)
	private String projectDescription;
	@NotNull
	private long annualBudget;
	@NotNull
	@FutureOrPresent
	private LocalDate startDate;

	public ProjectCreate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
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

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "ProjectCreate [projectName=" + projectName + ", projectDescription=" + projectDescription
				+ ", annualBudget=" + annualBudget + ", startDate=" + startDate + "]";
	}

}
