package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;

public interface SkillService {
	public SkillView getById(Long id);

	public void create(SkillCreate skill);
}
