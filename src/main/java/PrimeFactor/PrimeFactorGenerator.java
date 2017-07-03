package PrimeFactor;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorGenerator {
    public boolean IsPrime(int number){
        int halfOfNumber = number / 2;
        int index = 2;
        while(index <= halfOfNumber){
            if (number % index == 0)
                return false;
            index++;
        }

        return true;
    }

    public List<Integer> GetPrimeFactors(int number){
        return Arrays.asList(1);
    }
}
