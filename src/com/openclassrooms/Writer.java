package com.openclassrooms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * La classe Writer permet de r�cup�rer une TreeMap et d'�crire ses r�sultats
 * dans le fichier de sortie.
 * 
 * @author Dylan
 *
 */

public class Writer implements IWriter {
	/*
	 * fileOutPut sera le fichier de sortie.
	 */

	private String fileOutPut;

	/**
	 * Constructeur Writer
	 * 
	 * @param fileOutPut fichier de sortie.
	 *
	 */
	public Writer(String fileOutPut) {

		this.fileOutPut = fileOutPut;
	}

	/**
	 * R�cup�re le fichier de sortie.
	 * 
	 * @return fichier de sortie.
	 */
	public String getFileOutPut() {
		return fileOutPut;
	}

	/**
	 * Initie le chemin du fichier de sortie.
	 * 
	 * @param fileOutPut fichier de sortie.
	 */
	public void setFileOutPut(String fileOutPut) {
		this.fileOutPut = fileOutPut;
	}

	/**
	 * Retourne une Map qui sera �crite dans le fichier de sortie.
	 * 
	 * @return Map des r�sultats.
	 * @param mapWriter la TreeMap qui recense les occurences.
	 * @throws IOException il y a un flux de sortie.
	 */

	public Map<String, Integer> getMapCensusCountWriter(TreeMap<String, Integer> mapWriter) throws IOException {

		// Initie le fileWriter pour �crire les r�sultats dans le fichier de sortie.

		FileWriter writer = new FileWriter(getFileOutPut());
		try {

			/*
			 * Utilise l'interface Entry pour r�cup�rer les donn�es de la map.
			 * 
			 * Chaque occurence est �crite avec leurs valeurs respectives.
			 * 
			 * Capture l'exception possible.
			 * 
			 * Ferme le fichier une fois l'op�ration termin�e ou si l'erreur est rencontr�e.
			 * 
			 * Retourne le r�sultat de la TreeMap.
			 */

			for (Map.Entry<String, Integer> entry : mapWriter.entrySet()) {

				writer.write(entry.getKey() + " = " + entry.getValue() + " , ");

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {

			writer.close();
		}

		return mapWriter;

	}
}
