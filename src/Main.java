public class Main {

    //Function to be solved:
    static double function(double x) { return Math.log(Math.tan(x*x+1)) - Math.atan(1/x); }

    //Its derivative:
    static double derivative(double x) { return (2*x* 1/Math.pow(Math.cos(x*x+1),2)) / Math.tan(x*x+1)+1/((1/x*x+1)*x*x); }

    public static void main(String[]args) {

        //Epsilon for each function:
        double epsilon = 0.0001;

        //We are running each method:
        //We need a range of search fo each one
        //Newton-Raphson requires only one value
        double x = 1.5;
        Newton.newtonRaphson(x, epsilon);

        double a = 1.5, b = 1.9;
        Bisection.bisection(a, b, epsilon);

        double x1 = 1.5, x2 = 1.9;
        Secant.secant(x1, x2, epsilon);
    }
}
