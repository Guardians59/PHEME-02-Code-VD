package com.openclassrooms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * La classe Reader nous permet de lire le fichier source et d'int�grer ses
 * donn�es dans une ArrayList.
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
	 * R�cup�re le chemin du fichier source.
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
	 * Retourne la liste des sympt�mes recens�s.
	 * 
	 * @return Une ArrayList des sympt�mes recens�s.
	 * 
	 * @throws IOException Il ya un flux d'entr�e.
	 */
	public ArrayList<String> getListReader() throws IOException {

		// Initie une ArrayList qui va r�cup�rer les sympt�mes.

		ArrayList<String> result = new ArrayList<String>();

		// Fais appel � la classe BufferedReader pour lire le fichier source.

		BufferedReader reader = new BufferedReader(new FileReader(getFilePath()));
		line = reader.readLine();

		/*
		 * Si le fichier n'est pas vide, il effectue une boucle afin d'ajouter dans
		 * l'ArrayList toutes les lignes qu'il trouve dans le fichier lu
		 * 
		 * Capture l'exception possible
		 * 
		 * Ferme le fichier une fois l'op�ration fini ou si l'erreur est rencontr�e
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
