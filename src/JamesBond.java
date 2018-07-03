
public class JamesBond {

	int findCode(Vault v) {
		
		for (int i =0; i<1000000; i++) {
			v.tryCode(i);
			
			if (v.tryCode(i)) {
				return i;
			}
		}
		
		return -1;
	
	}
	
}
