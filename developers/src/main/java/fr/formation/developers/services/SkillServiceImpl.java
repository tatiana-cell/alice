package fr.formation.developers.services;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;
import fr.formation.developers.domain.entities.Skill;
import fr.formation.developers.repositories.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService {
	private final SkillRepository repository;

	public SkillServiceImpl(SkillRepository repository) {
		this.repository = repository;
	}

	@Override
	public SkillView getById(Long id) {
		/*
		 * SkillView skill = new SkillView(); System.out.println("call in service");
		 * skill.setName("String boot " + id); return skill;
		 */
		Skill skill = repository.findById(id).get();
		SkillView view = new SkillView();
		view.setName(skill.getName());
		return view;
	}

	@Override
	public void create(SkillCreate dto) {
		Skill skill = new Skill();
		skill.setName(dto.getName());// sauvegarder skill en base de données
		repository.save(skill);
		System.out.println("call in service, method create de service est executé");
		System.out.println(dto);

	}

}
