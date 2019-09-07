
public class TwoDArray {

	public static void main(String[] args) {
		int x[][] = new int[3][];
		x[0] = new int[10];
		x[1] = new int[20];
		x[2] = new int[30];
		for(int i = 0; i<x.length;i++) {
			for(int j = 0; j<x[i].length; j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		x[1][5] = 1;
		x[1][6] = 1;
		System.out.println("After Booking");
		for(int y[]:x) {
			for(int z: y) {
				System.out.print(z+" ");
			}
			System.out.println();
		}
//		for(int i = 0; i<x.length;i++) {
//			for(int j = 0; j<x[i].length; j++) {
//				System.out.print(x[i][j]+" ");
//			}
//			System.out.println();
//		}

	}

}
