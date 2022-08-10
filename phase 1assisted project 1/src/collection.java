import java.util.*;  
class Collection
{  
    public static void main(String args[])
    { 
    	ArrayList<String> list=new ArrayList<String>();
    	list.add("Aravind");
    	list.add("Kavi");  
        list.add("Maddy");  
        list.add("Ram");  
        Iterator itr=list.iterator(); 
        while(itr.hasNext())
        {  
        	System.out.println(itr.next()); 
        	
        }
    }
}  
