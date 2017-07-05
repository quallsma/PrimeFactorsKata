package PrimeFactor;


import java.util.ArrayList;
import java.util.List;

public class PrimeFactorGenerator {

    public boolean IsPrime(int number){
        for(int index = 2; index <= number / 2; index++){
            if(number % index == 0)
                return false;
        }
        return true;
    }

    public List<Integer> GetPrimeFactors(int number){

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
