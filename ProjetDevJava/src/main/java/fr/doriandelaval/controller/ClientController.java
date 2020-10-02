package fr.doriandelaval.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.doriandelaval.entity.Client;
import fr.doriandelaval.service.ClientService;

/**
 * controller dédié a la gestion des clients avec comme mapping URL: /Client
 * 
 * @author delaval
 *
 */

@Controller // determine que cette class est un controlleur
@RequestMapping("client") // URI de référence pour ce controlleur

public class ClientController {

	@Autowired // injection de dépendance du clientService dans la classe pour pouvoir utiliser
				// ses methodes ( instance de type interface ClientService)

	private ClientService clientService;

	/**
	 * URL mapping : /list . Renvoie la liste de tous les clients
	 * 
	 * @param model de type Model de SpringFramework permet de récupérer la liste
	 *              des clients et ainsi pouvir l'utiliser dans la jsp
	 * @return "listClient" le nom de la jsp qui affiche la liste des clients
	 */

	@GetMapping("/list")

	public String listClient(Model model) {
		System.out.println("entree dans le mapping !");
		List<Client> clients = clientService.getClients();

		model.addAttribute("clients", clients);
		for (Client client : clients) {
			System.out.println(client);
		}

		return ("listClient");
	}

	/**
	 * renvoie la page selectClient.jsp avec dans le model le client ayant pour id
	 * l'id entré en paramétre qui est un @RequestParam
	 * 
	 * @param id
	 * @param model
	 * @return le nom de la jsp selectClient pour afficher ce client
	 */
	@GetMapping("/select")
	public String select(@RequestParam("id") int id, Model model) {
		model.addAttribute("selectClient", clientService.getClient(id));
		return ("selectClient");
	}

	/**
	 * retourne le formulaire d'un client sélectionné dans la liste client avec son
	 * id récupéré: champ prérempli avec les elements du client selectionné pret
	 * pour les modifications
	 * 
	 * @param id    la methode a besoin de l'id pour récupérer dans la liste e
	 *              client le client en question
	 * @param model permet de transmettre les informations à la jsp
	 * @return la jsp formulaire pour modifier le client
	 */
	@GetMapping("/formClientId")
	public String updateClient(@RequestParam("id") int id, Model model) {
		model.addAttribute("updateClient", clientService.getClient(id));
		return ("updateClient");
	}

	/**
	 * methode retournant le formulaire pour créer un nouveau client
	 * 
	 * @param model pour passer à la jsp un nouveau client
	 * @return la jsp correspondant au formulaire
	 */
	@GetMapping("/formNewClient")
	public String createClient(Model model) {
		model.addAttribute("updateClient", new Client());
		return ("updateClient");
	}

	/**
	 * retour de validation du formulaire de modification d'un client method post
	 * 
	 * @param client : paramétre permettant de d'utiliser les tags form:from de
	 *               spring et hydrater directement le client ( creation du client
	 *               implicite )
	 * 
	 * @return la jsp de la liste des clients ainsi modifiée ( redirection )
	 */
	@PostMapping("/update")
	public String updateForm(@ModelAttribute("updateClient") Client client) {

		clientService.saveClient(client);

		return ("redirect:/client/list");
	}

	/**
	 * supprime le client avec l'id entré en parametre
	 * 
	 * @param id
	 * @return la jsp qui affiche la liste de client (redirection)
	 */
	@GetMapping("/delete")
	public String deleteClient(@RequestParam("id") int id) {
		clientService.deleteClient(id);
		return ("redirect:/client/list");
	}

}