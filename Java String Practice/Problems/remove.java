import java.util.*;
class remove{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = obj.nextLine();
        System.out.print("Enter a character to remove: ");
        char remove = obj.next().charAt(0);
        String str1=" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=remove){
                str1+=str.charAt(i);
            }
            else
                System.out.println("remove character is not exist");
        }System.out.println("String after removing '" + remove + "': " + str1);
        }}