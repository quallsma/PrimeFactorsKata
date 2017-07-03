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

        if (number <= 1)
            return Arrays.asList();

        if (IsPrime(number))
            return Arrays.asList(number);

        List<Integer> list = new ArrayList<>();
        for (int x = 2;number >= 2; x++){
            while(number % x == 0){
                list.add(x);
                number /= x;
            }
        }
        return list;
    }
}
