import { Injectable } from '@angular/core';
import { Client } from '../client/client';
import { Clients } from '../client/clients';

@Injectable()
export class ClientService {
  // retourne la liste des clients stocké en const dans la classe Clients
  getClients(): Client[] {
    return Clients;
  }

  // on verifie si l'id est dans la liste des clients si ok on retourne le client si ko rien
  getClientById(id: number): Client {
    let clients = this.getClients();
    let selectedClient: Client = null;

    clients.forEach((client) => {
      if (client.id == id) {
        selectedClient = client;
      }
    });
    return selectedClient;
  }
}
