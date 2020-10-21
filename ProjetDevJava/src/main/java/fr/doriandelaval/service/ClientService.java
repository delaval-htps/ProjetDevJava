package fr.doriandelaval.service;

import java.util.List;

import fr.doriandelaval.entity.Client;

public interface ClientService {

	List<Client> getClients();

	void saveClient(Client client);

	void deleteClient(Long id);

	Client getClient(Long id);

	void deleteAllClients();

}
