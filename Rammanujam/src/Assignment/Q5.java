package Assignment;

public class Q5 {
	public int addNumbers(int a, int b) {
	    int sum = a + b;
	    int average = sum/2;
	    return average;
	  }
	  public static void main(String[] args) {
	   
	    int num1 = 25;
	    int num2 = 15;
	    // create an object of Main
	    Q5 obj = new Q5();
	    // calling method
	    int result = obj.addNumbers(num1, num2);
	    System.out.println("Average is: " + result);
	  }
	}


