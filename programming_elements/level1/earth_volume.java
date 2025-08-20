class earth_volume{
    public static void main(String[] args){
        int r=6378;
        double rm=6378*0.6;
        double volume=(4/3)*3.14*r*r*r;
        double v=(4/3)*3.14*rm*rm*rm;
        System.out.println("The volume of earth in cubic kilometers is "+volume+"and cubic miles is "+v);

    }
}