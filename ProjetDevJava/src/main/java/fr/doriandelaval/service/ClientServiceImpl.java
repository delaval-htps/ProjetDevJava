package fr.doriandelaval.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.doriandelaval.dao.ClientDao;
import fr.doriandelaval.entity.Client;

@Service

public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao clientDao;

//------------------------- return list of clients ------------------
	/**
	 * renvoie la liste des clients: fait appel a la couche Dao
	 * 
	 * @return la liste de tous les clients
	 */
	@Override
	@Transactional
	public List<Client> getClients() {

		return clientDao.getClients();
	}

//------------------------- saveClient -------------------------
	/**
	 * enregistre le nouveau client entré en parametre
	 * 
	 * @param le nouveau client a enregistrer
	 */
	@Override
	@Transactional
	public void saveClient(Client client) {
		clientDao.saveClient(client);
	}

//------------------------ getClient(id) ------------------------------
	/**
	 * récupére le client avec l'identifiant donné dans la bdd
	 * 
	 * @param l'id de la bdd
	 * @return l'objet client correspondant à l'id donné
	 */
	@Override
	@Transactional
	public Client getClient(Long id) {
		return clientDao.getClient(id);
	}

//----------------------- delete a client with id---------------------------
	/**
	 * Supprime le client avec l'id correspondant dans la bdd
	 * 
	 * @param id du client a supprimer
	 */
	@Override
	@Transactional
	public void deleteClient(Long id) {
		clientDao.deleteClient(id);
	}

//----------------------- delete all clients --------------------------------
	@Override
	public void deleteAllClients() {
		clientDao.deleteAllClients();
	}

}
