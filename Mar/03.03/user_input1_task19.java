import java.util.Scanner;
class user_input1_task19{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String name = "";
		System.out.print("please enter your name :");
		name = scan.next();
		System.out.println("your name is :" + name);
		
		
		
		int marks=0;
		System.out.print("please enter your mark :");
		marks = scan.nextInt();
		System.out.println("your marks is :" + marks);
		System.out.println("**************");
	}

}
