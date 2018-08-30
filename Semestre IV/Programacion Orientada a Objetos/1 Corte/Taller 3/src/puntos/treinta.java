package puntos;

public class treinta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [ ] [ ] matriz = new int [8][8];
		int i=0,j=0;
		
		System.out.println("  ");
		
		for(i=0;i<8;i++) {
			for(j=0;j<8;j++) {
				if(i==j) {
					matriz[i][j]=0;
				}else if(i<j) {
					matriz[i][j]=1;
				}else {
					matriz[i][j]=2;
					
				}
			}
			
		}
		for(i=0;i<8;i++) {
			for(j=0;j<8;j++) {

				System.out.print("  "+matriz[i][j]);
			}
			System.out.println("  ");			
		}

		

		
	}

}
