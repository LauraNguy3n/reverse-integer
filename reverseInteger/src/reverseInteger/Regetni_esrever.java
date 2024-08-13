package reverseInteger;
import java.util.Scanner;
public class Regetni_esrever {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Reverse your number(s) below!: ");
		int z = sc.nextInt();
		int reversedNumber = 0;
		//123
		
		while (z!=0) {
		int lastDigit = z%10;
		reversedNumber = reversedNumber*10+lastDigit;
		z=z/10;
		}
		
		System.out.println("your number reversed is " + reversedNumber);
	}

}
