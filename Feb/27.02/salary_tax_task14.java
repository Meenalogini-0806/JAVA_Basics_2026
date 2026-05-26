/*class salary_tax_task14{
	public static void main(String args[])
	{
		int employee_salary=50000;//initizalion
		int bonus=10000;
		double tax; //diclaration
		double netsalry; //diclaration
	
	    System.out.println("basic salary:"+ (employee_salary+bonus));
		
		if (employee_salary > 100000){
			tax=employee_salary*3/100;
		}
		else{
			tax=employee_salary*0.01;
		}
		netsalry=(employee_salary+bonus)-tax;
		System.out.println("tax:"+tax);
		System.out.println("netsalry:"+netsalry);
		//System.out.println()
	}
}
*/
class salary_tax_task14{
	public static void main(String args[]){
		int salary=10000;
		int netsalry;
		int tax;
		
		System.out.println("Basic Salary:"+salary);
		if(salary > 10000){
			tax=salary*3/100;
		}else{
			tax=salary*1/100;
		}
		netsalry=(salary-tax);
		System.out.println("tax:"+tax);
		System.out.println("Netsalary:"+netsalry);
	}
}