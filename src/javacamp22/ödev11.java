package javacamp22;

public class �dev11 {

	public static void main(String[] args) {
		
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman say�s�: "+mesaj.length());
		System.out.println("5. eleman: "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" Ya�as�n!"));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('a'));
		
		System.out.println(mesaj.replace(" ", "-"));
		System.out.println(mesaj.substring(3));
		System.out.println(mesaj.substring(7,13));
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		
	}
}

