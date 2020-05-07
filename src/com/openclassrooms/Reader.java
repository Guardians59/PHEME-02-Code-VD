package com.openclassrooms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * La classe Reader nous permet de lire le fichier source et d'intégrer ses
 * données dans une ArrayList.
 * 
 * @author Dylan
 *
 */

public class Reader implements IReader {

	/*
	 * filePath sera le fichier source.
	 * 
	 * line sont les lignes du fichier source.
	 */

	private String filePath;
	private String line;

	/**
	 * Constructeur Reader
	 * 
	 * @param filePath fichier source.
	 * 
	 * 
	 */
	public Reader(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * Récupère le chemin du fichier source.
	 * 
	 * @return le chemin du fichier source.
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * Initie le chemin du fichier source.
	 * 
	 * @param filePath fichier source.
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * Retourne la liste des symptômes recensés.
	 * 
	 * @return Une ArrayList des symptômes recensés.
	 * 
	 * @throws IOException Il ya un flux d'entrée.
	 */
	public ArrayList<String> getListReader() throws IOException {

		// Initie une ArrayList qui va récupérer les symptômes.

		ArrayList<String> result = new ArrayList<String>();

		// Fais appel à la classe BufferedReader pour lire le fichier source.

		BufferedReader reader = new BufferedReader(new FileReader(getFilePath()));
		line = reader.readLine();

		/*
		 * Si le fichier n'est pas vide, il effectue une boucle afin d'ajouter dans
		 * l'ArrayList toutes les lignes qu'il trouve dans le fichier lu
		 * 
		 * Capture l'exception possible
		 * 
		 * Ferme le fichier une fois l'opération fini ou si l'erreur est rencontrée
		 * 
		 * Retourne le resultat
		 */

		if (filePath != null) {
			try {

				while (line != null) {

					result.add(line);
					line = reader.readLine();
				}

			}

			catch (IOException e) {
				e.printStackTrace();
			}

			finally {
				reader.close();
			}

		}

		return result;
	}

}
