
package Super;

public class Employee {
    String name;
    String phone;
    
    
    Employee(String n,String p){
        name = n;
        phone = p;
        
    }
    
    void manage(){
        System.out.println("Name :"+name);
        System.out.println("Phone :"+phone);
        
    }
}
