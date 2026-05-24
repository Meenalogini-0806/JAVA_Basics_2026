/*import java.util.Scanner;
class Largest_number{
	public static void main(String args[]){
		Scanner earth = new Scanner(System.in);
		
		System.out.print("A Enter number:");
		int A = earth.nextInt();
		
		System.out.print("B Enter number:");
		int B = earth.nextInt();
		
		System.out.print("C Enter number:");
		int C = earth.nextInt();
		
		System.out.print("D Enter number:");
		int D = earth.nextInt();
		
		if ((A>=B)&&(A>=C)){
			System.out.print("A is the largest number");
		}else if((B>=A)&&(B>=C)){
			System.out.print("B is the biggest number");
		}else if((C>=B)&&(C>=D)){
			System.out.print("C is the biggest number");
		}else{
			System.out.print("D is the biggest number");
		}
	}
}
*/

class Largest_number{
	public static void main(String args[]){
		int[] num={455,231,499,89};
		int max=num[0];
		
		for(int i=1; i<num.length; i++){
			if(num[i]>max){
				max=num[i];
			} 
		}
		System.out.print("the largest number is:"+max);
	}
}
/*
class Largest_number{
	public static void main(String args[]){
		int [] num={233,24,9,678,4567};
		int min=num[0];
		
		for(int i=1; i<num.length;i++){
			if(num[i]<min){
				min=num[i];
			}
		}
		System.out.print("the smallest number is:"+min);
	}
}
*/
