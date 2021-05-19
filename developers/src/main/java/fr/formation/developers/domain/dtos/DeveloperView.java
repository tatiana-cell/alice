package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

public class DeveloperView {

	private String pseudo;

	private String firstName;

	private String LastName;

	private LocalDate birthDate;

	public DeveloperView() {

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
		return "DeveloperView [pseudo=" + pseudo + ", firstName=" + firstName + ", LastName=" + LastName
				+ ", birthDate=" + birthDate + "]";
	}

}
