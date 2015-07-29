/*
	Demo 04 | Pertemuan 01
	Deposito dengan OOP
	Membuat object dari class Deposito dari class yang lain

	dibuat oleh yuanlukito[at]ti.ukdw.ac.id
*/

public class Main {
	public static void main(String[] args) {
		Deposito d1 = new Deposito(1000000, 12);
		System.out.println("Deposito Rp. 1000000 dalam 12 bulan");
		System.out.println("Bunga: Rp. " + d1.hitungBunga());
		System.out.println("Saldo akhir bulan ke 12: Rp. " + d1.hitungSaldoAkhir());

		Deposito d2 = new Deposito(5000000, 1);
		System.out.println("Deposito Rp. 5000000 dalam 1 bulan");
		System.out.println("Bunga: Rp. " + d2.hitungBunga());
		System.out.println("Saldo akhir bulan ke 1: Rp. " + d2.hitungSaldoAkhir());
	}
}