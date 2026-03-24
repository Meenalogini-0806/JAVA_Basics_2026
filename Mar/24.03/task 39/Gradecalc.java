import java.util.Scanner;
class Gradecalc{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks for subject 1:");
		int num1 = sc.nextInt();
		System.out.print("Enter marks for subject 2:");
		int num2 = sc.nextInt();
		System.out.print("Enter marks for subject 3:");
		int num3 = sc.nextInt();
		
		int Total=num1+num2+num3;
		System.out.println("Total:"+Total);
		
		int Average=Total/3;
		/*System.out.println("Average:"+Average);*/
		
		System.out.print("grade:");
		if((Average>=75)&&(Average<=100)){
			System.out.print("A");
		}else if((Average>=55)&&(Average<=74)){
			System.out.print("B");
		}else if((Average>=45)&&(Average<=54)){
			System.out.print("C");
		}else if((Average>=35)&&(Average<=44)){
			System.out.print("S");
		}else if(Average<=34){
			System.out.print("Fail");
		}
		
	}
}