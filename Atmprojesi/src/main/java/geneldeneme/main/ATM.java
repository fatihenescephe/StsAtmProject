package geneldeneme.main;

import java.util.Scanner;

public class ATM {
	
	public void calis(Hesap hesap) {
		
		Login login = new Login(); 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bankamýza hoþgeldiniz...");
		
		System.out.println(".............................");
		System.out.println("Kullanýcý giriþi...");
		System.out.println(".............................");
		
		int giris_hakki=3;
		
		while(true) {
			
			if(login.Login(hesap)) {
				
				System.out.println("Giriþ baþarýlý...");
				break;
			}
			else {
				System.out.println("Giriþ baþarýsýz...");
				giris_hakki -= 1;
				System.out.println("Kalan giriþ hakký : " + giris_hakki);
			}
			
			if(giris_hakki == 0) {
				
				System.out.println("Giriþ hakkýnýz kalmamýþtýr...");
				return;
			}
			
		}
		
		System.out.println("............................");
		String islemler = "1. Bakiye öðrenme:\n"
						+	"2. Para yatýrma:\n"
						+	"3. Para çekme:\n"
						+	"Çýkýþ iþlemi için q basýn.";
		
		System.out.println(islemler);
		System.out.println(".............................");
		
		while(true) {
			
			System.out.println("Ýþlem seçiniz...");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				
				break;
			}
			else if(islem.equals("1")) {
				
				System.out.println("bakiyeniz : " + hesap.getBakiye());
				
				
			}
			
			else if(islem.equals("2")) {
				
				System.out.println("Yatýrmak istediðiniz tutar :");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraYatir(tutar);
			}
			
			else if(islem.equals("3")) {
				
				System.out.println("Çekmek istediðiniz tutar : ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				
				hesap.paraCek(tutar);
				
			}
			
			else {
				System.out.println("Geçersiz iþlem...");
			}
		}
		
	}

}
