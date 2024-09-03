import java.util.Scanner;
public class gradeCalculator {
 public static void main(String[] args) {
 int totalmarks = 0;
 Scanner input =new Scanner(System.in);
 System.out.println("\tWELCOME TO GRADE CALCULATOR!!");
 System.out.print("Enter total number of subjects:: ");
 int totalSubjects=input.nextInt();
 for(int i =1;i<=totalSubjects;i++){
 System.out.print("Enter the marks obtained in subject number "+i+": "); 
 int marks = input.nextInt();
 if (marks<=100){
  totalmarks+=marks; 
 }else{
  
  System.out.println("Marks must be less than 100");
  break;
 }
   }
   double averagePercentage = (double) totalmarks / (totalSubjects * 100) * 100;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'O';
        } else if (averagePercentage >= 80) {
            grade = 'A';
        } else if (averagePercentage >= 70) {
            grade = 'B';
        } else if (averagePercentage >= 60) {
            grade = 'C';
        } else if(averagePercentage >=50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("======================================================");
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
    

        input.close();
    
  } 
}
