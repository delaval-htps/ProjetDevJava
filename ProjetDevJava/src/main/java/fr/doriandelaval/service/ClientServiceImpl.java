package fr.doriandelaval.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.doriandelaval.dao.ClientDao;
import fr.doriandelaval.entity.Client;

@Service

public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientDao clientDao;
	
	/**
	 * renvoie la liste des clients: fait appel a la couche Dao
	 * @return la liste de tous les clients
	 */
	@Override
	@Transactional
	public List<Client> getClients() {
		
		return clientDao.getClients();
	}
	
	

}
