package PrimeFactor;


public class PrimeFactor {
    public boolean IsPrime(int number){
        if(number <= 3)
            return true;

        int halfOfNumber = number / 2;
        while(halfOfNumber > 1){
            if (number % halfOfNumber == 0)
                return false;
            halfOfNumber--;
        }

        return true;
    }

    public int[] PrimeFactors(int number){
        return new int[]{};
    }
}
