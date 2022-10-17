package com.gmail.maxenamiro;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class firstTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введіть текст, який хочете записати у файл -> ");

		File file = new File("first file.txt");

		try (PrintWriter pw = new PrintWriter(file)) {
			pw.print(sc.nextLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
