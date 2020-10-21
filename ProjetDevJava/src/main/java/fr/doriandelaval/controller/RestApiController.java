package fr.doriandelaval.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.doriandelaval.entity.Client;
import fr.doriandelaval.exception.ClientNotFoundException;
import fr.doriandelaval.service.ClientService;

@RestController
@RequestMapping("api")
public class RestApiController {

	@Autowired
	private ClientService clientService;

//-------------------------- Retrieve all clients-----------------------
	/**
	 * retourne la liste des clients en format json grace a la dependance jackson
	 * pour formater la classe client (POJO) en fichier json
	 * 
	 * @return la liste de tous les clients
	 */
	@GetMapping("/client")
	public List<Client> getClients() {
		return clientService.getClients();
	}

//-------------------------- Retrieve one client By id------------------------
	/**
	 * retourne le client selectionné par son id passé en parametre en GET sous
	 * forme de fichier json grace à jackson
	 * 
	 * @param clientId le @PathVariable donné en parametre dans la request get
	 * @return le client avec l'id donnée en param dans la requete get
	 */
	@GetMapping("/client/{id}")
	public Client getClientById(@PathVariable(name = "id") Long clientId) {

		Client client = clientService.getClient(clientId);

		if (client != null)
			return client;
		else
			throw new ClientNotFoundException("le client avec l'id: " + clientId + " n'est pas dans la liste");
	}

//---------------------- create a client method post ---------------------------
	/**
	 * enregistre un nouveau client entré en version fichier json
	 * 
	 * @param client le nouveau client sous format json a enregistrer
	 */
	@PostMapping("/client")
	public void createClient(@RequestBody Client client) {

		clientService.saveClient(client);
	}

//---------------------- update a client methode PUT ------------------------------
	/**
	 * modifie le client de la bdd avec l'id donnée en parametre de la requete avec
	 * les valeurs données sous format json ne pas oublier de renseigner également
	 * les données non null nom prénom numéroTel et dateContact: obligatoire
	 * 
	 * @param id     identifiant du client a modifer passé en parametre de la
	 *               requete
	 * @param client les données du client a modifer + celles non nul obligatoire
	 */
	@PutMapping("/client/{id}")
	public void updateClient(@PathVariable("id") long id, @RequestBody Client client) {

		Client currentClient = clientService.getClient(id);

//		System.out.println("**********PutMapping:updateClient by id***********");
//		System.out.println(" id client: " + currentClient.getId() + " nom client:" + currentClient.getNom());

		if (currentClient != null) {
			// on donne l'id du client que l'on veut modifier au nouveau client pour que le
			// saveOrUpdate de la couche DAO puisse savoir si que c'est un update sinon il
			// fait
			// un save ! surtout si on ne modifie pas l'id dans le put ...
			client.setId(id);
			clientService.saveClient(client);

		} else
			throw new ClientNotFoundException("le client a modifier avec l'Id: " + id + " n'est pas dans la liste");
	}

//----------------------- delete client by id ------------------------------------
	/**
	 * suppression du client avec l'id donné en parametre de la requete
	 * 
	 * @param id identifiant du client a supprimer donné en parametre de la requete
	 */
	@DeleteMapping("/client/{id}")
	public void deleteClient(@PathVariable("id") long id) {

		Client currentClient = clientService.getClient(id);

		if (currentClient != null)
			clientService.deleteClient(id);
		else
			throw new ClientNotFoundException("le client a effacer avec l'Id " + id + " n'est pas dans la liste");
	}

//------------------------ delete all client -------------------------------------
	/**
	 * supprime tous les clients de la bdd
	 */
	@DeleteMapping("/client")
	public void deleteAllClients() {

		clientService.deleteAllClients();

	}

}
