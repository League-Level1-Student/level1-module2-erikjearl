
public class PopcornRunner {

	
	public static void main(String[] args) {
		Microwave m = new Microwave();
		Popcorn p = new Popcorn("butter");
		 
		
		m.putInMicrowave(p);
		m.setTime(2);
		m.startMicrowave();
		
		p.eat();
		
		
		
	}
}
