public class Policy 
{
   private int policyNumber,
               age,
               height;
   private String providerName,
                  firstName,
                  lastName,
                  smokingStatus;
   private double weight;
   
   
   // no-arg constructor
   public Policy()
   {
      policyNumber = 0;  
   }
   
   //@param policyNumber setting policy Number to another variable
   public Policy (int p)
   {
      policyNumber = p;
   }
   //single constructor
   //@param age is the age of the provider     
   public void setAge(int age)
   {
      this.age = age;
   }
   public int getAge()
   {
      return this.age;
   }  
   //single constructor      
   //@param height is the height of the provider
   public void setHeight(int height)
   {
      this.height = height;
   }
   public int getHeight()
   {
      return this.height;
   }    
   //single constructor    
   //@param providerName is the name of the provider
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   public String getProviderName()
   {
      return providerName;
   }  
   //single constructor     
   //@param firstName is the first name of the provider
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   public String getFirstName()
   {
      return this.firstName;
   }  
   //single constructor      
   //@param lastName is the last name of the provider
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }
   public String getLastName()
   {
      return this.lastName;
   }  
   //single constructor      
   //@param smokingStatus is the status the smoker chooses he's in
   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }
   public String getSmokingStatus()
   {
      return this.smokingStatus;
   }  
   //single constructor     
   //@param weight is the weight of the provider
   public void setWeight(double weight)
   {
      this.weight = weight;
   }
   public double getWeight()
   {
      return this.weight;
   } //two constructors      
  //@param BMI is the formula to measure BMI 
   public double getBMI()
   {
      double w = getWeight();
      int h = getHeight();
      final double BMI = ( w * 703 ) / ( h*h); 
      return BMI;
   }
   //four constructors
   //@param getInsurancePrice is the price of insurance as a total
   public double getInsurancePrice()
   {
      double totalPrice = 0;
      final int baseFee = 600;
      int a = getAge();
      String s = getSmokingStatus();
      double bmi = getBMI();
      double additional = 0;
      if(a > 50) // if statement if they're older than 50
      {
         totalPrice = baseFee + 75;
      }
      else
      {
         totalPrice = baseFee;
      }
      if(s == "smoker" ) // if statement if they're a smoker 
      {
         totalPrice = baseFee + 100;
      }
      else     
       {
         totalPrice = baseFee;
      }
     
      if(bmi > 35) // if statement if their bmi is above 35
      {
         additional = (bmi - 35) * 20;
         totalPrice = additional + baseFee;
      }
      else
      {
         totalPrice = baseFee;
      }
      return totalPrice;
   }


}