package javacamp22;

public class ödev9 {

	public static void main(String[] args) {
		int sayi1=20;
		int sayi2=25;
		int sayi3=30;
		int enBuyuk=sayi1;
		if(enBuyuk<sayi2) 
		{
			enBuyuk=sayi2;
			
		}
		if(enBuyuk<sayi3) 
		{
			enBuyuk=sayi3;
			
		}
		System.out.println("En büyük sayý: " + enBuyuk);
		
	
	System.out.println("***************************************");
	
		
		double[] myList = {1.2,1.3,4.3,5.6};
		double total=0;
		double max = myList[0];
		for (double number : myList) {
			total += number;
			if(max<number) {
				max=number;
			}
			System.out.println(number);
			}
	
		System.out.println("Toplam :" + total);
		System.out.println("En büyük sayý : " + max);
	

	}
}
