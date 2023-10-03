import java.util.Scanner;
import java.io.*;
public class Project_Ramy_Cheaib 
{   
   public static void main(String[] args) throws IOException
   {
      // open the file 
      File file = new File("PolicyInformation.txt");
   
      //declare variables
      String policyNumber,
             providerName,
             firstName,
             lastName,
             smokingStatus;
      int age;
      
      double height,
             weight;
      Scanner inputFile = new Scanner(file); // create scanner with file object
   
      //getting the user's input  
      System.out.print("Please enter the Policy Number: ");
      System.out.println(inputFile.nextLine());
            
      System.out.print("Please enter the Provider Name: ");
      System.out.println(inputFile.nextLine());
          
      System.out.print("Please enter the Policyholder's First Name: ");
      System.out.println(inputFile.nextLine());
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      System.out.println(inputFile.nextLine());
      
      System.out.print("Please enter the Policyholder's Age: ");
      System.out.println(inputFile.nextLine());
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      System.out.println(inputFile.nextLine());
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      System.out.println(inputFile.nextLine());
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      System.out.println(inputFile.nextLine());
      
      //create a Policy object
      
      //put a blank line before the output
      System.out.println();
      
      
      //display information about the Policy
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getLastName());
      System.out.println("Policyholder's Age: " + policy.getAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
   }
}