import java.util.Scanner;

public class IT24101092Lab4Q2 {
       public static void main(String[] args){

       double examMarks;
       double examPercentage;
       double labMarks;
       double labPercentage;
       double finalMarks;

       Scanner ex = new Scanner(System.in);

       System.out.print("Please enter exam marks (out of 100) : ");
       examMarks = ex.nextDouble();

       System.out.print("Please enter lab submission marks (out of 100) : ");
       labMarks = ex.nextDouble();

       if(0>examMarks||examMarks>100){
       System.out.println("Invalid input for exam marks. Terminating program.");
       }
       
       if(0>labMarks||labMarks>100){
       System.out.println("Invalid input for lab submission marks. Terminating program.");
       }
      
       System.out.print("Please enter the percentage given for the exam : ");
       examPercentage = ex.nextDouble();

       System.out.print("Please enter the percentage given for the lab submission : ");
       labPercentage = ex.nextDouble();
   
       if(examPercentage + labPercentage !=100){
       System.out.println("The percentages must add up to 100. Terminating program.");
       }
       else{
       finalMarks = (examMarks * examPercentage/100) + (labMarks * labPercentage/100);
       System.out.println("The final Exam mark is : " +finalMarks);
       }
    }
}


       