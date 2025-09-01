public class Null {
    public static void main(String[] args) {

        
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }

       
        String text2 = null;

        try {
            System.out.println(text2.length());
        } catch (Exception e) {
            System.out.println("RuntimeException handled safely");
        }
    }
}
