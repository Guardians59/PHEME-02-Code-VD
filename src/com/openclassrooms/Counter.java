package com.openclassrooms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * La classe Counter permet de récupérer une ArrayList et de l'intégrer dans une
 * TreeMap, afin de recenser les occurences par ordre alphabétique.
 * 
 * @author Dylan
 *
 */

public class Counter implements ICounter {
	/*
	 * key sera les occurences recensées.
	 * 
	 * oldValue les valeurs trouvés au fil de l'itérateur.
	 * 
	 * valueCount les valeurs finales de chaque occurence.
	 */

	private String key;
	private int oldValue;
	private int valueCount;

	/**
	 * Retourne les occurences.
	 * 
	 * @param liste l'ArrayList qui contient les symptômes.
	 * @return une TreeMap qui recense par ordre alphabétique les occurences.
	 * 
	 * 
	 */
	public TreeMap<String, Integer> getMapCensusCount(ArrayList<String> liste) {

		/*
		 * Initie une treeMap pour réordonner la liste en clé-valeur et par ordre
		 * alphabétique.
		 */

		TreeMap<String, Integer> map = new TreeMap<>();

		// Fais appel à un iterateur pour lire les résultats de la ArrayList.

		Iterator<String> iterator;

		iterator = liste.iterator();

		/*
		 * La boucle continue tant qu'il y a des lignes à lire depuis la liste
		 * 
		 * Chaque occurence rencontrée est ajoutée à la TreeMap et initié avec 1 en
		 * valeur
		 * 
		 * Si l'occurence rencontrée est déja présente, alors il ajoute +1 à son
		 * ancienne valeur, et replace la clé dans la Map avec sa nouvelle valeur avec
		 * le map.replace
		 * 
		 * Retourne le résultat
		 */

		while (iterator.hasNext()) {
			key = iterator.next();

			if (!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				oldValue = map.get(key);
				valueCount = oldValue + 1;
				map.replace(key, oldValue, valueCount);
			}
		}

		return map;

	}
}
