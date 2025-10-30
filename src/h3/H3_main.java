package h3;
public class H3_main {
	public static void main(String[] args) {
		int i,j,k;
		i = 50;
		j= 230;
		k = -10;
		if (i > j ) {
			if (i <= 200 && j <= 100 ) {
				k = 1;
			}
			else if (i  > 200 && j <= 100) {
				k = 2;
			}
			else if (i > 200 && j > 100) {
				k = 3; 
			}
		} else if(i <= 200 && j <= 100) {
			k = 4; 
		}
		System.out.println(k);
}
}
