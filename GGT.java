public class GGT {

	public static void main(String s[]) {
		
		int m = Integer.parseInt(s[0]);
		int n = Integer.parseInt(s[1]);
		int r=1;
			if (m > 0 && n > 0) {
				int t = m;  m = n; n = t;
				r=m-n;
				m=n; n=r;
			}
			while (r>0) {	
				if (m > 0 && n > 0) {
					int t = m;  m = n; n = t;
					r=m-n;
					m=n; n=r;
			}	
		}
	System.out.println(m);
	}
}