package h2;

public class H2_main {
	public static void main(String[] args) {
		int i,j,k,min,max;
		i = 4;
		j = 2;
		k = 453;
		min = 21;
		max = 45;
		if (i > j && i > k) {
			max = i; 
			if (k < j){
				min = k;
			}
			if (j < k){
				min =j; 
			}
		}
		if (j > i && j > k) {
			max = j; 
			if (i < k) {
				min = i; 
			}
			if (k < i) {
				min = k; 
			}
		}
		if (k > j && k >i) {
			max = k; 
			if (j < i) {
				min = j; 
			}
			if (i < j) {
				min = i;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
