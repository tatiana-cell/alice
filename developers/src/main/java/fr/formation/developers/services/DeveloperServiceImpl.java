package fr.formation.developers.services;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;

@Service
public class DeveloperServiceImpl implements DeveloperService {

	@Override
	public DeveloperView getByPseudo(String pseudo) {
		DeveloperView developer = new DeveloperView();
		developer.setFirstName("Pierre");
		developer.setLastName("Dupont");
		developer.setPseudo("tcin-tchin");
		developer.setBirthDate(LocalDate.of(2020, 10, 12));
		System.out.println("Call in DeveloperService");
		System.out.println(developer);
		return developer;
	}

	@Override
	public void create(DeveloperCreate developer) {
		System.out.println(developer);
		System.out.println("Passage by DeveloperService");
	}

	@Override
	public void updateBirthDate(String pseudo, DeveloperUpdate partial) {
		System.out.println("Entering service for updating birth day");
		System.out.println("After update the BirtDay of " + pseudo + " becomes " + partial.getBirthDate());
	}

}
