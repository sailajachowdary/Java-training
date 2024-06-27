package Day3.Assignment;

public class NumberMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=3;
		int column=4;
	    int Array1[][]=new int[row][column];
	    int num=1;	    
	    for(int i=0;i<row;i++) {
	    	for(int j=0;j<column;j++) {
	    	Array1[i][j]=num++;	
	    		
	    	}
	    }
	    for (int i = 0; i < row; i++) {
            for (int j = 0; j< column; j++) {
                System.out.print(Array1[i][j] + "\t");
            }
            System.out.println();
        }
	    
	}

}

