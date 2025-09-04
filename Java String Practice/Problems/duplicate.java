import java.util.*;
class duplicate{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=obj.nextLine();
        int l=str.length();
        String str2=str;
        int c=0;
        String str3="";
       for(int i=0;i<l;i++){
    c = 0;  
    for(int j=0;j<l;j++){
        if(str.charAt(i) == str2.charAt(j)){
            c++;}}
    if(str3.indexOf(str.charAt(i)) == -1){
    str3 += str.charAt(i);}}
    System.out.println("string without duplicates: " + str3);
}}