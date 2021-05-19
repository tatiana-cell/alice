package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

public class Project {
@NotNull
	private String projectName;
@NotNull
  private String projectDescription;
@NotNull
  private LocalDate startDate;
@NotNull
  private LocalDate endDate;
@NotNull
  private Long budget;

public Project() {
	super();
	// TODO Auto-generated constructor stub
}
  
  
}
