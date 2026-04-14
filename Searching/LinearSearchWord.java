class LinearSearchWord {
    public static void main(String[] args) {
        String[] sentences = {"hello world", "java programming", "open ai"};
        String target = "java";

        for(String s : sentences){
            if(s.contains(target)){
                System.out.println(s);
                return;
            }
        }
        System.out.println("Not Found");
    }
}