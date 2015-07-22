/*
	Latihan Mandiri PBO 01
	Class Stars (digunakan pada Latihan3.java)

	dibuat oleh yuanlukito[at]ti.ukdw.ac.id
*/

public class Stars{
	private int lineCount;

	public Stars(){
		//jumlah baris default = 10
		lineCount = 10;
	}

	//mengeset property lineCount
	public void setLineCount(int newLineCount){
		//newlinecount harus > 0
		if(newLineCount > 0)
			lineCount = newLineCount;
	}

	//mencetak output
	public void print(){
		//loop for, sama seperti di C
		System.out.println("line count: " + lineCount);
		for(int i=1; i<=lineCount; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}