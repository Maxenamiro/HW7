package com.gmail.maxenamiro;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class secondTask {

	public static void main(String[] args) {

		int[][] mas = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

		File taskMasiv = new File("Array.txt");

		zapisMasiva(mas, taskMasiv);
	}

	public static void zapisMasiva(int[][] mas, File file) {
		try (PrintWriter pw = new PrintWriter(file)) {
			for (int i = 0; i < mas.length; i++) {
				for (int j = 0; j < mas[i].length; j++) {
					pw.print(mas[i][j]);
				}
				pw.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
