import java.util.*;
class Program3{
    static String[] splitWords(String s){
        ArrayList<String> list=new ArrayList<>();
        String word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ') word+=s.charAt(i);
            else{
                if(!word.equals("")) list.add(word);
                word="";
            }
        }
        if(!word.equals("")) list.add(word);
        return list.toArray(new String[0]);
    }
    static int myLength(String s){
        int c=0;
        try{
            while(true){ s.charAt(c); c++; }
        }catch(Exception e){}
        return c;
    }
    static String[][] make2D(String[] words){
        String[][] res=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            res[i][0]=words[i];
            res[i][1]=String.valueOf(myLength(words[i]));
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[][] arr=make2D(splitWords(s));
        for(String[] r:arr){
            System.out.println(r[0]+" "+Integer.parseInt(r[1]));
        }
    }
}