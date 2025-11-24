public class Q2 {
    public static void main(String[] args) {
        Double dObj = 45.67;

        double primitiveDouble = dObj.doubleValue();
        int primitiveInt = (int) dObj.doubleValue(); // casting

        System.out.println("Double object: " + dObj);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Primitive int (casted): " + primitiveInt);
    }
}
