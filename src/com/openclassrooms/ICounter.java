package com.openclassrooms;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Interface utilisée par la classe Counter, récupère une ArrayList pour
 * l'intégrer dans une TreeMap.
 * 
 * @see Counter
 * @author Dylan
 *
 */

public interface ICounter {
	/**
	 * 
	 * @param liste l'ArrayList qui contient les symptômes.
	 * @return TreeMap String/Integer qui recensera les occurences par ordre
	 *         alphabétique.
	 */

	TreeMap<String, Integer> getMapCensusCount(ArrayList<String> liste);
}
