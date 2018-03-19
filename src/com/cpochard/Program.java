package com.cpochard;

import java.io.File;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File.createTempFile("", null);
		} catch (Exception erreur) {
			erreur.printStackTrace();
		}
	}
}
