import java.util.Random; // import tells us where to find Random

public class ImportExample {
	public static void main(String[] args) {
		Random r = new Random(); // DOES NOT COMPILE
		System.out.println(r.nextInt(10)); 
	}
}