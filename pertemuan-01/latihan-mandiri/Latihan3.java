/*
	Latihan Mandiri PBO 01
	Menggunakan Class yang sudah ada, membuat object serta mengakses
	property dan methodnya.

	dibuat oleh yuanlukito[at]ti.ukdw.ac.id
*/

public class Latihan3{
	public static void main(String[] args) {
		//definisikan object bernama star dari class Stars
		Stars star = new Stars();
		//panggil method print dari star
		star.print();
		//ubah property lineCount menjadi 15
		star.setLineCount(15);
		//panggil method print sekali lagi
		star.print();
	}
}