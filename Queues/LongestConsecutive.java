import java.util.*;
class LongestConsecutive {
    public static void main(String[] args){
        int[] arr={100,4,200,1,3,2};
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr) set.add(num);

        int longest=0;
        for(int num:arr){
            if(!set.contains(num-1)){
                int curr=num, count=1;
                while(set.contains(curr+1)){
                    curr++; count++;
                }
                longest=Math.max(longest,count);
            }
        }
        System.out.println(longest);
    }
}