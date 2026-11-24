import java.util.Scanner;
public class QuizScore {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   
    
    int total = 0;
    int counter = 1;
    while (counter <= 10){
      System.out.print("Enter grade: ");
      int number = input.nextInt();
      total+= number;
      counter++;
   }
    
    double average= total/10;
    System.out.print(average);
  }
}
       
