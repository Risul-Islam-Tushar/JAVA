
package Package_3;

public class String_02 {
    public static void main(String[] args) {
        
        String country = "     Bangladesh     ";
        System.out.println(country);
        
        
        String trim = country.trim();
        System.out.println(trim);
        
        
        char ch = country.charAt(5);
        System.out.println("char= "+ch);
        
        int index = country.indexOf('d');
        System.out.println("Index = "+index);
        
    }
}
