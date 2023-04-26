
public class PerfectNumber {
	public static void main(String[] args) {
		boolean result = isPerfectNumber(30);
		System.out.println("perfect number status"+result);
	}
	public static boolean isPerfectNumber(int number);{
	int half = number / 2;
	int sum = 0;
	int remainder  = 0;
	int counter = 1;
	
	while(counter<=half) {
		remainder = number % counter;
	if(remainder ==0) {
		sum = sum + counter;
	}
	counter++;
	}
	System.out.println(sum);
	if(number == sum) {
		return true;
	}
	else
		return false;
	
	}
}

