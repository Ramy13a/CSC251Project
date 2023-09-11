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
      p.setProviderName(providerName);
      
      System.out.println("Please enter the Policyholder’s First Name: ");
      firstName = keyboard.next();
      firstName = keyboard.next();
      p.setFirstName(firstName);
      
      System.out.println("Please enter the Policyholder’s Last Name: ");
      lastName = keyboard.next();
      p.setLastName(lastName);
      
      System.out.println("Please enter the Policyholder’s Age: ");
      age = keyboard.nextInt();
      p.setAge(age);
      
      System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker)");
      smokingStatus = keyboard.next();
      p.setSmokingStatus(smokingStatus);
      
      System.out.println("Please enter the Policyholder’s Height (in inches)");
      height = keyboard.nextInt();
      p.setHeight(height);
      
      System.out.println("Please enter the Policyholder’s Weight (in pounds):");
      weight = keyboard.nextDouble();
      p.setWeight(weight);
      
      
     // getters 
     System.out.println("Policy Number" + policyNumber);
     System.out.println("Provider Name" + p.getProviderName());  
     System.out.println("Policyholder’s First Name: " + p.getFirstName());
     System.out.println("Policyholder’s Last Name: " + p.getLastName());
     System.out.println("Policyholder’s Age: " + p.getAge());
     System.out.println("Policyholder’s Smoking Status: " + p.getSmokingStatus());
     System.out.println("Policyholder’s Height: " + p.getHeight());
     System.out.println("Policyholder’s Weight: " + p.getWeight());    
     System.out.println("Policyholder's BMI: " + p.getBMI());
     System.out.println("Policy Price: " + p.getInsurancePrice());
     

   }
}