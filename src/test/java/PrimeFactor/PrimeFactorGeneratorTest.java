package PrimeFactor;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class PrimeFactorGeneratorTest {

    private PrimeFactorGenerator generator;

    @Before
    public void setup() {
        generator = new PrimeFactorGenerator();
    }

    @Test
    public void TestShouldReturnTrue(){
        Assert.assertTrue(true);
    }

    @Test
    public void IsPrimeShouldReturnTrueWhenGivenOne(){
        Assert.assertTrue(generator.IsPrime(1));
    }

    @Test
    public void IsPrimeShouldReturnFalseWhenGivenFour() {
        Assert.assertFalse(generator.IsPrime(4));
    }

    @Test
    public void IsPrimeShouldReturnTrueWhenGivenFive() {
        Assert.assertTrue(generator.IsPrime(5));
    }

    @Test
    public void IsPrimeShouldReturnFalseWhenGivenSix() {
        Assert.assertFalse(generator.IsPrime(6));
    }

    @Test
    public void IsPrimeShouldReturnFalseWhenGivenNine() {
        Assert.assertFalse(generator.IsPrime(9));
    }

    @Test
    public void IsPrimeShouldReturnFalseWhenGiven49() {
        Assert.assertFalse(generator.IsPrime(49));
    }

    @Test
    public void GetPrimeFactorsReturnListOfOneWhenGivenOne() {

        Assert.assertEquals(Arrays.asList(1), generator.GetPrimeFactors(1));
    }
}
