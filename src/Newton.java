
class Newton {

    //Method used to solve the function:
    static void newtonRaphson(double x, double epsilon) {
        double k = Main.function(x) / Main.derivative(x);
        while (Math.abs(k) >= epsilon) {
            k = Main.function(x) / Main.derivative(x);
            x = x - k;
        }
        System.out.println("Result for the Newton-Raphson method: " + x);
    }
}
