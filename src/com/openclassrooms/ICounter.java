package com.openclassrooms;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Interface utilis�e par la classe Counter, r�cup�re une ArrayList pour
 * l'int�grer dans une TreeMap.
 * 
 * @see Counter
 * @author Dylan
 *
 */

public interface ICounter {
	/**
	 * 
	 * @param liste l'ArrayList qui contient les sympt�mes.
	 * @return TreeMap String/Integer qui recensera les occurences par ordre
	 *         alphab�tique.
	 */

	TreeMap<String, Integer> getMapCensusCount(ArrayList<String> liste);
}
