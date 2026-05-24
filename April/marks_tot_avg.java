import java.util.Scanner;
class marks_tot_avg{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Marks For subject 1 :");
		int mark1 = sc.nextInt();
		
		System.out.print("Enter Marks For subject 2 :");
		int mark2 = sc.nextInt();
		
		System.out.print("Enter Marks For subject 3 :");
		int mark3 = sc.nextInt();
		
		System.out.print("Enter Marks For subject 4 :");
		int mark4 = sc.nextInt();
		
		System.out.print("Enter Marks For subject 5 :");
		int mark5 = sc.nextInt();
		
		int total = mark1+mark2+mark3+mark4+mark5;
		System.out.println("Total:"+total);
		
		int Avg = total/5;
		System.out.print("Average:"+Avg);
	}
}