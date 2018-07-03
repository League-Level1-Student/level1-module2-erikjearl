import java.util.Random;

public class Vault {
	 int code;
	
	 public Vault() {
		 Random r = new Random();
		 code = r.nextInt(100000) + 1 ;
	 }
	 
	  boolean tryCode(int num) {
		if (code == num) {
			return true;
		}
		else {
			return false;
		}
	}
		
	
}
