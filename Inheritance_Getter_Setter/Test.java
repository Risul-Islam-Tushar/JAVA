
package Inheritance_Getter_Setter;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(12);
        s1.setName("Tusahr");
        s1.setId(33904);
        
        System.out.println(s1.getAge());
        System.out.println(s1.getId());
        System.out.println(s1.getName());
    }
}
