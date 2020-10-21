*********
hibernate
*********

une erreur monumentale !!!

HQL works with the class names not with table names!

So you have to write:

List<GifModel> textList = session.createQuery("from GifModel").list();

Can not set char field fr.doriandelaval.entity.Client.etatCustomer to null value

databinding hibernate Spring
****************************

databinding 
===========

databinding avec spring avec **@ModelAttribut("String de désignation", class instance)**  en parametre pour directement recupérer dans une jsp un client a updater ou un nouveau client.

.. code-block:: java

    @PostMapping("/update")
    public String updateForm(@ModelAttribute("updateClient") Client client) {
        clientService.saveClient(client);
        return ("redirect:/client/list");
    }

.. note:: Ne pas oublier d'utiliser les tags <form:form> de spring avec modelAttribut pour faire le binding !


.. code-block:: html 

    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <form:form action="processForm" modelAttribute="utilisateur" >
    Prénom: <form:input path="prenom" />
    <br><br>
    Nom: <form:input path="nom" />
    <br><br>
    <input type="submit" value="valider"/>
    </form:form>

il faut donc pour persister des modification ou un nouveeu client :
* une methode qui renvoie le formulaire pour updater un client : elle a besoin de d'un parametre qui est l'id du client a modifier 
  
   .. code-block:: java

    /**
     >* retourne le formulaire d'un client sélectionné dans la liste client avec son
     * id récupéré: champ prérempli avec les elements du client selectionné
     * 
     * @param id
     * @param model
     * @return la jsp formulaire pour modifier le client
     */
    @GetMapping("/formClientId")
    public String updateClient(@RequestParam("id") int id, Model model) {
        model.addAttribute("updateClient", clientService.getClient(id));
        return ("updateClient");
    }

* une methode qui renvoie également le formulaire mais qui va créer un nouveau client avant pour le transmettre a la jsp: 
  
   .. code-block:: java

    /**
     >* retourne le formulaire pour un nouveau client  
     * 
     * @param model
     * @return la jsp formulaire pour modifier le nouveau client
     */
    @GetMapping("/formNewClient")
    public String createClient(Model model) {
        model.addAttribute("updateClient", new Client());
        return ("updateClient");
    }


 .. warning:: 
    ne pas oublier de passer dans la jsp le champ id en caché pour que spring puisse redonner l'id a hibernate avec le saveOrUpdate sinon id =0 lorsqu'on veut juste modifer et pas save.

<!-- permet de donner l'id du client en databinding avec modelAttribut sans ca l'id est automatiquement mis a zero -
<form:input
type="hidden"
path="id"
/>

il en est de meme avec les photos si le champ n'est pas renseigné en form:input alors la photo est perdue !!!!!!!

couche DAO :
============
 .. warning:: pour ne pas perdre le databinding pour les deux methodes j'utilise la denomination  "updateClient" parceque j'utilise la meme metode updateForm qui utilise en parametre ce updateclietn



* hibernate permet d'utiliser la methode SaveOrUpdate avec spring pour persister les clients ! 

* probleme de parse entre integer et character et la datetime 

validation des données pour formulaire
======================================

* utilisation des annotaions dans la classe Entity
* utilisation d'un init binding danqs le controlleur
* modifications de la jsp avec un <form:errors>
* modification du controlleur dans le mapping de formulaire : parametre supplementaire binding result

The above error occurs with hibernate validator, need to pay attention

@NotNull and @NotEmpty and @NotBlank

@NotEmpty is used on the collection class
@NotBlank is used on String
@NotNull is used on basic types

@NotNull(message = "champ obligatoire")
@Digits(fraction = 0, integer = 9, message = "le numéro de tel doit être composé de 9 chiffres hors indicatif")
@Length(min = 9, message = "le numéro de tel doit être composé de 9 chiffres hors indicatif")
@Column
private String numeroTel;
If you use NotEmpty or NotBlank on the base type, the above error will occur.


