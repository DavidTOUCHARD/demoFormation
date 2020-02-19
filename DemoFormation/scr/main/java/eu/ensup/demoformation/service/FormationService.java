package eu.ensup.demoformation.service;

import eu.ensup.demoformation.dao.FormationDao;
import eu.ensup.demoformation.dao.IFormationDao;
import eu.ensup.demoformation.domaine.Formation;

public class FormationService implements IFormationService {

	IFormationDao iFormationDao = new FormationDao();

	@Override
	public int ajouterFormation(Formation formation) {
		// TODO Auto-generated method stub
		return iFormationDao.ajouterFormation(formation);
	}

}
