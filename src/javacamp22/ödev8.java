package javacamp22;

public class �dev8 {

	public static void main(String[] args) {
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Bekir";
		ogrenciler[1]="Samet";
		ogrenciler[2]="G�lce";
		ogrenciler[3]="H�seyin";
		
		
		for(int i=0;i<ogrenciler.length;i++) 
		{
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println();
		
		//FOREACH D�ng�s�
		
		for (String o : ogrenciler) 
		{
			System.out.println(o);
		}

	}

}

