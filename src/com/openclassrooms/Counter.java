package com.openclassrooms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * La classe Counter permet de r�cup�rer une ArrayList et de l'int�grer dans une
 * TreeMap, afin de recenser les occurences par ordre alphab�tique.
 * 
 * @author Dylan
 *
 */

public class Counter implements ICounter {
	/*
	 * key sera les occurences recens�es.
	 * 
	 * oldValue les valeurs trouv�s au fil de l'it�rateur.
	 * 
	 * valueCount les valeurs finales de chaque occurence.
	 */

	private String key;
	private int oldValue;
	private int valueCount;

	/**
	 * Retourne les occurences.
	 * 
	 * @param liste l'ArrayList qui contient les sympt�mes.
	 * @return une TreeMap qui recense par ordre alphab�tique les occurences.
	 * 
	 * 
	 */
	public TreeMap<String, Integer> getMapCensusCount(ArrayList<String> liste) {

		/*
		 * Initie une treeMap pour r�ordonner la liste en cl�-valeur et par ordre
		 * alphab�tique.
		 */

		TreeMap<String, Integer> map = new TreeMap<>();

		// Fais appel � un iterateur pour lire les r�sultats de la ArrayList.

		Iterator<String> iterator;

		iterator = liste.iterator();

		/*
		 * La boucle continue tant qu'il y a des lignes � lire depuis la liste
		 * 
		 * Chaque occurence rencontr�e est ajout�e � la TreeMap et initi� avec 1 en
		 * valeur
		 * 
		 * Si l'occurence rencontr�e est d�ja pr�sente, alors il ajoute +1 � son
		 * ancienne valeur, et replace la cl� dans la Map avec sa nouvelle valeur avec
		 * le map.replace
		 * 
		 * Retourne le r�sultat
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
