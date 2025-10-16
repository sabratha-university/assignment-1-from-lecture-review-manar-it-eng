

public class Main {
    public static void main(String[] args) {
        SimpleLocation myHome = new SimpleLocation(32.8584585, 12.0293028, "My Home");
        SimpleLocation itCollege = new SimpleLocation(32.8536689, 12.0620891, "IT College - Sebrata University");

        double km1 = myHome.distanceTo(itCollege);
        System.out.printf("Distance (object) from %s to %s = %.3f km%n",
                myHome.getName(), itCollege.getName(), km1);
//استخدام overloading
        double km2 = myHome.distanceTo(32.8534509, 12.0604975);
        System.out.printf("Distance (coords) = %.3f km%n", km2);
    }
}