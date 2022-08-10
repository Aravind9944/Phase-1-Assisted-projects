public class Bike
{  
    String name1; 
    String company; 
    int age1; 
    String color; 
     public Bike (String name1, String company, String age , String color) 
    { 
        this.name1 = name1; 
        this.company = company; 
        this.age1 = age1; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name1; 
    } 
    public String getcompany() 
    { 
        return company; 
    } 
    public int getAge() 
    { 
        return age1; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy company,age and color are " + this.getcompany()+ ", " + this.getAge()+ ", and "+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
        Bike RX100 = new Bike("RX100","YAMAHA","5","black"); 
        System.out.println(RX100.toString()); 
    } 
}
