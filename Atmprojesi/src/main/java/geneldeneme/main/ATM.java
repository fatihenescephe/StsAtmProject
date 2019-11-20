package geneldeneme.main;

import java.util.Scanner;

public class ATM {
	
	public void calis(Hesap hesap) {
		
		Login login = new Login(); 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bankam�za ho�geldiniz...");
		
		System.out.println(".............................");
		System.out.println("Kullan�c� giri�i...");
		System.out.println(".............................");
		
		int giris_hakki=3;
		
		while(true) {
			
			if(login.Login(hesap)) {
				
				System.out.println("Giri� ba�ar�l�...");
				break;
			}
			else {
				System.out.println("Giri� ba�ar�s�z...");
				giris_hakki -= 1;
				System.out.println("Kalan giri� hakk� : " + giris_hakki);
			}
			
			if(giris_hakki == 0) {
				
				System.out.println("Giri� hakk�n�z kalmam��t�r...");
				return;
			}
			
		}
		
		System.out.println("............................");
		String islemler = "1. Bakiye ��renme:\n"
						+	"2. Para yat�rma:\n"
						+	"3. Para �ekme:\n"
						+	"��k�� i�lemi i�in q bas�n.";
		
		System.out.println(islemler);
		System.out.println(".............................");
		
		while(true) {
			
			System.out.println("��lem se�iniz...");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				
				break;
			}
			else if(islem.equals("1")) {
				
				System.out.println("bakiyeniz : " + hesap.getBakiye());
				
				
			}
			
			else if(islem.equals("2")) {
				
				System.out.println("Yat�rmak istedi�iniz tutar :");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraYatir(tutar);
			}
			
			else if(islem.equals("3")) {
				
				System.out.println("�ekmek istedi�iniz tutar : ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				
				hesap.paraCek(tutar);
				
			}
			
			else {
				System.out.println("Ge�ersiz i�lem...");
			}
		}
		
	}

}
