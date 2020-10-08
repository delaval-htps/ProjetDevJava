import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ListClientComponent } from '../list-client/list-client.component';
import { SelectClientComponent } from '../select-client/select-client.component';

@NgModule({
  imports: [CommonModule],
  declarations: [ListClientComponent, SelectClientComponent],
  providers: [],
})
export class ClientModule {}
