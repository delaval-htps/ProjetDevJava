package fr.doriandelaval.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * classe de connexion a la base de données SQL. Elle teste avec une methode
 * main si la connexion s'établie entre la bdd et l'application
 * 
 * @author delaval
 *
 */
public class Connexion {
	/**
	 * methode main de connexion
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * url de connexion a la bdd
		 */
		String jdbcUrl = "jdbc:mysql://localhost:3306/ProjetDevJava?useSSL=false&serverTimezone=UTC";
		/**
		 * nom d'utilisateur de la bdd
		 */
		String user = "delaval";
		/**
		 * mdp d'utilisateur de la bdd
		 */
		String password = "Jsadmin4all";

		try {

			@SuppressWarnings("unused")
			Connection connexion = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("connexion réussie !");

		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

}
