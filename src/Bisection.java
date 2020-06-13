
class Bisection {

    //Method used to solve the function:
    static void bisection(double a, double b, double epsilon) {
        double x1 = a;
        while ((b-a) >= epsilon) {
            x1 = (a+b)/2;
            if (Main.function(x1) == 0)
                break;
            else if (Main.function(a) * Main.function(x1) < 0)
                b = x1;
            else
                a = x1;
        }
        System.out.println("Result for the Bisection method: " + x1);
    }
}