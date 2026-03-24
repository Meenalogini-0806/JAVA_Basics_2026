class IrregularArray {
	public static void main(String args[]){
		int[][] x=new int[4][];
		
		x [0]= new int[2];
		x [1]= new int[2];
		x [2]= new int[3];
		x [3]= new int[3];
		
		for (int i=0; i<4; i++){
			for(int y=0; y<x[i].length; y++){
				System.out.println(x[i][y]);
			}
			System.out.println("");
		}
	}
}