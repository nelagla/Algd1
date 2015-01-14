import java.util.Random;

public class _sort {
	private static Random random = new Random();
	private static final int ARRAY_LENGTH = 5000;
	
	public static void main(String[] args) {
	//	int[] values = new int[ARRAY_LENGTH];
		int[] values = {7,3,8,2,-6,9,10,0};
		
	//	long time1 = System.currentTimeMillis();
	//	fillWithRandom(values);
	//	System.out.println(System.currentTimeMillis()-time1);
		
	//	long time = System.currentTimeMillis();
		for (int i : values) System.out.print(i + ", ");
		System.out.println();
		sort(values, 0, values.length-1);
	//	System.out.println(System.currentTimeMillis()-time);
		for (int i : values) System.out.print(i + ", ");
	}
	
	public static void sort(int[] a, int l, int r) {
		// divide
		for (int i : a) System.out.print(i + ", ");
		System.out.println();
	//	int p = a[random.nextInt(a.length)];
		int p = a[(l+r)/2];
		System.out.println("pivot: " + p);
		int i = l, j = r;
		int temp;
		do {
			while(a[i]<p) i++;
			while(a[j]>p) j--;
			if(i<=j) {
				System.out.println("change: "+ a[i] + " " + a[j]);
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		} while(i<j);
		// conquer
		if(j>l) sort(a,l,j);
		if(r>i) sort(a,i,r);
	}
	
	public static void fillWithRandom(int[] a) {
		int max = Integer.MAX_VALUE;
		for(int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(max);
		}
	}
	
	public static void fillWithValue(int[] a, int value) {
		for(int i = 0; i < a.length; i++) {
			a[i] = value;
		}
	}
	
	public static void fillWithInvertedSorted(int[] a) {
		for(int i = 0; i < a.length; i++) {
			a[i] = a.length-i;
		}
	}
	
	public static void fillWithSorted(int[] a) {
		for(int i = 0; i < a.length; i++) {
			a[i] = i;
		}
	}
}
