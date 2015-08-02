/*
	Demo 02 | Pertemuan 02
	Mendefinisikan Class PersegiPanjang

	dibuat oleh yuanlukito[at]ti.ukdw.ac.id
*/

//nama Class = PersegiPanjang
class PersegiPanjang {
	//Ada 2 field, yaitu panjang dan lebar
	int panjang;
	int lebar;

	//method luas() untuk menghitung luasnya
	int luas(){
		return panjang * lebar;
	}

	//method keliling() untuk menghitung kelilingnya
	int keliling(){
		return 2 * (panjang + lebar);
	}
}