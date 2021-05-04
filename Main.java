package javacamp;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't Repeat Yourself
		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);

		if(dolarBugun < dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}
		else if (dolarBugun > dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}
		else {
			System.out.println("Dolar eþittir resmi");
		}
		
		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Mutlu Emekli Kredi";
		String kredi3 = "Konut Kredi";
		String kredi4 = "Çiftçi Kredi";
		
		System.out.println();
		
		String[] krediler = {
				"Hýzlý Kredi", 
				"Mutlu Emekli Kredisi", 
				"Konut Kredi", 
				"Çiftçi Kredi"
				};
		// elimde bir dizi var ve o dizideki elemanlarý tek tek dolaþ demek aþaðýdaki satýr.
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		// stack ve heap defterde
		
		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1 );
	}
	

}
