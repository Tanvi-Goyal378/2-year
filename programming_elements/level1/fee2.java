import java.util.*;
class fee2{
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        System.out.print("enter fee");
        double fees=obj.nextDouble();
        System.out.println("enter discount");
        double dis=obj.nextDouble();
        double discount=(fees*dis)/100;
        double fee=fees-discount;
        System.out.println(" The discount amount is INR "+discount+"and final discounted fee is INR "+fee);

    }
}