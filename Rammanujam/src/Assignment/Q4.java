package Assignment;
//PROGRAM TO CHECK WHETHER THE NUMBER IS PRIME NUMBER OR NOT......
public class Q4 {
	public static void main(String args[]) {
		int num = 28;
		boolean isPrime = true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0);
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(num + " is a Prime Number");
		}
		else
		{
			System.out.println(num + " it is not a prime number");
		}
	}

}
