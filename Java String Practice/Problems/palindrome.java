import java.util.*;
class palindrome{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=obj.nextLine();
        int l=str.length();
        String rev="";
        for(int i=l-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("It is a palindrome");
        }
        else
            System.out.println("it is not palindrome");

        }}