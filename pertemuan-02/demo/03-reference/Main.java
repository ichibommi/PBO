/*
	Demo 03 | Pertemuan 02
	Reference

	dibuat oleh yuanlukito[at]ti.ukdw.ac.id
*/

public class Main{
	public static void main(String[] args) {
		//buat 2 Object dari Class PersegiPanjang, p1 dan p2
		PersegiPanjang p1 = new PersegiPanjang();
		p1.panjang = 20;
		p1.lebar = 8;

		PersegiPanjang p2 = new PersegiPanjang();
		p2.panjang = 12;
		p2.lebar = 3;

		//tampilkan keliling dan luas dari p1 dan p2
		System.out.println("Luas p1 = " + p1.luas());
		System.out.println("Keliling p1 = " + p1.keliling());
		System.out.println("Luas p2 = " + p2.luas());
		System.out.println("Keliling p2 = " + p2.keliling());

		//definisikan referensi p3 yang menunjuk ke Object pertama
		//panjang = 20, lebar = 8
		PersegiPanjang p3 = p1;

		//keliling dan luas p3 akan sama seperti p1
		//keduanya mengacu/menunjuk/me-reference ke Object yang sama
		System.out.println("Luas p3 = " + p3.luas());
		System.out.println("Keliling p3 = " + p3.keliling());
	}
}