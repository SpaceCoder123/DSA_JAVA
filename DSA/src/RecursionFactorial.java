public class RecursionFactorial {
    public static int factorial(int n)
    {
        if( n <2 ) return n;
        return n * factorial(n-1);
    }
    public static int sumOfNumbers(int num)
    {
        if(num == 0)
        {
            return 0;
        }
        // ex: 123 = 1+2+3 = 6;
        // using recursion
        // step 1 => input is 12345, output = 15;
        // step 2 => 12345% 10 = 5  + again this function is called with 1234 as input
        // step 3 => 1234% 10 = 4 + again this function is called with 123 as input
        // step 4 => 123% 10 = 3 + again this function is called with 12 as input
        // step 4 => 12% 10 = 2 + again this function is called with 1 as input
        // step 5 => 1 % 10 = 0 therefore the function returns 0;

        // next zero is added in step 5 with 1;
        // 1 is added in step 4 with 2 = 3;
        // 3 is added in step 3 with 3 = 6;
        // 6 is added in step 2 with 4 = 10;
        // 10 is added in step 1 with 5 = 15;

        // returns 15;
        return  (num%10) + sumOfNumbers(num/10);
    }

    public static int productOfNumbers(int num)
    {
        if(num == 0) {
            return 1; // notice the change in the logic
        }
        return  (num%10) * productOfNumbers(num/10);
    }
    static int total = 0;
    public static int reverseNumber(int ...num)
    {
        if(num[0] == 0)
        {
            return 1;
        }
        // 1234
        // 4321
        System.out.println(total);
        total = num[0]%10;
        return (total * 10) + reverseNumber(num[0]/10);
        // under production solve later
    }
}
