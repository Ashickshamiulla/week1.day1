package week1.day1;

public class Palindrome {

	
	public static void main(String[] args) {
		int num = 34343;
		int rev = 0;
		
		for(int i=5; i>0; i--) {
			rev =  num % 10; 
			num = num /10;
			System.out.println(num);
			System.out.println(rev);
		}
		
		System.out.println(rev);
		
		}
}
