package basic;
import java.util.Scanner;
public class Problem {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number to check prime or not");
		int n=scan.nextInt();
		boolean f=isPrime(n);
		if(f) {
			System.out.println("Yes the number is prime");
		}else {
			System.out.println("The number is not prime");
		}
	}

	private static boolean isPrime(int n) {
		if(n==1 || n==0 || n==2) return false;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}
