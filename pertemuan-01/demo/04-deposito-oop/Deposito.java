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

	private double hitungBunga(){
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

	public void cetakInfo(){
		System.out.println("Deposito Rp. " + nominal + " dengan jangka waktu " + jangkawaktu + " bulan");
		System.out.println("Jatuh tempo dalam: " + jangkawaktu + " bulan");
		double bunga = hitungBunga();
		double saldoAkhir = nominal + bunga;
		System.out.println("Bunga: Rp. " + bunga);
		System.out.println("Saldo akhir bulan ke-" + jangkawaktu + " Rp. " + saldoAkhir);
	}

	public static void main(String[] args) {
		Deposito d1 = new Deposito(1000000, 12);
		d1.cetakInfo();

		Deposito d2 = new Deposito(5000000, 1);
		d2.cetakInfo();
	}
}