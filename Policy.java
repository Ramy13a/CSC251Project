public class Policy
{  //fields
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private int height;
   private int weight;

   //constructors
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   public Policy(String pNumber, String pName, String fName, String lName,int a, String sStatus, int h, int w)
   {
      policyNumber = pNumber;
      providerName = pName;
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
   
   //setters//
   // @param pNumber policy Number
   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }
   // @param pName is the Providers Name
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   // @param fName is the first name of the provider
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   // @param lName is the last name of the provider
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   // @param a is the age of the provider
   public void setAge(int a)
   {
      age = a;
   }
   // @param sStatus is the smoking status of the provider
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   // @param h is the Height of the provider
   public void setHeight(int h)
   {
      height = h;
   }
   // @param w is the weight of the provider
   public void setWeight(int w)
   {
      weight = w;
   }

   
   //getters//
   // @param getPolicyNumber gets the Policy Number
   // @return returns the policy Number
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   // @param getProviderName is the providers Name
   // @return providerName returns the Providers Name
   public String getProviderName()
   {
      return providerName;
   }
   // @param getFirstName gets the providers first name
   // @return firstName returns the providers first name
   public String getFirstName()
   {
      return firstName;
   }
   // @param getLastName gets the providers last name 
   // @return lastName returns the providers last name
   public String getLastName()
   {
      return lastName;
   }
   // @param getAge gets the providers age
   // @return age returns the providers age
   public int getAge()
   {
      return age;
   }
   // @param getSmokingStatus gets the providers smoking status
   // @return smokingStatus returns the smoking status of the provider
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   // @param getHeight gets the providers height 
   // @return height returns the providers height
   public double getHeight()
   {
      return height;
   }
   // @param getWeight gets the providers weight
   // @return weight returns the weight of the provider
   public double getWeight()
   {
      return weight;
   }
   
   // @param getBMI gets the bmi from the provider's information
   // @return returning the calculations to get the correct BMI 
   //Calculates the Policyholder's BMI
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }
   // @param BASE_PRICE is the base price of the policy
   // @param ADDITIONAL_FEE_AGE is the additional fee is they're over 50 years old
   // @param ADDITIONAL_FEE_SMOKING is the additional fee if they're smoking
   // @param ADDITIONAL_FEE_PER_BMI is the additional fee if they're above 35 BMI 
   // @param AGE_THRESHOLD is the age threshold until the price goes up
   // @param BMI_THRESHOLD is the bmi amount before the price goes up
   // @param price is the final price of the policy
   // @return returning price which is the final price of the policimpo
   //Calculates the Policy's price
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(age > AGE_THRESHOLD) //over 50 years
         price += ADDITIONAL_FEE_AGE; //75
         
      if(smokingStatus.equalsIgnoreCase("smoker")) 
         price += ADDITIONAL_FEE_SMOKING; //100
            
      //call the getBMI method
      if(getBMI() > BMI_THRESHOLD) //BMI over 35
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); //additional BMI fee - 20
         
      return price;
   }
}