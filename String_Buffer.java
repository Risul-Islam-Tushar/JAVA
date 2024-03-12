
package Package_3;

public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Risul");
        
        System.out.println(sb);
        
        sb.append(" Tushar");
        System.out.println(sb);
        
        sb.delete(0,4);
        System.out.println(sb);
    }
}
