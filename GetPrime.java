import java.util.Scanner;

public class GetPrimeNumbers {
public static void main(String[] args) {

Scanner inputNumber  = new Scanner(System.in);

System.out.print("Enter a value: ");
int number = inputNumber.nextInt();

boolean result = isPerfect(number);
if (result==true){
System.out.println("Number is a perfect number");
}
else{
System.out.println("Number is not perfect number");
}
}

public static boolean isPerfect(int number){
int sum = 0;
for(int counter = 1; counter < number; counter++){
if(number% counter==0){
sum+= counter;
}
}

if(number== sum){
return true;
}
else{
return false;
}
}
}


		
	
			
			
	

