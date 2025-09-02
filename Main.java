import java.util.Scanner;

public class Derivatives {
    
    public static String getPowerRule(int b, String v){
        
            return Integer.toString(b); 
    }
    
    public static String getPowerRule(int b, String v, int p){
        int base = b * p;
        int newPower = p - 1;
    
        if (newPower == 1) {
            return base + v;
        } else {
            return base + v + "^" + newPower;
        }
    }
    
    
    
    public static void getTrigDerivative(String trig, String variable) {

        if (trig.equals("sin")) {
            System.out.println("cos" + variable);
        }
        else if (trig.equals("cos")){
            System.out.println("-sin" + variable);
        }
        else if (trig.equals("tan")){
            System.out.println("sec^2" + variable);
        }
        else if (trig.equals("cot")){
            System.out.println("-csc^2" + variable);
        }
        else if (trig.equals("sec")){
            System.out.println("sec" + variable + "*tan" + variable);
        }
        else if (trig.equals("cscx")){
            System.out.println("-csc" + variable + "*cot" + variable);
        }
    }
    
    public static String getTrigDerivative(String trig, int b, String v, int p){
        
        String chainRule = getPowerRule(b, v, p);
        String argument = b + v + "^" + p;
        
        
        
        if (trig.equals("sin")) {
            return (chainRule + "cos(" + argument + ")");
        }
        else if (trig.equals("-sin")) {
            return ("-" + chainRule + "cos(" + argument + ")");
        }
        else if (trig.equals("cos")){
            return ("-" + chainRule + "sin(" + argument + ")");
        }
        else if (trig.equals("-cos")){
            return (chainRule + "sin(" + argument + ")");
        }
        else if (trig.equals("tan")){
            return (chainRule + "sec^2(" + argument + ")");
        }
        else if (trig.equals("-tan")){
            return ("-" + chainRule + "sec^2(" + argument + ")");
        }
        else if (trig.equals("cot")){
            return ("-" + chainRule + "csc^2(" + argument + ")");
        }
        else if (trig.equals("-cot")){
            return (chainRule + "csc^2(" + argument + ")");
        }
        else if (trig.equals("sec")){
            return (chainRule + "sec(" + argument + ")" + "*tan(" + argument + ")");
        }
        else if (trig.equals("csc")){
            return ("-" + chainRule + "csc(" + argument + ")" + "*cot(" + argument + ")");
        }
        else if (trig.equals("-csc")){
            return (chainRule + "csc(" + argument + ")" + "*cot(" + argument + ")");
        }
        
        return "Invalid input.";
    }
    
    public static void getTrigDerivative(String trig, int b, String v){
        
        String chainRule = getPowerRule(b, v);
        String argument = b + v;
        
        
        
        if (trig.equals("sin")) {
            System.out.println(chainRule + "cos(" + argument + ")");
        }
        else if (trig.equals("-sin")){
            System.out.println("-" + chainRule + "cos(" + argument + ")");
        }
        else if (trig.equals("cos")){
            System.out.println("-" + chainRule + "sin(" + b + v + ")");
        }
        else if (trig.equals("-cos")){
            System.out.println(chainRule + "sin(" + b + v + ")");
        }
        else if (trig.equals("tan")){
            System.out.println(chainRule + "sec^2(" + b + v + ")");
        }
        else if (trig.equals("-tan")){
            System.out.println("-" + chainRule + "sec^2(" + b + v + ")");
        }
        else if (trig.equals("cot")){
            System.out.println("-" + chainRule + "csc^2(" + b + v + ")");
        }
        else if (trig.equals("-cot")){
            System.out.println(chainRule + "csc^2(" + b + v + ")");
        }
        else if (trig.equals("sec")){
            System.out.println(chainRule + "sec*tan(" + b + v + ")");
        }
        else if (trig.equals("-sec")){
            System.out.println("-" + chainRule + "sec*tan(" + b + v + ")");
        }
        else if (trig.equals("csc")){
            System.out.println("-" + chainRule + "csc*cot(" + b + v + ")");
        }
        else if (trig.equals("-csc")){
            System.out.println(chainRule + "csc*cot(" + b + v + ")");
        }
        
    }

    public static void main(String[] args) {
        
        
        
        Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to the derivative calculator!");

    System.out.print("Enter a trig function (e.g., sin, -cos, tan, etc.): ");
    String trig = scan.nextLine().trim();

    System.out.print("Does the argument have a coefficient? (y/n): ");
    boolean hasCoefficient = scan.nextLine().trim().equalsIgnoreCase("y");

    int b = 1; 
    if (hasCoefficient) {
        System.out.print("Enter the coefficient: ");
        b = scan.nextInt();
        scan.nextLine(); 
    }

    System.out.print("Does the argument have a power? (y/n): ");
    boolean hasPower = scan.nextLine().trim().equalsIgnoreCase("y");

    int p = 1; 
    if (hasPower) {
        System.out.print("Enter the power: ");
        p = scan.nextInt();
        scan.nextLine(); 
    }

    System.out.print("Enter the variable (e.g., x): ");
    String v = scan.nextLine();


    if (!hasCoefficient && !hasPower) {
        getTrigDerivative(trig, v);
    } else if (hasCoefficient && !hasPower) {
        getTrigDerivative(trig, b, v);
    } else {
        String result = getTrigDerivative(trig, b, v, p);
        System.out.println("The derivative is: " + result);
    }
       
        
        
    }
}
