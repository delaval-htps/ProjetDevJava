package fr.doriandelaval.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.doriandelaval.entity.Client;
import fr.doriandelaval.service.ClientService;

/**
 * controller dédié a la gestion des clients avec comme mapping URL: /Client
 * 
 * @author delaval
 *
 */

@Controller
//@ComponentScan (basePackages = "fr.doriandelaval")
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping("/test")
	public String test() {
		return ("test");
	}

	/**
	 * URL mapping : /list . Renvoie la liste de tous les clients pren
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
}
