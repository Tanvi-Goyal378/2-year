import java.util.*;
class Program9{
    static boolean leap(int y){
        return (y%400==0)||(y%4==0&&y%100!=0);
    }
    static int days(int m,int y){
        int[] d={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2 && leap(y)) return 29;
        return d[m];
    }
    static int firstDay(int m,int y){
        int d=1;
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        return (d+x+31*m0/12)%7;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),y=sc.nextInt();
        int fd=firstDay(m,y);
        int nd=days(m,y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i=0;i<fd;i++) System.out.print("    ");
        for(int i=1;i<=nd;i++){
            System.out.printf("%3d ",i);
            if((i+fd)%7==0) System.out.println();
        }
    }
}