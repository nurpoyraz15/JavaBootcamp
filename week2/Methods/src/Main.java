
public class Main {

	public static void main(String[] args) {
		sayibulmaca();
	
        int sayi = topla (5,9);
        int sayilar;
        int toplam = topla2 (3,5,7,9,11,0);
		  System.out.println(toplam);
	}


  public static void sayibulmaca() {
	int[] sayilar = new int[] {3,5,7,9,11,0};
	int aranacak = 7;
	boolean varMi = true;
	
	for (int sayi: sayilar) {
		if (sayi==aranacak);
		varMi= true;
		break;
	}

	
   if (varMi) {
   System.out.println ("Sayı mevcuttur:" + aranacak);
    } else {
	  System.out.println("Sayı mevcut değildir:" + aranacak);
	  }
   
	   
   }
     // parametreli methods
     //void operasyonu ile bilgisayarın bir şey yapmasını isteriz.
    public static int topla (int sayi1, int sayi2) {
    return 0;
    }
	
    // variable ile çalışmak
    public static int topla2 (int...sayilar) {
    	int toplam = 0;
		for (int sayi: sayilar) {
			toplam+= sayi;	
		}
			return toplam;
			
    
}

}