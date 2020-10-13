import { ClientFormComponent } from './../client-form/client-form.component';
import { ClientService } from '../client-service/client.service';
import { ClientRoutingModule } from './client-routing.module';
import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ListClientComponent } from '../list-client/list-client.component';
import { SelectClientComponent } from '../select-client/select-client.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  imports: [CommonModule, FormsModule, ClientRoutingModule],
  declarations: [
    ListClientComponent,
    SelectClientComponent,
    ClientFormComponent,
  ],
  providers: [ClientService],
})
export class ClientModule {}
