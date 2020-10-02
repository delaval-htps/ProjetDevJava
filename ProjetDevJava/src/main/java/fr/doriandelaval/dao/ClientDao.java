package fr.doriandelaval.dao;

import java.util.List;

import fr.doriandelaval.entity.Client;

public interface ClientDao {

	List<Client> getClients();

	void saveClient(Client client);

	Client getClient(int id);

	void deleteClient(int id);

}
