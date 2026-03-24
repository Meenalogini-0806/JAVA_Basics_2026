import java.util.Scanner;
class user_input2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num1 :");
		int num1=sc.nextInt();
		
		System.out.print("num2 :");
		int num2=sc.nextInt();
		
		System.out.print("num3:");
		int num3=sc.nextInt();
		
		int sum=num1-num2+num3;
		System.out.print("The number is :"+sum);
	}
}