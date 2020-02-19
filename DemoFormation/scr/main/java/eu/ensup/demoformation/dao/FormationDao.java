package eu.ensup.demoformation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eu.ensup.demoformation.domaine.Formation;

public class FormationDao implements IFormationDao {

	EntityManagerFactory emf;
	EntityManager em;

	@Override
	public int ajouterFormation(Formation formation) {
		emf = Persistence.createEntityManagerFactory("demoFormation-pu");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			// debuter la transaction
			tx.begin();
			// effectuer l'opération
			em.persist(formation);
			// valider la transaction
			tx.commit();
			// fermer l'unité de persistence
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

}
