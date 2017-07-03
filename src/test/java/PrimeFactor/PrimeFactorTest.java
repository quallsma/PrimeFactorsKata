package PrimeFactor;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class PrimeFactorTest {

    private PrimeFactor prime;

    @Before
    public void setup() {
        prime = new PrimeFactor();
    }

    @Test
    public void TestShouldReturnTrue(){
        Assert.assertTrue(true);
    }

    @Test
    public void IsPrimeShouldReturnTrueWhenGivenOne(){
        Assert.assertTrue(prime.IsPrime(1));
    }

    @Test
    public void IsPrimeShouldReturnFalseWhenGivenFour() {
        Assert.assertFalse(prime.IsPrime(4));
    }

    @Test
    public void IsPrimeShouldReturnTrueWhenGivenFive() {
        Assert.assertTrue(prime.IsPrime(5));
    }

    @Test
    public void IsPrimeShouldReturnFalseWhenGivenSix() {
        Assert.assertFalse(prime.IsPrime(6));
    }

    @Test
    public void IsPrimeShouldReturnFalseWhenGivenNine() {
        Assert.assertFalse(prime.IsPrime(9));
    }

    @Test
    public void IsPrimeShouldReturnFalseWhenGiven49() {
        Assert.assertFalse(prime.IsPrime(49));
    }
}
