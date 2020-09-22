package fr.doriandelaval.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * class Entité Client: représente la classe Client en bdd SQL avec toutes les
 * colonnes correspondantes
 * 
 * @author delaval
 *
 */
@Entity // permet de faire le lien avec la table client dans la bdd
@Table(name = "client")
public class Client {

//attributs

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@Column
	private String nomSociete;

	@Column
	private String nom;

	@Column
	private String prenom;

	@Column
	private String adresse;

	@Column
	private int codePostal;

	@Column
	private String ville;

	@Column
	private int numeroTel;

	@Column
	private String email;
	/*
	 * catégorie du contact soit un client 'C' soit un Prospect 'P' soit un
	 * fournisseur 'F'
	 */

	@Column
	private char etatCustomer;
	/*
	 * date de première prise de contact avec le client
	 */

	@Column
	private Date dateContact;
	/*
	 * commentaire perso au sujet du client
	 */

	@Column
	private String commentaire;

	// constructeur

	public Client() {

	}

	// getter & setters

	/**
	 * retourne l'id du client
	 * 
	 * @return int id
	 */
	public int getId() {
		return id;
	}

	/**
	 * donne un id au client selectionné celui en parametre
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * retourne le nom de la société du contact
	 * 
	 * @return nom de la société
	 */
	public String getNomSociete() {
		return nomSociete;
	}

	/**
	 * change le nom de la société du client par celui donner en parametre
	 * 
	 * @param nomSociete
	 */
	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}

	/**
	 * retourne le nom du client
	 * 
	 * @return nom du client
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * change le nom du client par celui donner en parametre
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * retourne le prenom du client
	 * 
	 * @return prenom du client
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * change le prenom du client par celui en parametre
	 * 
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * retourne l'adresse du client
	 * 
	 * @return l'adresse du client
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * change l'adresse du client par celui donné en parametre
	 * 
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * retourne le code postal de la ville de résidence du client
	 * 
	 * @return code postal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * change le code postal du client par celui donné en parametre
	 * 
	 * @param codePostal
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * retourne la ville de residence du client
	 * 
	 * @return ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * change la ville de résidence du client par celui en parametre
	 * 
	 * @param ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * retoune le numero de tel du client
	 * 
	 * @return numero de téléphone
	 */
	public int getNumeroTel() {
		return numeroTel;
	}

	/**
	 * change le numéro de téléphone du client avec celui en parametre
	 * 
	 * @param numeroTel
	 */
	public void setNumeroTel(int numeroTel) {
		this.numeroTel = numeroTel;
	}

	/**
	 * retourne l'adresse mail du client
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * change l'adresse mail du client par celle en parametre
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * donne le status du client le client est soit : 'C' pour le status client 'P'
	 * pour le status prospect 'F' pour le status fournisseur
	 * 
	 * @return status du client
	 */
	public char getEtatCustomer() {
		return etatCustomer;
	}

	/**
	 * change le status du client le client avec le parametre soit : 'C' pour le
	 * status client 'P' pour le status prospect 'F' pour le status fournisseur
	 */

	public void setEtatCustomer(char etatCustomer) {
		this.etatCustomer = etatCustomer;
	}

	/**
	 * retourne la date de la première prise de contact avec le client
	 * 
	 * @return date de contact
	 */
	public Date getDateContact() {
		return dateContact;
	}

	/**
	 * change la date de première prise de contact avec le client
	 * 
	 * @param dateContact
	 */
	public void setDateContact(Date dateContact) {
		this.dateContact = dateContact;
	}

	/**
	 * retourne le commentaire de 255 caractéres laissé au sujet du client
	 * 
	 * @return commentaire sur client
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * change le commentaire de 255 caracteres au sujet du client
	 * 
	 * @param commentaire
	 */
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

}
