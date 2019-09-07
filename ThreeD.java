
public class ThreeD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e [] = new int[10];
		int e1[] = {10,20,30};
		int ee[][] = {{10,20},{9,10,11},{1,2,3,4,5}};
		//int [][][]x = new int[3][][];
		//int []x[][] = new int[3][][];
		//int x[][][] = {{{10,20,30},{1,2,3}}};
		int x[][][] = new int[1][][];
		x[0] = new int[2][];
		x[0][0] = new int[10];
		x[0][1] = new int[20];
		for(int y[][]:x) {
			for(int z[]:y) {
				for(int m : z) {
					System.out.print(m);
				}
				System.out.println();
			}
		}

	}

}
