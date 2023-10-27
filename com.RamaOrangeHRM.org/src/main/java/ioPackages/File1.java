package ioPackages;

import java.io.File;

public class File1 {

	public static void main(String[] args) throws Exception {
		File file = new File("Rama123");
		file.mkdir();
		//file.createNewFile();
		Thread.sleep(5000);
		System.out.println(file.exists());
		//String[] allfiles = file.list();
		//for (String onefile : allfiles){
			//System.out.println(onefile);
		}

	}


