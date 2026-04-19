import java.util.*;
class StockSpan {
    public static void main(String[] args){
        int[] price={100,80,60,70,60,75,85};
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<price.length;i++){
            while(!s.isEmpty() && price[s.peek()]<=price[i]) s.pop();
            int span = s.isEmpty()? i+1 : i-s.peek();
            System.out.print(span+" ");
            s.push(i);
        }
    }
}