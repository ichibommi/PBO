/*
	Demo 02 | Pertemuan 02
	Membuat Object dari Class PersegiPanjang

	dibuat oleh yuanlukito[at]ti.ukdw.ac.id
*/

public class Main{
	public static void main(String[] args) {
		//Buat Object dari Class PersegiPanjang
		PersegiPanjang p1 = new PersegiPanjang();
		//atur ukuran panjang dan lebarnya
		p1.panjang = 10;
		p1.lebar = 15;
		//tampilkan keliling dan luasnya
		System.out.println("Keliling: " + p1.keliling());
		System.out.println("Luas: " + p1.luas());
	}
}