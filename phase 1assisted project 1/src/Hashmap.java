
import java.util.*; 
 
class HashMapExample {
      
    public static void main(String[] args) {
            Map< String, Integer> courses = new HashMap< String,Integer>();
      
            // Add some courses.
            courses.put("Java Courses", new Integer(1));
            courses.put("Cloud Courses", new Integer(3));
            courses.put("Programming Courses", new Integer(5));
            courses.put("Data Science Courses", new Integer(7));
      
            System.out.println("Total courses: " + courses.size());    
             
            Set< Map.Entry< String,Integer> > st = courses.entrySet();    
             
            for (Map.Entry< String,Integer> me :st) 
            { 
                System.out.print(me.getKey()+":"); 
                System.out.println(me.getValue()); 
            } 
            System.out.println();
      
            String searchKey = "Cloud Courses";
            if (courses.containsKey(searchKey))
                System.out.println("Found total " + courses.get(searchKey) + " " + searchKey);
      
        }
    }