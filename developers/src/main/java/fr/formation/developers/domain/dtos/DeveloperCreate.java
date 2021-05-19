package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import fr.formation.developers.validation.Birthdate;
public class DeveloperCreate{
   @NotNull
   private String pseudo;
   @NotNull
   private String firstName;
   @NotNull
   private String LastName;
   @NotNull
   @Birthdate
   private  LocalDate birthDate;
public DeveloperCreate() {
	super();
	
}
public String getPseudo() {
	return pseudo;
}
public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public LocalDate getBirthDate() {
	return birthDate;
}
public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
}
@Override
public String toString() {
	return "DeveloperCreate [pseudo=" + pseudo + ", firstName=" + firstName + ", LastName=" + LastName + ", birthDate="
			+ birthDate + "]";
}
   
   
}
