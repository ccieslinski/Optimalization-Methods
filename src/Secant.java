
class Secant {

    //Method used to solve the function:
    static void secant(double a, double b, double epsilon) {
        double x;

        if (Main.function(a) * Main.function(b) < 0)
        {
            do {
                x = (a * Main.function(b) - b * Main.function(a)) / (Main.function(b) - Main.function(a));
                a = b;
                b = x;
            } while (Math.abs(Math.abs(a)-Math.abs(b)) >= epsilon);
            System.out.println("Result for the Secant method: " + x);
        }
        else
            System.out.print("Method won't work: f(xn) * f(xn-1) has to be greater than 0");
    }
}
