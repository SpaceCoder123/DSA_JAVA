public class Main {
    public static void main(String[] args)
    {
        int out = RecursionFactorial.factorial(4);
        System.out.println(out);
        int out1= RecursionFactorial.sumOfNumbers(12345);
        System.out.println(out1);
        int out2 = RecursionFactorial.productOfNumbers(12345);
        // expected return 1*2*3*4*5 = 120;
        System.out.println(out2);
        int out3 = RecursionFactorial.reverseNumber(12345);
        System.out.println(out3);
    }

}