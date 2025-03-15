public class exemplofuncao {
     public static void main(String[] args) throws Exception 
    {
 
    System.out.println("Absoluto:" + Math.abs(-5));
    System.out.println("Máximo:" + Math.max(5, 10));
    System.out.println("Mínimo:" + Math.min(5, 10));
    System.out.println("Potenciação:" + Math.pow(2, 3));
    System.out.println("Arredondamento:" + Math.round(6.7654));

    double numberToRound = 3.14159;
    int decimalPlaces = 2;
    double roundedNumber = Math.round(numberToRound * Math.pow(10, decimalPlaces)) / Math.pow(10, decimalPlaces);
    System.out.println("Arredondamento com 2 decimais:" + roundedNumber); 

 }
 
}
