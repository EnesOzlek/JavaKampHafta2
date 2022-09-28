package intro;

public class Main {

	//main javada başlangıç noktasıdır
	
	public static void main(String[] args) {
		System.out.println("Helllo World");
		
		//değişken isimlendirmeleri java da camelCase yazılır
		String ortaMetin = "ilginizi çekebilir";
		String altMetin = "vade süresi";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		//İNTEGER
		int vade = 12 ;
		//ondalıklı
		double dolarDun = 18.15;
		double dolarBugun = 18.10;
		
		boolean dolarDustuMu = false ;
		
		
		String okYonu = "";
		
		
		if (dolarBugun<dolarDun) {
			
			System.out.println(okYonu);
			okYonu=("down.svg");
			
		}else if(dolarBugun>dolarDun) {
			System.out.println(okYonu);
			okYonu=("up.svg");
		}
		else {
			System.out.println(okYonu);
			okYonu=("equal.svg");
			
			
		}
		
		
		//array
		
		String[] krediler = {"hızlı kredi","maaşını alanlar","mutlu kredi","hızlı kredi","maaşını alanlar","mutlu kredi","hızlı kredi","maaşını alanlar","hızlı kredi","maaşını alanlar","hızlı kredi","maaşını alanlar","hızlı kredi","maaşını alanlar","hızlı kredi","maaşını alanlar","hızlı kredi","maaşını alanlar","hızlı kredi","maaşını alanlar"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
	}

}
