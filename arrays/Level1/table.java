import java.util.*;
class table{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=sc.nextInt();
        int[] table=new int[10];
        int i=1;
        for( i=1;i<=10;i++){
            table[i-1] =num*i;}
        for(i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+table[i-1]);
        }}}
