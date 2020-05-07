package com.openclassrooms;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Interface utilis�e par la classe Writer, r�cup�re une TreeMap pour l'int�grer
 * dans une Map.
 * 
 * @see Writer
 * @author Dylan
 *
 */

public interface IWriter {

	/**
	 * 
	 * @param mapWriter la TreeMap qui recense les occurences.
	 * @return Map des r�sultats.
	 * @throws IOException il y a un flux de sortie.
	 */

	Map<String, Integer> getMapCensusCountWriter(TreeMap<String, Integer> mapWriter) throws IOException;
}
