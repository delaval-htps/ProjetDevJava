package fr.doriandelaval.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.doriandelaval.entity.Client;

@Repository

public class ClientDaoIpml implements ClientDao {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * renvoie la liste des clients, utilise une session factory d'hibernate pour
	 * pouvoir envoyer une requete SQL
	 * 
	 * @return la liste de tous les clients
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Client> getClients() {

		Session session = sessionFactory.getCurrentSession();

		List<Client> clients = new ArrayList<Client>();

		clients = session.createQuery("from Client").getResultList();

		// lecture a la console

		for (Client client : clients) {
			System.out.println(client);
		}
		return clients;
	}

}
