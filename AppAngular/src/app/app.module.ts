import { ClientModule } from './client/client.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ClientServiceComponent } from './client-service/client-service.component';

@NgModule({
  declarations: [AppComponent, ClientServiceComponent],
  imports: [BrowserModule, AppRoutingModule, ClientModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
