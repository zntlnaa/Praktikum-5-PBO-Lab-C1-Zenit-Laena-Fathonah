/**
* File : MLingkaran.java
* Tanggal : 29/03/2023
* Nama : Zenit Laena Fathonah
* Deskripsi : Implementasi cara menghitung luas lingkaran
**/

import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan jari-jari lingkaran : ");
		double jejari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jejari);
		System.out.println("Luas lingkaran dengan jejari " +jejari+ "adalah " +l.hitungLuas());
	}

}