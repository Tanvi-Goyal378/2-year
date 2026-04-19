import java.util.*;
class PairWithSum {
    public static void main(String[] args){
        int[] arr={1,4,45,6,10,8};
        int target=16;
        HashSet<Integer> set=new HashSet<>();

        for(int num:arr){
            if(set.contains(target-num)){
                System.out.println("Pair Found");
                return;
            }
            set.add(num);
        }
        System.out.println("No Pair");
    }
}