import java.util.Scanner;

public class Project_Ramy_Cheaib
{
   public static void main(String[]args)
   {
   // setting up variables
   int policyNumber,
               age,
               height;
   String providerName,
          firstName,
          lastName,
          smokingStatus;
   double weight;
      
      Scanner keyboard = new Scanner(System.in);
      // setters 
      System.out.println("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      Policy p = new Policy(policyNumber);
      
      System.out.println("Please enter the Provider Name: ");
      providerName = keyboard.next();
      providerName = keyboard.nextLine(); 
      p.setProviderName(providerName);
      
      System.out.println("Please enter the Policyholder’s First Name: ");
      firstName = keyboard.next();
      p.setFirstName(firstName);
      
      System.out.println("Please enter the Policyholder’s Last Name: ");  
      lastName = keyboard.next();
      p.setLastName(lastName);
      
      System.out.println("Please enter the Policyholder’s Age: ");
      age = keyboard.nextInt();
      p.setAge(age);
      
      System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.next();
      while(smokingStatus != "smoker" || smokingStatus != "non-smoker") // while / if statement to make sure they enter the right string
      
      if(smokingStatus == "smoker" )
      {
         p.setSmokingStatus("smoker");
      }
      else if(smokingStatus == "non-smoker")
      {
         p.setSmokingStatus("non-smoker");
      }
      else
      {
         System.out.println("Please enter smoker or non-smoker");
         smokingStatus = keyboard.next();
      }
      
      
      System.out.println("Please enter the Policyholder’s Height (in inches): ");
      height = keyboard.nextInt();
      p.setHeight(height);
      
      System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
      weight = keyboard.nextDouble();
      p.setWeight(weight);
      
      
     // getters and display settings
     System.out.println("Policy Number: " + policyNumber);
     System.out.println("Provider Name:  " + p.getProviderName());  
     System.out.println("Policyholder’s First Name: " + p.getFirstName());
     System.out.println("Policyholder’s Last Name: " + p.getLastName());
     System.out.println("Policyholder’s Age: " + p.getAge());
     System.out.println("Policyholder’s Smoking Status: " + p.getSmokingStatus());
     System.out.printf("Policyholder’s Height: %d.0\n " , p.getHeight());
     System.out.printf("Policyholder’s Weight: %.01f\n " , p.getWeight());    
     System.out.printf("Policyholder's BMI: %,.02f\n " , p.getBMI());
     System.out.printf("Policy Price: $%,.02f\n " , p.getInsurancePrice());
     

   }
}