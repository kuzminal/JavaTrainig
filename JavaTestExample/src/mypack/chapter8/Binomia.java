package mypack.chapter8;

public class Binomia {
	private int[] binoms;
	
	public Binomia(int n) {
		binoms = new int[n + 1];
		binoms[0] = 1;
		
		for (int k=1; k <= n; k++) {
			binoms[k] = binoms[k-1]*(n-k+1)/k;
		}
	}
	
	public String toString() {
		String txt = "| ";
		
		for (int k=0; k<binoms.length;k++) {
			txt+=binoms[k] + " | ";
		}
		
		return txt;
	}

}
