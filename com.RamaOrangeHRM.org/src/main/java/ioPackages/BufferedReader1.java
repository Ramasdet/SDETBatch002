package ioPackages;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader1 {

	public static void main(String[] args) throws Exception {
		File f = new File("Raju.txt");
		f.exists();
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw1 = new BufferedWriter(fw);

		bw1.write("Nani");
		bw1.newLine();
		bw1.write("Rama");
		bw1.newLine();
		bw1.write("Ram pothineni");

		bw1.flush();
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String val = br.readLine();
		String line;
		System.out.println(val);
		while ((line = br.readLine()) != null) {

			System.out.println(line);
		}

	}
}