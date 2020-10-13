import { ClientService } from '../client-service/client.service';
import { Client } from './../client/client';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-select-client',
  templateUrl: './select-client.component.html',
  styleUrls: ['./select-client.component.css'],
  providers: [],
})
export class SelectClientComponent implements OnInit {
  // on crée une variable selectClient de type Client

  selectClient: Client;

  // injection d'une ActivatedRoute et d'un Router via le constructeur !
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private clientService: ClientService
  ) {}

  ngOnInit(): void {
    //grace a l'injection du service par le constructeur
    const id = +this.route.snapshot.paramMap.get('id');
    this.selectClient = this.clientService.getClientById(id);
  }

  //bouton modifier client
  updateClient(): void {
    let link = ['/clientForm', this.selectClient.id];
    this.router.navigate(link);
  }

  goBack(): void {
    this.router.navigate(['/clients']);
  }
}
