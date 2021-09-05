//Hessam Farhat  N20239030
import java.util.Scanner;
import java.util.Random;


public class SayiTahmin {
	
	public static void main(String[] args) {
	// bitis diye 1 string olustuyor ve E'ye esit.	
		String bitis;
		bitis = "E";
		
		gidilecekyer: while (bitis.equals("E")) {
			
			int tahmin;
			System.out.println("1 ile 100 arasinda bir sayi tuttum. tuttugum sayiyi tahmin edebilir misiniz?");
			System.out.print("lutfen ilk tahminizinizi girin (oyunu sonlandirmak icin -1): ");
		//0 ve 100 arasinda bir sayi rastgele tutuluyor	
			Random rand = new Random();
			int rasgaleSayi = rand.nextInt(100); 
			 rasgaleSayi++;
		//klavyeden tahmin edilecek sayiyi girip tahminlerde bulunuyoruz	 
			Scanner sc = new Scanner(System.in); 
			tahmin = sc.nextInt();
			
			
			int adet = 1;
		//tahmin edilen sayi rastgele tutulan sayiya esit olmadigi surece icerdeki if calisiyor ve rastgelesayi
		//eger buyuk ise tahmin edilen sayidan tuttugum sayi buyuk tekrar dene mesaji alicaz. eger -1 girersek 
		//oyunu sonlandiricaz ve tuttugu sayiyi bastirip tekrar oynamak isteyip istemedigimizi sorucak
				while (tahmin != rasgaleSayi) {
					if (rasgaleSayi > tahmin) {
						if (tahmin == -1) {
							System.out.println("Bu oyunu sonlandirdiniz. Tuttugum sayi " + rasgaleSayi + " ti.");
							System.out.println("Yeni bir oyun oynamak istiyorsaniz E karakteri girin: ");
							
							Scanner sc2 = new Scanner(System.in); 
							bitis = sc2.next();
							
							if (bitis.equals("E")) {
								continue gidilecekyer;
							}
							else {
							break;
							}
							
						}
						
						else {
							System.out.print("Tuttugum sayiyi daha BUYUK. Tekrar tahmin ediniz (oyunu sonlandirmak icin -1): ");
							tahmin = sc.nextInt(); 
							adet++;
						}
					}
			//rastgelesayi eger tahmin edilen sayidan kucuk ise tuttugum sayi kucuk tekrar dene mesaji alicaz.
					else if (rasgaleSayi < tahmin) {
						System.out.print("Tuttugum sayiyi daha KUCUK. Tekrar tahmin ediniz (oyunu sonlandirmak icin -1): "); 
						tahmin = sc.nextInt(); 
						adet++;
					}
				}
			// E disinda herhangi bir karakter girilirse oyun icin tesekkur edecek.
				if (!bitis.equals("E")) {
					System.out.println("Oyun icin tesekkurler.");
				break;
				}
			//rastgelesayi tahmin sayisina esit ise denemeler sonucunda, donguden cikacak ve dogru tahmin basacak
			// tutulan sayiyi ve ayrica kac denemede bulduk onun mesajini basicak ve en sonunda tekrar oyunu oynamak isteyip istemedigimizi soracak
				else {
				System.out.println("DOGRU TAHMIN.");
				System.out.println("Tuttugum " + tahmin + " sayisini " + adet + "  tahminde buldunuz.");
				System.out.print("Yeni bir oyun oynamak istiyorsaniz E karakteri girin: "); 
				Scanner sc2 = new Scanner(System.in); 
				bitis = sc2.next();
					if (!bitis.equals("E")) {
					System.out.println("Oyun icin tesekkurler.");
						}
				}
		}
		
	}

}
