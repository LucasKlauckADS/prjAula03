import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {

        //exemplo calculo

        int x = 10;

        System.out.println(x += 20);
        System.out.println(x -= 4);
        System.out.println(x *= 3);
        System.out.println( x /= 2);
        
    
        int _abs = Math.abs(5);
        System.out.println(_abs);
        
        int _min = Math.min(10, 5);
        System.out.println(_min);

        double _max = Math.max(78, 112.4);
        System.out.println(_max);

        double _pow = Math.pow(2, 3);
        System.out.println(_pow);

        double _round = Math.round(9.1241245);
        System.out.println(_round);

        
    }
}
