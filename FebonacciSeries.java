package week1.day1;

public class FebonacciSeries {

	
	public static void main(String[] args) {
	
    int range = 8;
    int firstNum = 0;
    int secNum = 1;
    int sum=0;
    
    System.out.println(firstNum);
    System.out.println(secNum);
    
    for(int i=1; i<range; i++)
    {
	    sum = firstNum + secNum;
	    firstNum=secNum;
	    secNum=sum;
	    System.out.println(sum);  
    
 
	}
	}

	
	
	
	
	
}
