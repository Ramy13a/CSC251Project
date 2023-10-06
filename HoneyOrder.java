public class HoneyOrder{

   //creating variables

   private int size;
   private int quantity; 
   private String type;   
   private double price;
  
   // no arg constructor
   public HoneyOrder()
   {
      size = 0;
      quantity = 0;
      type = "";
      price = 0;
   }

   /*
      Constructor that accepts argument for each field
      @param s is the size
      @param q is the quantity in lb
      @param t is the type of honey 
   */

   public HoneyOrder(int s, int q, String t, double p)
   {
      size = s;
      quantity = q;
      type = t;
      price = p;
   
   }

   //setters
   

   
     /**
      the setType method sets the type of flowers
      @param t for type
   */

   public void setType(String t)
   {
      type = t;
   }


   
     /**
      setSize is the size per bottle for the honey order
      @param s is the size
   */
   public void setSize(int s)
   {
      size = s;
   }

     /**
      setQuantity is the quantity set per pound
      @param q is quantity
   */
   public void setQuantity(int q)
   {
      quantity = q;
   }
   // setPrice is the price of each flower
   // @param p is price
   public void setPrice(int p)
   {
      price = p;
   }
   //getters 
   
   /**
      The getType method returns the type to the honey order
      @return type
   */
    public String getType(){
        return type;
    }   



    /**
     getSize returns the size per bottle for the honey order
      @return type
   */
    public int getSize()
    {
        return size;
    }      

    
        /**
     getQuantity returns the size per pound
      @return quantity
   */
    public int getQuantity()
    {
        return quantity;
    }      
    //getPrice returns the price of each flower
    //@return returns price
   public double getPrice()
   {
      return price;
   }
   
   public double getTotalPrice()
   {
      return getQuantity() * getPrice();
   }

   
   
   
   
   
   
   
}