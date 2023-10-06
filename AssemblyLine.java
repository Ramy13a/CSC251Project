
public class AssemblyLine
{
   // creating variables  
   private String assemblyLine;
   private int widgetsTotal,
               widgetsRejected;
               
               
   // initializing each field
   public AssemblyLine()
   {
      assemblyLine = "";
      widgetsTotal = 0;
      widgetsRejected = 0;
   }
   // setting the assemblyLine variable
   public void setAssemblyLine(String a)
   {
      assemblyLine = a;
   }
   // method to get the assemblyline from main 
   public String getAssemblyLine()
   {
      return assemblyLine;
   }

   //@param setWidgetsTotal to set the widgets total from the main file
   // @param w the variable set to widgets total
   public void setWidgetsTotal(int w)
   {
      widgetsTotal = w;
   }
   
   public int getWidgetsTotal()
   {
      return widgetsTotal;
   }
   
   public void setWidgetsRejected(int r)
   {
      widgetsTotal = r;
   }
   
   public int getWidgetsRejected()
   {
      return widgetsRejected;
   }
   
   public int getAcceptableWidgets()
   {
      return getWidgetsTotal() - getWidgetsRejected();
   }

   public int getAssemblyQuality()
   {
      return getAcceptableWidgets() / getWidgetsTotal(); 
   }


}