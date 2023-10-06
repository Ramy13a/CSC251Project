import java.util.Scanner;
import java.util.ArrayList;
public class HoneyOrderDemo{
   public static void main (String[] args)
   {
   // variables 
   ArrayList<HoneyOrder> order = new ArrayList<HoneyOrder>();
   Scanner sc = new Scanner(System.in);
   HoneyOrder honeyorder = new HoneyOrder();
   int typeOfHoney;
   int numberOfPounds = 0;
   String name;
   String repeat = "";   
   double price = 0.0;
   // array to get type of honey / quantity / priceperpound
   double[][] honeyType = new double[5][2];
   //input from user
   do{
      System.out.println("Type of Honey:\n \t1. Orange Blossom\n\t2. WildFlower\n\t3. Clover");
      System.out.println("Select The Type of honey:");
      typeOfHoney = sc.nextInt();
      while (typeOfHoney < 1){
                System.out.print("\nIncorrect number, please try again! \n Enter a number from 1-3");
                typeOfHoney = sc.nextInt();
      }
   //turning int to string for setters
      if(typeOfHoney == 1)    
         name = "Orange Blossom";
         else if(typeOfHoney == 2)
            name = "Wildflower";
            else
               name = "Clover";
      
      System.out.println("Enter the number of pounds ordered" );
      
      while(sc.hasNextInt() == false){  // ensuring the input is int
         if(sc.hasNextInt()){       
            numberOfPounds = sc.nextInt();
            // while loop to confirm pounds over 0
            while (numberOfPounds < 0){
                System.out.print("\nIncorrect number, please try again! \n Enter a Positive number");
                numberOfPounds = sc.nextInt();
            }
            }
            else{
            System.out.println("You must enter a whole number. Try again:");  
            sc.next();
            }
            
            // setting price
        if(typeOfHoney == 1 && numberOfPounds < 35){
           price = 1.25;
           honeyorder.setPrice(price);
        }//
        else{
           price = 1.15;
           honeyorder.setPrice(price);
        }   
        if(typeOfHoney == 2 && numberOfPounds < 35){
           price = 1.10;
           honeyorder.setPrice(price);
        }
        else{
           price = 1.05;
           honeyorder.setPrice(price);
         }  
        if(typeOfHoney == 3 && numberOfPounds < 35){
        price = 1.00;
        honeyorder.setPrice(price);
        }
        else{
          price = 0.97;
          honeyorder.setPrice(price);
         }

        
   //setters 
   honeyorder.setType(name);
   honeyorder.setQuantity(numberOfPounds);
   
   //array 

   // repeating code
    } 
    System.out.println("Would you like to enter another order of honey(Y/N)?:");  
    repeat = sc.nextLine();
    repeat = sc.nextLine();
    repeat = sc.nextLine();
    
    while (!repeat.equalsIgnoreCase("y") && !repeat.equalsIgnoreCase("n")){
           System.out.print("please try again! \nDo you wish to enter information for another assembly line (Y/N)? ");
           repeat = sc.nextLine();
           
    //new line
    System.out.println();      

    }
    }while(repeat.equalsIgnoreCase("y")); 
    

 
   
   
   //output / getters
   System.out.println("Honey Sales Report");
   
   System.out.println(); // new line
   
   // loop to add all iterations for output
   
  for (int i = 0; i < order.size(); ++i){
       System.out.println("Type of honey: " + order.get(i).getType() + "\n Amount(lb): " + order.get(i).getQuantity());
       }
       

   


}
}