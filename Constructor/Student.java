
package Constructor;

public class Student {
    String name,gender,section ;
    int id;
    
    Student(String n,String g,String s, int i){
         name = n;
         gender = g;
         section = s;
         id = i;
    }
    
    void DisplayInfo(){
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Section = "+section);
        System.out.println("ID = "+id);
    }
}
