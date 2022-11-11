import java.util.Scanner;

public class Dua{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sisi1, sisi2, sisi3;
		
		
		System.out.println ("Masukkan panjang sisi pertama");
		sisi1=sc.nextInt();
		System.out.println ("Masukkan panjang sisi kedua");
		sisi2=sc.nextInt();
		System.out.println ("Masukkan panjang sisi ketiga");
		sisi3=sc.nextInt();
	
			if(sisi1==sisi2&&sisi2!=sisi3&&sisi1!=sisi3||sisi2==sisi3&&sisi2!=sisi1&&sisi1!=sisi3||sisi1==sisi3&&sisi2!=sisi1&&sisi2!=sisi3){
			//jika kedua sisinya sama maka segitiga sama kaki
			System.out.println ("Segitiga sama kaki");
			}else if(sisi1==sisi2||sisi1==sisi3||sisi2==sisi3){
			//jika ketiga sisinya sama maka segitiga sama sisi
			System. out.println ("Segitiga sama sisi");
			}else{
				//jika tidak ada sisi yang sama maka segitiga sembarang
			System.out.println ("Segitiga sembarang");
			}
		}
		}
		
