import { ClientFormComponent } from './../client-form/client-form.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListClientComponent } from '../list-client/list-client.component';
import { SelectClientComponent } from '../select-client/select-client.component';

const clientRoutes: Routes = [
  { path: 'clients', component: ListClientComponent },
  { path: 'client/:id', component: SelectClientComponent },
  { path: 'clientForm/:id', component: ClientFormComponent },
];

@NgModule({
  imports: [RouterModule.forChild(clientRoutes)],
  exports: [RouterModule],
})
export class ClientRoutingModule {}
