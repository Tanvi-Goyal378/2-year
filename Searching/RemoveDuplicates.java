import java.util.*;
class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder result = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for(char c : str.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}