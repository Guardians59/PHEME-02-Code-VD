package com.openclassrooms;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Interface utilisée par la classe Writer, récupère une TreeMap pour l'intégrer
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
	 * @return Map des résultats.
	 * @throws IOException il y a un flux de sortie.
	 */

	Map<String, Integer> getMapCensusCountWriter(TreeMap<String, Integer> mapWriter) throws IOException;
}
