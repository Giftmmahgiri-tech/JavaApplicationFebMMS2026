public class OperatorsPart1{
	public static void main(String[] args){
		//Assignment Operator(=)
		
		int num = 100;
		System.out.printf("Number is %d%n", num);
		
		
		//Arithmetric operators(+,-,*,/,%)
		int num1 = 50;
		int num2 = 200;
		
		int addition = num1 + num2;
		int subtraction = num1 - num2;
		int multiplication = num1 * num2;
		double division = (double)num1 / num2;
		int remainder = num1 % num2;
		
		
	
		
		System.out.println("----------------------Arithmetic output-------------");
		System.out.printf("%d + %d = %d%n",num1,num2,addition);
		System.out.printf("%d - %d = %d%n",num1,num2,subtraction);
		System.out.printf("%d x %d = %d%n",num1,num2,multiplication);
		System.out.printf("%d / %d = %.2f%n",num1,num2,division);
		System.out.printf("%d %% %d = %d%n",num1,num2,remainder);
		
		System.out.println("-----------------Arithmetic output------------------");
		
		
		System.out.println("-----------Compound Assignment Output----------------");
		//Compound assignment operator(+=,-=,*=,/=,%=)
		int number1 = 20;
		int number2 = 2;
		
		
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		number1 += number2;
		
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		number1 -= number2;
		
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		number1 *= number2;
		
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		number1 /= number2;
		
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		number1 %= number2;
		
		System.out.println("-----------------------------------------------------");
		



		int num1 = 50;
		int num2 = 80;
		int num3 = 30;
		//AND
		boolean isAND = (num1 > num2) && (num1 > num3);
		
		//OR
		boolean isOR = (num1 > num2) || (num1 > num3);
		
		//NOT
		boolean isNOT = !(num1 > num2) || (num1 > num3);
		
		
		System.out.println("-----------------------------------------------------------");
		System.out.printf(" is (%d > %d) && (%d > %d) : %b%n",num1,num2,num1,num3,isAND);
		System.out.printf(" is (%d > %d) || (%d > %d) : %b%n",num1,num2,num1,num3,isOR);
		System.out.printf(" is !(%d > %d) && (%d > %d) : %b%n",num1,num2,num1,num3,isNOT);
		
		
		System.out.println("-----------------------------------------------------------");
		
		int x = 5;
		int y = 2;
		
		//pre_increment
		System.out.println("-----------------------------------------------------------");
		System.out.println("The value of x is " + ++x);
		System.out.println("The value of y is " + ++y);
		System.out.println("-----------------------------------------------------------");
		
		//Post-increment
		System.out.println("-----------------------------------------------------------");
		System.out.println("The value of x is " + x++);
		System.out.println("The value of y is " + y++);
		System.out.println("The value of x is " + x);
		System.out.println("The value of y is " + y);
		System.out.println("-----------------------------------------------------------");
		
		//Decrement
		//pre-increment
		System.out.println("-----------------------------------------------------------");
		System.out.println("The value of x is " + --x);
		System.out.println("The value of y is " + --y);
		System.out.println("-----------------------------------------------------------");
		
		//Post-increment
		System.out.println("-----------------------------------------------------------");
		System.out.println("The value of x is " + x--);
		System.out.println("The value of y is " + y--);
		System.out.println("The value of x is " + x);
		System.out.println("The value of y is " + y);
		System.out.println("-----------------------------------------------------------");
		
		
	}
}