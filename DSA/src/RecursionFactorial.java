public class RecursionFactorial {
    public static int factorial(int n)
    {
        if( n <2 ) return n;
        return n * factorial(n-1);
    }
}
