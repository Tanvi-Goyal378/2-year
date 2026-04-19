import java.util.*;
class ZeroSumSubarray {
    public static void main(String[] args){
        int[] arr={6,3,-1,-3,4,-2,2,4,6,-12,-7};
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0 || map.containsKey(sum))
                System.out.println("Zero sum exists");
            map.put(sum,i);
        }
    }
}