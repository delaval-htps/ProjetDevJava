package fr.doriandelaval.dao;

import java.util.List;

import fr.doriandelaval.entity.Client;

public interface ClientDao {

	List<Client> getClients();

	void saveClient(Client client);

	Client getClient(Long id);

	void deleteClient(Long id);

	void deleteAllClients();

}
