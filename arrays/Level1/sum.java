import java.util.*;
class sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] numbers=new double[10];
        double sum=0.0;
        int i=0;
        while (true) {
            System.out.print("Enter a number: ");
            double input = sc.nextDouble();

            if (input <= 0) {
                break;
            }
            if (i == 10) {
                break;
            }
            numbers[i] = input;
            i++;
        }

        System.out.println("Numbers entered:");
        for( int j=0;j<i;j++){
            System.out.println(numbers[j]);
            sum += numbers[j];
        }
        System.out.println("Sum = " + sum);
 }}
