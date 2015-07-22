/*
	Demo PBO 01
	Deposito dengan structured programming

	dibuat oleh yuanlukito[at]ti.ukdw.ac.id
*/

#include<stdio.h>

double hitungbunga(long nominal, int jangkawaktu){
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

int main(){
	long nominal1 = 1000000;
	int jangkawaktu1 = 12;
	double bunga1 = hitungbunga(nominal1, jangkawaktu1);
	printf("Deposito Rp. %ld dengan jangka waktu %d bulan\n", nominal1, jangkawaktu1);
	printf("Bunga: Rp. %.2f\n", bunga1);
	printf("Saldo akhir bulan ke-%d: Rp. %.2f\n", jangkawaktu1, nominal1+bunga1);
	
	long nominal2 = 5000000;
	int jangkawaktu2 = 1;
	double bunga2 = hitungbunga(nominal2, jangkawaktu2);
	printf("Deposito Rp. %ld dengan jangka waktu %d bulan\n", nominal2, jangkawaktu2);
	printf("Bunga: Rp. %.2f\n", bunga2);
	printf("Saldo akhir bulan ke-%d: Rp. %.2f\n", jangkawaktu2, nominal2+bunga2);
	
	return 0;
}
