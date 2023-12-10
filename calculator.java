import java.util.Scanner;

class percentCalculator {
    
    public static double valueChange (double s, double n) {
        if (s > n) {
            return s - n;
        }
        else if (s < n) {
            return n - s;
        }
        else {
            return 69;
        }
    }
    
    public static double percentChange (double d, double s) {
        return (d / s) * 100;
    }
    public static void main(String[] args) {
        
        Scanner startingPriceScanner = new Scanner(System.in);
        
        System.out.println("Please enter starting price\n");
        
        double startP = startingPriceScanner.nextDouble();
        
        Scanner newPriceScanner = new Scanner(System.in);
        
        System.out.println("Please enter the new price\n");
        
        double newP = newPriceScanner.nextDouble();
        
        double valD = valueChange(startP, newP);
        
        double percC = percentChange(valD, startP);
        
        System.out.println("The percentage change between " + startP + " and " + newP + " is " + percC);
    }
}
