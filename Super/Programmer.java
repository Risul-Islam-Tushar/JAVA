
package Super;

public class Programmer extends Employee {
    String designation;
    
    Programmer(String n,String p,String d){
        super(n,p);
        designation = d;
    }
    
    @Override
    void manage(){
    super.manage();
        System.out.println("Designation:"+designation);
    }
}
