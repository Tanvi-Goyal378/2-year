import java.io.*;
class WordCountFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        int count = 0;
        String target = "hello";

        while((line = br.readLine()) != null){
            String[] words = line.split(" ");
            for(String w : words){
                if(w.equals(target)) count++;
            }
        }
        br.close();
        System.out.println(count);
    }
}