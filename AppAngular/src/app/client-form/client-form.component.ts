import { ClientService } from './../client-service/client.service';
import { Client } from './../client/client';
import { Component, Input, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-client-form',
  templateUrl: './client-form.component.html',
  styleUrls: ['./client-form.component.css'],
})
export class ClientFormComponent implements OnInit {
  @Input() client: Client; // propriété d'entrée du composant

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private clientService: ClientService
  ) {}

  ngOnInit(): void {
    const id: number = this.route.snapshot.params.id;
    this.client = this.clientService.getClientById(id);
  }

  // La méthode appelée lorsque le formulaire est soumis.
  onSubmit(): void {
    console.log('Submit form !');
    let link = ['/client', this.client.id];
    this.router.navigate(link);
  }
}
