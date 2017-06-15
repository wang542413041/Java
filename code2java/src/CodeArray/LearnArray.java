package CodeArray;

public class LearnArray {
	public static void main(String[] args) {
		
		double[] arrayList1;		
		arrayList1 = new double[3];
		arrayList1[0] = 1.2;
		arrayList1[1] = 1.3;
		arrayList1[2] = 1.4;
		double total = 0;
		for (int i = 0; i < arrayList1.length; i++) {
			total += arrayList1[i];
		}
		System.out.println(total);
		
		double arrayList3[] = {1.2, 1.3, 1.4};
		System.out.print(arrayList3[0]);
	}
}
