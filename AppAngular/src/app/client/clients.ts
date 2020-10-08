import {Client} from './client';

export const Clients: Client[] = [
    { id: 1, photo: 'doriandelaval.png', nom: 'delaval', prenom: 'dorian',
    nomSociete: 'htsp-services', adresse: '26 avenue maréchal foch', ville: 'cassis',
    codePostal: '13260', dateContact: new Date(2019, 12, 25), email: 'delaval.htps@gmail.com',
    etatCustomer: 'C', numeroTel: '618460160', commentaire: 'entré avec angular dans le AppComponent'},
    { id: 2, photo: 'business-woman.png', nom: 'delacourt', prenom: 'Joséphine',
    nomSociete: 'btp-services', adresse: '45 avenue maréchal foch', ville: 'Marseille',
    codePostal: '13008', dateContact: new Date(2010, 12 , 3), email: 'joséphinedelacourt@gmail.com',
    etatCustomer: 'P', numeroTel: '618452360', commentaire: 'entrée avec angular dans le AppComponent'},
    { id: 3, photo: 'business-woman2.png', nom: 'delamer', prenom: 'doriane',
    nomSociete: 'htsp-construction', adresse: '52 avenue maréchal foch', ville: 'Cassis',
    codePostal: '13260', dateContact: new Date(2000, 4 , 1), email: 'delamerdoriane@gmail.com',
    etatCustomer: 'F', numeroTel: '612457823', commentaire: 'entré encore une fois avec angular dans le AppComponent'}
  ];


