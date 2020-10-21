*******
Angular
*******

utilisation de angular CLI pour mettre en place le projet:
 .. code-block:: bash
    ng new AppAngular

installe a la racine du dossier AppAngular la configuration suivante:


Configuration de base:
**********************

* /package.json: (scripts et dependances )
* /bs-config.json (lite server local, src,chemin node-module)
* src/tsconfig.json (conf du compiler)
* src/systemjs.config.js (map, app, mapping librairies )

Struture de l' application:
***************************

Racine du dossier application
=============================

* src/app dossier source de l'application
  * src/app/app.component.ts: Composant racine en typescript.
     .. code-block:: ts

         >mport { Component } from '@angular/core';
         @Component({
         selector: 'root',
         template: `<h1>Hello {{name}}</h1>`,
         })
         export class AppComponent { name = 'Angular'; }

  * src/app/app.module.ts : Module racine de l'application
    .. code-block:: ts
        import { NgModule } from '@angular/core';
        import { BrowserModule } from '@angular/platform-browser';
        import { AppComponent } from './app.component';
        @NgModule({
        imports: [ BrowserModule ],
        declarations: [ AppComponent ],
        bootstrap: [ AppComponent ]
        })
        export class AppModule { }

Point Entrée
============

* src/main.ts dossier de point d'entrée de la'application
    .. code-block:: ts
        import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
        import { AppModule } from './app/app.module';
        platformBrowserDynamic().bootstrapModule(AppModule).catch(err =>
        console.log(err));


Fichier Html d'insertion de notre application
=============================================

* src/index.html

Séquence de démarrage:

faire un schéma !!!!!

