//Hessam farhat   N20239030
import java.util.Scanner;

public class WYazdirma {

	public static void main(String[] args) {
		System.out.println("Buyuk W yazdirma programina hosgeldiniz.");
		System.out.print("Lutfen satir sayisi icin 3 ile 15 arasinda bir sayi giriniz: ");
		
		Scanner keyboard = new Scanner(System.in);
		int n;
		n = keyboard.nextInt();
// girilen sayi 3 ve 15 arasi olmadigi surece programdan bu mesaji alicaz.		
		while((n<3) || (n>15)) {
			System.out.println("Gecerli olmayan bir satir sayisi girdiniz.");
			System.out.print("Lutfen satir sayisi icin 3 ile 15 arasinda bir sayi giriniz: ");
			Scanner keyboard2 = new Scanner(System.in);
			n = keyboard2.nextInt();
		}
		
		//birinci satirin yaziminda ilk basta * sonra bosluklar sonra yine * sonra bosluklar en son yine * 
		System.out.print("*");
		for (int i=1; i<=2*n-3; i++) {
			System.out.print(" ");
			}
		System.out.print("*");
		for (int i=1; i<=2*n-3; i++) {
			System.out.print(" ");
			}
		System.out.print("*");
		System.out.println();
		//ara satirlarin yaziminda goruyoruz ki ara satirlar (ilk ve son satir haric) hepsinde 4 * var.
		// ara satirlarda ilk basta bosluk sonra *,bosluk,*,bosluk,*, bosluk ve * ve en son bosluk ile bitiriyoruz
		for (int i=1; i<=n-2; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j=1; j<=2*n-5-((i-1)*2); j++) {
				System.out.print(" ");
			}	
			System.out.print("*");
			for (int j=1; j<=2*i-1; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j=1; j<=2*n-5-((i-1)*2); j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		//son satirin yaziminda goruyoruz hepsinde 2 * var. bosluk ile baslayip, * , bosluk, * , ve bosluk ile bitiriyoruz. 
		for (int i=1; i<=n-1; i++) {
			System.out.print(" ");
		}
		System.out.print("*");
		for(int i=1; i<=2*n-3; i++) {
			System.out.print(" ");
		}
		System.out.print("*");
		}
	}
