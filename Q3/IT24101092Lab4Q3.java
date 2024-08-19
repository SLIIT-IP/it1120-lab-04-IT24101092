import java.util.Scanner;

public class IT24101092Lab4Q3{
       public static void main(String[] args){
      
       int number;
        
       Scanner pz = new Scanner(System.in);

       System.out.print("Enter a number : ");
       number = pz.nextInt();
 
       String message = (number>0)?"Positive":(number<0)?"Negative":"Zero";
       System.out.println("The number is : "+message);
     }
}
