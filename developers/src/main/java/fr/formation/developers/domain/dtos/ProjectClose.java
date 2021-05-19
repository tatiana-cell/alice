package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;

public class ProjectClose {
	@NotNull
	@FutureOrPresent
	private LocalDate startDate;

}
