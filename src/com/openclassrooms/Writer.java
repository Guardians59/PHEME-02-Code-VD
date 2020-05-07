package com.openclassrooms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * La classe Writer permet de récupèrer une TreeMap et d'écrire ses résultats
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
	 * Récupère le fichier de sortie.
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
	 * Retourne une Map qui sera écrite dans le fichier de sortie.
	 * 
	 * @return Map des résultats.
	 * @param mapWriter la TreeMap qui recense les occurences.
	 * @throws IOException il y a un flux de sortie.
	 */

	public Map<String, Integer> getMapCensusCountWriter(TreeMap<String, Integer> mapWriter) throws IOException {

		// Initie le fileWriter pour écrire les résultats dans le fichier de sortie.

		FileWriter writer = new FileWriter(getFileOutPut());
		try {

			/*
			 * Utilise l'interface Entry pour récupérer les données de la map.
			 * 
			 * Chaque occurence est écrite avec leurs valeurs respectives.
			 * 
			 * Capture l'exception possible.
			 * 
			 * Ferme le fichier une fois l'opération terminée ou si l'erreur est rencontrée.
			 * 
			 * Retourne le résultat de la TreeMap.
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
