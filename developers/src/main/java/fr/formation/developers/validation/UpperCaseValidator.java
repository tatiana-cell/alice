package fr.formation.developers.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UpperCaseValidator implements ConstraintValidator<Uppercase, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		//value doit être en majusqule
		//si value n'est pas en majuscules,alors return false
		//Si value est en maj return false
		//Comparer la value avec sa version en Majusqule
		if(value==null) return true;
		String majescules=value.toUpperCase();
		
		return value.equals(majescules);
		
		
	}

}
