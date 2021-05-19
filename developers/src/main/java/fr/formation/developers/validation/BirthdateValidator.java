package fr.formation.developers.validation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BirthdateValidator implements ConstraintValidator<Birthdate,LocalDate> {

	@Override
	public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
		LocalDate today=LocalDate.now();
		LocalDate dateMajeur=value.plusYears(18);
		if(dateMajeur.isBefore(today))
		return true;
		else return false;
	}
	
	

}
