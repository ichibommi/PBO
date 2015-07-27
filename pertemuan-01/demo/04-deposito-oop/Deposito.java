/*
	Demo PBO 01
	Deposito dengan OOP

	dibuat oleh yuanlukito[at]ti.ukdw.ac.id
*/

public class Deposito {
	private long nominal;
	private int jangkawaktu;

	public Deposito(long saldo, int jatuhtempo){
		nominal = saldo;
		jangkawaktu = jatuhtempo;
	}

	public double hitungBunga(){
		if(jangkawaktu == 1 || jangkawaktu == 3){
			return jangkawaktu/12.0 * nominal * 4.95/100;
		}
		else if(jangkawaktu == 6){
			return jangkawaktu/12.0 * nominal * 5.5/100;
		}
		else if(jangkawaktu == 12){
			return jangkawaktu/12.0 * nominal * 5.54/100;
		}
		else if(jangkawaktu == 24){
			return jangkawaktu/12.0 * nominal * 5.4/100;
		}
		else
			return 0;
	}

	public double hitungSaldoAkhir(){
		double bunga = hitungBunga();
		double saldoakhir = nominal + bunga;
		return saldoakhir;
	}

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