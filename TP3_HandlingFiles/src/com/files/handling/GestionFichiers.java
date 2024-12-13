/**
 * 
 */
package com.files.handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestionFichiers {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputFile = "input.txt";
		String outputFile = "output.txt";
		
		List<String> lignes = new ArrayList<>();
		
		//Lecture du fichier
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))){
			String ligne;
			while ((ligne = reader.readLine()) != null) {
				lignes.add(ligne);
			}
			System.out.println("Contenu du fichier lu avec succès");
		}catch(IOException e) {
			System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
			return;
		}
		
		//Tri des lignes
		Collections.sort(lignes);
		
		//Ecriture dans le fichier de sortie
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
			for(String ligne : lignes) {
				writer.write(ligne);
				writer.newLine();
			}
			System.out.println("Contenu trié écrit dans " + outputFile);
		}catch (IOException e) {
			System.err.println("Erreur lors de l'écriture du fichier : " + e.getMessage());
		}
	}
}
