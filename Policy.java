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
   
   
   public Policy (int p)
   {
      policyNumber = p;
   }
         
   public void setAge(int age)
   {
      this.age = age;
   }
   public int getAge()
   {
      return this.age;
   }        
   
   public void setHeight(int height)
   {
      this.height = height;
   }
   public int getHeight()
   {
      return this.height;
   }        
   
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   public String getProviderName()
   {
      return providerName;
   }       
   
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   public String getFirstName()
   {
      return this.firstName;
   }        
   
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }
   public String getLastName()
   {
      return this.lastName;
   }        
   
   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }
   public String getSmokingStatus()
   {
      return this.smokingStatus;
   }       
   
   public void setWeight(double weight)
   {
      this.weight = weight;
   }
   public double getWeight()
   {
      return this.weight;
   }        
 
   public double getBMI()
   {
      double w = getWeight();
      int h = getHeight();
      final double BMI = ( w * 703 ) / ( h*h); 
      return BMI;
   }
   
   public double getInsurancePrice()
   {
      double totalPrice = 0;
      final int baseFee = 600;
      int a = getAge();
      String s = getSmokingStatus();
      double bmi = getBMI();
      double additional = 0;
      if(a > 50)
      {
         totalPrice = baseFee + 75;
      }
      else
      {
         totalPrice = baseFee;
      }
      if(s == "smoker" )
      {
         totalPrice = baseFee + 100;
      }
      else     
       {
         totalPrice = baseFee;
      }
     
      if(bmi > 35)
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