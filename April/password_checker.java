import java.util.Scanner;
class password_checker{
	public static void main(String args[]){
		
		String correctPassword = "Lojini086";
		int attampts = 3;
		
		Scanner sc = new Scanner(System.in);
		
		while(attampts > 0){
			System.out.print("Enter Password:");
			String password = sc.nextLine();
			
			if(correctPassword.equals(password)){
				System.out.println("Access Granded");
				break;
			}else{
				attampts--;
				System.out.print("invalid"+ attampts );
				 
				if (attampts > 0){
					System.out.print("faild:" + attampts);
				}else{
					System.out.print("locked!");
				}
			}
		}
	
	}
}
