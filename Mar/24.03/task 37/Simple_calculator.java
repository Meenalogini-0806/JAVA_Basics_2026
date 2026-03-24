import java.util.Scanner;
class Simple_calculator{
	public static void main(String args[]){
		double num1,num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter First Number  :");
		num1=sc.nextDouble();
		
		System.out.print("enter scound number :");
		num2=sc.nextDouble();
		
		System.out.println("1.Addition(+)");
		System.out.println("2.Subtraction(-)");
		System.out.println("3.Multiplication(*)");
		System.out.println("4.division(/)");
		System.out.print("Enter your choice:");
		
		double result;
		int operators=sc.nextInt();
		switch (operators){
			case 1:
				System.out.print("Result:"+(num1+num2));
				break;
			case 2:
				System.out.print("Result="+(num1-num2));
				break;
			case 3:
				System.out.print("Result="+(num1*num2));
				break;
			case 4:
				System.out.print("Result="+(num1/num2));
				break;
			
			
		}
		
	}
}
