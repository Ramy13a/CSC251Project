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
      Boolean smokingBoolean;
      int age,
          height,
          weight,
          totalSmokers=0,
          totalNonSmokers = 0;
      Scanner inputFile = new Scanner(file); // create scanner with file object
      
   while(inputFile.hasNext())
   {
      //getting the user's input  
      System.out.print("Please enter the Policy Number: ");
      policyNumber = inputFile.nextLine();
      System.out.println(policyNumber);
            
      System.out.print("Please enter the Provider Name: ");
      providerName = inputFile.nextLine();
      System.out.println(providerName);
         
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = inputFile.nextLine();
      System.out.println(firstName);
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = inputFile.nextLine();
      System.out.println(lastName);
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = inputFile.nextInt();
      System.out.println(age);
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = inputFile.nextLine();
      inputFile.nextLine();
      System.out.println(smokingStatus);
      /* 
      if(smokingStatus.equalsIgnoreCase("smoker"))
      smokingBoolean = true;
      for( int i=0; smokingBoolean = true; i++) 
      totalSmokers = i;
      
      if(smokingStatus.equalsIgnoreCase("non-smoker"))
      smokingBoolean = false;
      for( int i=0; smokingBoolean = false; i++) 
      totalNonSmokers = i;
      
      */
      

      
            
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = inputFile.nextInt();
      System.out.println(height);
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = inputFile.nextInt();
      System.out.println(weight);
     
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
    
      if(inputFile.hasNext())     
      inputFile.nextLine();
      
      if(inputFile.hasNext())
      inputFile.nextLine();
      
            
      }
      
      //System.out.println("The number of policies with a smoker is:" + totalSmokers );
      //System.out.println("The number of policies with a smoker is:" + totalNonSmokers );
      inputFile.close();
      
   }
}