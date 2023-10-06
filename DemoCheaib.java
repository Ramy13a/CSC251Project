import java.util.Scanner;
import java.util.ArrayList;

public class DemoCheaib{  
   public static void main (String[] args) {  
      //setting up variables 
      String assemblyName,
             repeat = "";
      int widgetsTotal,
          widgetsRejected;
   
   
      // setting up scanners
      Scanner scan = new Scanner(System.in);
      AssemblyLine a = new AssemblyLine();
      ArrayList<AssemblyLine> assembly = new ArrayList<AssemblyLine>();
   
      // input from user and loop
   
      System.out.println("Enter the name of the assembly line: " );
      assemblyName = scan.nextLine();
      System.out.println("enter the total number of widgets manufactured: ");
      widgetsTotal = scan.nextInt();
      while(widgetsTotal < 1)
      {
         System.out.println("enter the total number of widgets manufactured: ");
         widgetsTotal = scan.nextInt();
      }

         System.out.println("Enter the number of rejected widgets manufactured: ");
         widgetsRejected = scan.nextInt();
      while( widgetsRejected > widgetsTotal)
      {
         System.out.println("Enter the number of rejected widgets manufactured:  ");
         widgetsRejected = scan.nextInt();
      }
      while( widgetsRejected < 0)
      {
         System.out.println("Enter the number of rejected widgets manufactured:  ");
         widgetsRejected = scan.nextInt();
      }
           //setters
         a.setAssemblyLine(assemblyName);
         a.setWidgetsTotal(widgetsTotal);
         a.setWidgetsRejected(widgetsRejected);
      
         System.out.printf("%.2f %" , a.getAssemblyQuality());
         System.out.println();
         
         System.out.println("Do you wish to enter information for another assembly line (Y/N)? ");
         repeat = scan.nextLine();
         repeat = scan.nextLine();
      
      
      
    
      
      do{ 
         System.out.println("Enter the name of the assembly line: " );
         assemblyName = scan.nextLine();
         System.out.println("enter the total number of widgets manufactured: ");
         widgetsTotal = scan.nextInt();
         while(widgetsTotal < 1)
         {
            System.out.println("enter the total number of widgets manufactured: ");
            widgetsTotal = scan.nextInt();
         }
      
            System.out.println("Enter the number of rejected widgets manufactured: ");
            widgetsRejected = scan.nextInt();
         while(widgetsRejected > widgetsTotal)
         {
            System.out.println("Enter the number of rejected widgets manufactured:  ");
            widgetsRejected = scan.nextInt();
         }
         while( widgetsRejected < 0)
         {
            System.out.println("Enter the number of rejected widgets manufactured:  ");
            widgetsRejected = scan.nextInt();
         }
      
            System.out.println("Do you wish to enter information for another assembly line (Y/N)? ");
            repeat = scan.nextLine();
            repeat = scan.nextLine();      
         }
         while(repeat.equalsIgnoreCase("Y"));
         
         
         
         a.setAssemblyLine(assemblyName);
         a.setWidgetsTotal(widgetsTotal);
         a.setWidgetsRejected(widgetsRejected);
      
      
      
      
      
      
      
      
      //output
         
      
      
     
   
   }



}