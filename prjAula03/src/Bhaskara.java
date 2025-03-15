public class Bhaskara {
    
    public static void main(String[] args) throws Exception {
        
        //declaracao de variaveis
        int _a = 2, _b = 2, _c = 2;

        //formula = -b +- Raiz quadrada de delta / por 2*a

        //calculo de delta
        double _delta = Math.pow(_b, 2) - (4 * _a * _c);

        //calculando x1
        double _x1 = (-_b + Math.sqrt(_delta)) / (2 * _a);
        double _x2 = (-_b - Math.sqrt(_delta) / (2 * _a));

        System.out.println(_x1);
        System.out.println(_x2);

    }
}
