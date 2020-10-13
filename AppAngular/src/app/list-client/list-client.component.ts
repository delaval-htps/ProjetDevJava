import { ClientService } from '../client-service/client.service';
import { Client } from './../client/client';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-client',
  templateUrl: './list-client.component.html',
  styleUrls: ['./list-client.component.css'],
  providers: [],
})
export class ListClientComponent implements OnInit {
  // liste des clients vierge
  clients: Client[];

  //injection du router et du clientService par constructeur
  constructor(private router: Router, private clientService: ClientService) {}

  // on récupére la liste des clients
  ngOnInit(): void {
    this.clients = this.clientService.getClients();
  }

  selectClient(client: Client): void {
    console.log('vous avez séléctionné le client: ' + client.nom);
    const link = ['/client', client.id];
    this.router.navigate(link);
  }
}
