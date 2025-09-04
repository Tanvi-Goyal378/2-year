import java.util.*;
class count{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=obj.nextLine();
        int v=0;
        int c=0;
        int s=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                v++;
            }
            else if((a<='z' && a>='a')||(a<='Z' && a>='A')){
                c++;
            }
            else
                s++;
        }
        System.out.println("count of vowel: "+v);
        System.out.println("count of consonants: "+c);
        System.out.println("count of symbol: "+s);
    }
}