import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice =30;
		while(true) {
			System.out.println("Enter option based on choice" 
					+"1. add \n 2.sub \n 3. div \n 4. mul \n 5.exit");
		
	Scanner scanner = new Scanner (System.in);
    choice = scanner.nextInt();
			switch (choice) {

			case 1: {
				
				System.out.println("addition case");
				System.out.println("Pls enter 2 numbers ");
				float number1 = scanner.nextFloat();
				float number2= scanner.nextFloat();
				
				System.out.println(number1);
				System.out.println(number2);
				
				float result = add(number1,number2);
				
				System.out.println("addition result"+result);
			}
		break;
		case 2: {
			
			System.out.println("div case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result = div(number1,number2);
			
			System.out.println("div result"+result);
		}
		break;
		case 3: {
			
			System.out.println("mul case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result = mul(number1,number2);
			
			System.out.println("mul result"+result);
		}
		break;
		default:{
			System.out.println("default case");
		}
			}
		}
		
		
	}
		
		
		
		public static float add( float a , float b) {
			return a +  b ;

		}
		public static float sub( float a , float b) {
			return a -  b ;
		}
		public static float mul( float a , float b) {
			return a *  b ;
		}
		public static float div( float a , float b) {
			return a / b ;
		
		

	}

}
