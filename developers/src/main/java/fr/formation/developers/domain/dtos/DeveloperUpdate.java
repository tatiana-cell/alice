package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

public class DeveloperUpdate {
@NotNull
private LocalDate birthDate;

public DeveloperUpdate() {
	super();
	// TODO Auto-generated constructor stub
}

public LocalDate getBirthDate() {
	return birthDate;
}

public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
}

@Override
public String toString() {
	return "DeveloperUpdate [birthDate=" + birthDate + ", getBirthDate()=" + getBirthDate() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
