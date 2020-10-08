import { Clients } from './../client/clients';
import { Client } from './../client/client';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-client',
  templateUrl: './list-client.component.html',
  styleUrls: ['./list-client.component.css'],
})
export class ListClientComponent implements OnInit {
  // liste des clients vierge
  clients: Client[];

  constructor(private router: Router) {}

  // on récupére la liste des clients
  ngOnInit(): void {
    this.clients = Clients;
  }

  selectClient(client: Client): void {
    console.log('vous avez séléctionné le client: ' + client.nom);
    const link = ['/client', client.id];
    this.router.navigate(link);
  }
}
