class Hights_marks{
	public static void main(String args[]){
		int[] num={400,541,321,876};
		int max=num[0];
		
		for(int i=1; i<num.length; i++){
			if(num[i]>max){
				max=num[i];
			}
		}
		System.out.print("largest number is:"+max );
	}
}