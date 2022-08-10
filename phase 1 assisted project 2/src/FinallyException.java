
 class FinallyException 
	 {
	   public static void main(String[] args)
	   {
	     int a[] = new int[1];
	     System.out.println("out of try");
	     try
	     {
	       System.out.println("Access invalid element"+ a[0]);
	       
	     }
	     finally
	     {
	       System.out.println("finally is always executed.");
	     }
	   }
	 }