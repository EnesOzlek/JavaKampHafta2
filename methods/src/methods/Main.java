package methods;

public class Main {

	public static void main(String[] args) {

		sayiBulmaca();
		mesajVer(null);
	}

	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int aranacak = 5;

		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer("Sayi mevcut"+aranacak);
		} else {
			System.out.println("Sayi mevcut değil"+aranacak);
		}

	}
	
	public static void mesajVer(String mesaj) {
		
		System.out.println(mesaj);
		
	}
}