package FUNCTIONS;

public class binomialCoeff {

    public static int  Factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact =fact*i;
        }
        return fact;
    }

    public static int BinomialCoefficient(int n,int r){
        int n_fact=Factorial(n);
        int r_fact=Factorial(r);
        int nmrfact=Factorial(n-r);
        int finalAnswer=n_fact/(r_fact * nmrfact);
        return finalAnswer;
    }
    public static void main(String[] args) {
        System.out.println(Factorial(5));
        System.out.println(BinomialCoefficient(5, 2));
    }
}
