class fee{
    public static void main(String[] args){
        double fee=125000;
        double disPer=10;
        double discount=(fee*10)/100;
        double fees=fee-discount;
        System.out.println(" The discount amount is INR "+discount+"and final discounted fee is INR "+fees);

    }
}