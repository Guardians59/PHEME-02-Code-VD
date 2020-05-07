package com.openclassrooms;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Interface utilis�e par la classe Reader.
 * 
 * @see Reader
 * @author Dylan
 *
 */

public interface IReader {

	/**
	 * 
	 * @return ArrayList de String qui listera les sympt�mes.
	 * @throws IOException il y a un flux d'entr�e.
	 */

	ArrayList<String> getListReader() throws IOException;
}
