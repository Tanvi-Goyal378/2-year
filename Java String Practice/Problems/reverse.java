import java.util.*;
class reverse{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=obj.nextLine();
        int l=str.length();
        for(int i=l-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        }}