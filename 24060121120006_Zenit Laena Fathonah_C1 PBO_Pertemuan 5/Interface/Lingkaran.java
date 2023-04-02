/**
* File : Lingkaran.java
* Tanggal : 29/03/2023
* Nama : Zenit Laena Fathonah
* Deskripsi : Kelas implementasi IArea berupa 
*             cara menghitung luas lingkaran
**/

/* Mengambil konstanta yang ada di kelas java.lang.Math*/
import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}

	public double hitungLuas(){
		return PI*jejari*jejari;
	}
}