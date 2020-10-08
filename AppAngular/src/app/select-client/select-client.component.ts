import { Clients } from './../client/clients';
import { Client } from './../client/client';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-select-client',
  templateUrl: './select-client.component.html',
  styleUrls: ['./select-client.component.css'],
})
export class SelectClientComponent implements OnInit {
  // on charge la listes des clients dans variable clients
  // on crée une variable selectClient de type Client
  clients: Client[];
  selectClient: Client;

  // injection d'une ActivatedRoute et d'un Router via le constructeur !
  constructor(private route: ActivatedRoute, private router: Router) {}

  ngOnInit(): void {
    // on initialise la variables clients avec la liste de clients que l'on a grace a la classe Clients.ts
    // pour pouvoir vérifier si l'id du client selectionné est bien présent dans la liste
    // c'est pour ca qu'on déclare une variable id , laquelle on l'initialise avec l'id du client selectionné dans list-client-component
    this.clients = Clients;
    const id = +this.route.snapshot.paramMap.get('id');

    // on parcours la liste des clients et si l'id corresponds a un id d'un des clients
    // alors la variable selectClient recoie comme valeur le client sélectionné
    // tslint:disable-next-line: prefer-for-of
    for (let index = 0; index < this.clients.length; index++) {
      // tslint:disable-next-line: triple-equals
      if (this.clients[index].id == id) {
        this.selectClient = this.clients[index];
      }
    }
  }

  goBack(): void {
    this.router.navigate(['/clients']);
  }
}
