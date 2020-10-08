import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListClientComponent } from './list-client/list-client.component';
import { SelectClientComponent } from './select-client/select-client.component';

const routes: Routes = [
  { path: 'clients', component: ListClientComponent },
  { path: 'client/:id', component: SelectClientComponent },
  { path: '', redirectTo: 'clients', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
