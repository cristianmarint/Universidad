package puntos;

public class veintinueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [ ] [ ] matriz1 = { {1,2},
								{3,4},
								{5,6},
								{7,8} 
							   } ;
		int [ ] [ ] matriz2 = { 
								{9,1},
								{1,2},
								{3,4},
								{5,6} 
							  } ;
		int i=0,j=0;
		
		System.out.println("  ");
		System.out.println("SUMA");
		System.out.println("  ");
		
		for(i=0;i<4;i++) {
			for(j=0;j<2;j++) {
				//System.out.println(" "+matriz1[i][j]+" - "+matriz2[i][j]);
				System.out.print("  "+matriz1[i][j]);
			}

			System.out.print("   + ");
			
			for(j=0;j<2;j++) {
				//System.out.println(" "+matriz1[i][j]+" - "+matriz2[i][j]);
				System.out.print("  "+matriz2[i][j]);
			}
			
			System.out.print("   =  ");
			
			for(j=0;j<2;j++) {
				//System.out.println(" "+matriz1[i][j]+" - "+matriz2[i][j]);
				System.out.print("  "+(matriz1[i][j]+matriz2[i][j]));
			}

			System.out.println("  ");
			
		}
		
		System.out.println("  ");
		System.out.println("RESTA");
		System.out.println("  ");
		
		for(i=0;i<4;i++) {
			for(j=0;j<2;j++) {
				//System.out.println(" "+matriz1[i][j]+" - "+matriz2[i][j]);
				System.out.print("  "+matriz1[i][j]);
			}
			
			System.out.print("   - ");
			
			for(j=0;j<2;j++) {
				//System.out.println(" "+matriz1[i][j]+" - "+matriz2[i][j]);
				System.out.print("  "+matriz2[i][j]);
			}
			
			System.out.print("   =  ");
			
			for(j=0;j<2;j++) {
				//System.out.println(" "+matriz1[i][j]+" - "+matriz2[i][j]);
				System.out.print("  "+(matriz1[i][j]-matriz2[i][j]));
			}
			
			System.out.println("  ");
			
		}
		

		
	}

}
