package javacamp22;

public class ödev8 {

	public static void main(String[] args) {
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Bekir";
		ogrenciler[1]="Samet";
		ogrenciler[2]="Gülce";
		ogrenciler[3]="Hüseyin";
		
		
		for(int i=0;i<ogrenciler.length;i++) 
		{
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println();
		
		//FOREACH Döngüsü
		
		for (String o : ogrenciler) 
		{
			System.out.println(o);
		}

	}

}

