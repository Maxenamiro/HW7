package com.gmail.maxenamiro;

import java.io.File;
import java.util.Scanner;

public class Catalog {

	public static void main(String[] args) {
		System.out.println("Оберіть каталог");
		Scanner sc = new Scanner(System.in);
		String dir = sc.nextLine();
		showDirList(dir);
	}

	public static void showDirList(String dir) {
		File files = new File(dir);
		File[] file = files.listFiles();
		for (int i = 0; i < file.length; i++) {
			if (file[i].isDirectory()) {
				System.out.println(file[i]);
			}
		}
	}

}
