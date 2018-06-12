package com.cpochard;

import java.io.File;
import java.io.IOException;

/**
 * Nouvelle classe repr�sentant la console.
 * 
 * @author Marjorie
 *
 */
public class Console {
	// static pour que la fonction soit charg�e en m�moire des debut de
	// l'application
	/**
	 * Ouvrir un fichier.
	 * 
	 * @param fileName
	 *            Nom du fichier (sans extension).
	 * @param extension
	 *            Nom de l'extension.
	 * @return Un fichier ouvert.
	 */
	static File openFile(String fileName, String extension) {
		if (extension.equals("tmp")) {
			System.out.println("l'extension est correcte");
			try { //on essaie d'ouvrir un fichier
				File.createTempFile(fileName, extension);
				// si �a �choue j'affiche l'erreur
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("l'extension n'est pas correcte");
		}

		return null;

	}
}
