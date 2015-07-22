/*
	Demo PBO 01
	Deposito dengan OOP
	Membuat object dari class Deposito dari class yang lain

	dibuat oleh yuanlukito[at]ti.ukdw.ac.id
*/

public class Main {
	public static void main(String[] args) {
		Deposito d1 = new Deposito(1000000, 12);
		d1.cetakInfo();

		Deposito d2 = new Deposito(5000000, 1);
		d2.cetakInfo();
	}
}