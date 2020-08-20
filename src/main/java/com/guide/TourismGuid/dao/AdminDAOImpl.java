package com.guide.TourismGuid.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.guide.TourismGuid.entity.Admin;

@Repository
public class AdminDAOImpl{
	
	private SessionFactory sf = null;


	
	public void save(Admin admin)
	{
		Session session = null;
		Transaction t = null;
		try {
			session = sf.getCurrentSession();
			t = session.beginTransaction();
			session.save(admin);
			t.commit();
		} catch (Exception e) {
			if(t != null)
			{
				t.rollback();
			}
			throw e;
		}finally {
			if(session != null && session.isOpen())
			{
				session.close();
			}
		}
	}
	
	/*
	 * Update
	 */
	public void update(Admin admin) {

		Session session = null;
		Transaction t = null;
		try {

			// on obtient une session
			session = sf.getCurrentSession();

			// On commence une transaction
			t = session.beginTransaction();

			// on execute les opérations bases de données
			session.update(admin);

			// On valide la transaction, ceci ferme également la session si on la récupérer
			// avec getCurrentSession
			// si elle est récupéré par openSession dans ce cas il faut appeler close de la
			// session explicitement
			t.commit();
		} catch (Exception ex) {

			// Si il y a des problèmes et une transaction a été déjà crée on l'annule
			if (t != null) {
				// Annulation d'une transaction
				t.rollback();

			}

			// On n'oublie pas de remonter l'erreur originale
			throw ex;

		} finally {

			// Si la session n'est pas encore fermée par commit
			if (session != null && session.isOpen()) {
				session.close();
			}

		}

	}
	/*
	 * Delete
	 */
	public void delete(Long pId) {

		Session session = null;
		Transaction t = null;
		try {

			// on obtient une session
			session = sf.getCurrentSession();

			// On commence une transaction
			t = session.beginTransaction();

			// on execute les opérations bases de données

			// Avec Hibernate pour supprimer une entité, il faut d'abord la charger de la
			// base de données vers la session (toutes les opérations sur les objets se font
			// via la session)
			Admin etd = (Admin) session.get(Admin.class, pId);

			// L'objet qu'est attaché à la session est supprimé (il devient transitoire,
			// l'enregistement associé en base de données sera donc supprimé)
			session.delete(etd);

			// On valide la transaction, ceci ferme également la session si on la récupérer
			// avec getCurrentSession
			// si elle est récupéré par openSession dans ce cas il faut appeler close de la
			// session explicitement
			t.commit();
		} catch (Exception ex) {

			// Si il y a des problèmes et une transaction a été déjà crée on l'annule
			if (t != null) {
				// Annulation d'une transaction
				t.rollback();

			}

			// On n'oublie pas de remonter l'erreur originale
			throw ex;

		} finally {

			// Si la session n'est pas encore fermée par commit
			if (session != null && session.isOpen()) {
				session.close();
			}

		}

	}


	

	
}
