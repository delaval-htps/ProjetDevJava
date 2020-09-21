*******************************************************************
Description des besoins de l'Application
*******************************************************************

Expression des Besoins
**********************

L'objectif de ce projet est donc de produire un outil permettant aux PME de gérer et inserer dans leur système les articles ou services qu'elle propose, de gerer d'anciens et nouveaux clients ou prospect, ainsi que de fournir devis et factures pour ces derniers.

Pour un \ **client** \ ,les informations que l'on souhaite stockées sont:

 * un numéro d'identifiant
 * un nom de société 
 * un nom
 * un prénom
 * une adresse
 * un code postal
 * une ville
 * un numéro de téléphone
 * une adresse mail
 * s'il est client, prospect ou, s'il s'agit d'un fournisseur
 * une date de contact 
 * un commentaire pour une breve description

Pour les \ **articles et services** \, on souhaite stocker les informations suivantes:
 * un numéro d'identification (une reférence)
 * l'appartenance à une catégorie
 * une désignation (descriptif bref de l'article)
 * une description détaillé de l'article
 * une quantité à vendre ( unité de vente)
 * un prix à l'unité HT
 * une tva à appliquer à l'article
 * un prix à l'unité TTC
 * un stock disponible ou non

Pour les \ **devis** \ , la PME souhaite avoir comme information
 * un numéro d'identification
 * la date du devis
 * les informations du clients
 * l'adresse du client
 * la liste des articles necessaires
 * le montant de chaque articles
 * les quantités pour chaque articles en fonction de l'unité de vente
 * le montant global pour chaque article
 * le montant total HT
 * la tva appliquable
 * le montant total TTC
 * le moyen de paiement: espece, carte, cheque
 * le delai de paiement: comptant,acompte 
 * la validation, le refus ou attente de la part du client.

Pour les \ **factures** \, on aura a peu près les mêmes informations, ie:
 * un numéro d'identification
 * la date de la facturation
 * la date de paiement
 * les informations du clients
 * l'adresse du client
 * l'adresse de livraison
 * la liste des articles vendus
 * le montant de chaque articles
 * les quantités pour chaque articles en fonction de l'unité de vente
 * le montant global pour chaque article
 * le montant total HT
 * la tva appliquable
 * le montant total TTC
 * l'état de la facture: payé ou en attente


Product Backlog
***************

Voici une liste non-exhaustive des fonctionnalités attendues d'une PME avec une telle application. Le temps m'étant compté, j'ai décidé de travailler avec une méthodologie Scrum pour pouvoir avancer le plus possible et rendre, même si je n'ai pas tout accompli, un projet présentable et fonctionnel.

Pour la \ **"section Client"** \ 

*En tant qu'utilisateur*, je souhaite pouvoir afficher soit le listing de tous mes clients, soit de mes  prospects, soit celui de mes fournisseurs. 

*En tant qu'utilisateur*, je souhaite pouvoir, une fois mon listing afficher, selectionner un de mes contacts (client/prospect/fournisseur) et avoir une vue sur toutes ses propriétés. 

*En tant qu'utilisateur*, je souhaite pouvoir une fois mon listing afficher, modifier ou supprimer le contact que j'aurai sélectionné. 


\ **En tant qu'utilisateur** \, je souhaite pouvoir afficher le listing de tous mes articles/services.
\ **En tant qu'utilisateur** \, je souhaite pouvoir afficher le listing de tous mes devis.
\ **En tant qu'utilisateur** \, je souhaite pouvoir afficher le listing de toutes mes factures.
