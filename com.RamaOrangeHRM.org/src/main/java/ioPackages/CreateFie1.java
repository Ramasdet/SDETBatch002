package ioPackages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFie1 {

	public static void main(String[] args) throws Exception {
		File file = new File("Rama.txt");

		file.createNewFile();
		Thread.sleep(5000);
		System.out.println(file.isFile());
		FileWriter fw1 = new FileWriter(file);
		fw1.write("Nani");
		fw1.flush();
		fw1.close();
		FileReader fr1 = new FileReader(file);
		System.out.println(fr1.read());
		fr1.close();
		BufferedWriter bw1 = new BufferedWriter(fw1);

		bw1.write("Ram pothineni");
		bw1.newLine();
		bw1.write("Jr.NTR");
		bw1.flush();
		bw1.close();

	}

}
