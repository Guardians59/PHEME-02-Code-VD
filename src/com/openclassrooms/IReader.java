package com.openclassrooms;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Interface utilisée par la classe Reader.
 * 
 * @see Reader
 * @author Dylan
 *
 */

public interface IReader {

	/**
	 * 
	 * @return ArrayList de String qui listera les symptômes.
	 * @throws IOException il y a un flux d'entrée.
	 */

	ArrayList<String> getListReader() throws IOException;
}
