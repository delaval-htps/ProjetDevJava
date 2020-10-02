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

	@GetMapping("/form")
	public String update(@RequestParam("id") int id, Model model) {
		model.addAttribute("updateClient", clientService.getClient(id));
		return ("updateClient");
	}

	@PostMapping("/update")
	public String updateForm(@ModelAttribute("updateClient") Client client, @RequestParam("id") int id) {

		//
		return ("listClient");
	}

}