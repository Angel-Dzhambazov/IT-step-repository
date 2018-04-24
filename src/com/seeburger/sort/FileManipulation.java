package com.seeburger.sort;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileManipulation {

	private List<String> arrFiles = new ArrayList<>();

	public void findFiles() {
		File directory = new File("C:\\Users\\danie\\Desktop\\books");
		File[] lists = directory.listFiles();

		
		for (File f : lists) {
			if (f.isDirectory()) {

				System.out.println("is directory" + f.getAbsolutePath());
			} else {
				System.out.println(f.canRead());
			}

		}

	}

}