import java.util.Scanner;
class Simple_shopping{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter price:");
		int price = sc.nextInt();
		
		System.out.print("Enter Quantity:");
		int quantity = sc.nextInt();
		
		int total = price * quantity;
		
		int discount=0;
		if (total>5000){
			discount=total*10/100;	
		}
		int billamount = total-discount;

		System.out.println("Total Amount:" + total);
		System.out.println("Disount:"+discount);
		System.out.print("Final Amount:" + billamount);
		
		sc.close();
	}
}
/*import java.util.Scanner;
class Simple_shopping{
	public static void main(String args[]){
		int Billamount=6600;
		
		
		System.out.println("Billamount:"+Billamount);
		double discount=0 ;
		if(Billamount > 5000){
			discount=Billamount*10/100;
		}
		double finalamount=Billamount - discount;
		
		System.out.println("discount:"+discount);
		System.out.println("finalamount:"+finalamount);
	}
}*/
	