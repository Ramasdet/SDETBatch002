package com.Ramajava.org;

public class StringConstantPull2 {

	public static void main(String[] args) {
		String str1 = "Rama";
		String str2 = new String("Rama");
		String str3 = "SDET";
		String str4 = str1 + str2;
		String str5 = str3.concat("Professional");
		String str6 = new String("SDET");
		System.out.println(str1);// Rama
		System.out.println(str2);// Rama
		System.out.println(str3);// SDET
		System.out.println(str4);// RamaRama
		System.out.println(str5);// SDETProfessional
		System.out.println(str6);// SDET

	}

}
