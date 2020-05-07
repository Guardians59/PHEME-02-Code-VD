package com.openclassrooms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * La classe Main est le lancement du programme.
 * 
 * @author Dylan
 *
 */

public class Main {
	/**
	 * La méthode main permet de:
	 * 
	 * <ul>
	 * <li>Initier l'objet Reader afin de récupérer les données du fichier source et
	 * de l'intégrer dans une ArrayList.</li>
	 * <li>Initier l'objet Counter pour intégrer l'ArrayList dans une TreeMap afin
	 * de recenser les occurences par ordre alphabétique</li>
	 * <li>Initier l'objet Writer pour récupérer la TreeMap et écrire les résultats
	 * dans le fichier de sortie</li>
	 * </ul>
	 * 
	 * @see Reader
	 * @see Counter
	 * @see Writer
	 * 
	 * @param args permet de choisir les ressources lors du lancement du programme.
	 * @throws IOException il y a un flux d'entrée et de sortie.
	 */

	public static void main(String[] args) throws IOException {

		IReader reader = new Reader(args[0]);
		ArrayList<String> symptomsList = reader.getListReader();

		ICounter counter = new Counter();
		TreeMap<String, Integer> countSymptoms = counter.getMapCensusCount(symptomsList);

		IWriter writer = new Writer(args[1]);
		Map<String, Integer> countWriter = writer.getMapCensusCountWriter(countSymptoms);
		System.out.println(countWriter);

	}

}
