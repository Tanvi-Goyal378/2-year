import java.util.*;
class toggle{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = obj.nextLine();
        
        StringBuilder sb = new StringBuilder(str);
        
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                sb.setCharAt(i, Character.toLowerCase(ch));
            }
            else if(ch >= 'a' && ch <= 'z'){
                sb.setCharAt(i, Character.toUpperCase(ch));
            }
        }
        
        System.out.println("Toggle case of String: " + sb.toString());
    }
}
