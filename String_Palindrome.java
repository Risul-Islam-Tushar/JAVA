
package Package_3;

public class String_Palindrome {
    public static void main(String[] args) {
        String s1 = "545";
        
        StringBuffer sp = new StringBuffer(s1);
        
        String s2 = sp.reverse().toString();
        
        if (s1.equals(s2)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Non-Palindrome");
        }
        
        
    }
}
