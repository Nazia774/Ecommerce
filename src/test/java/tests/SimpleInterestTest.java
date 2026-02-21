package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleInterestTest {
	SimpleInterest s;

    @BeforeMethod
    public void setup() {
        s = new SimpleInterest();
    }

    @Test
    public void testSimpleInterest() {
        Assert.assertEquals(s.calculateSi(10, 5, 15), 7.5, 0.01);
    }
    @Test
    public void testSim() {
        Assert.assertEquals(s.calculateSi(10, 5, 15), 7.5, 0.01);
    }
    @Test
    public void testSimpleInteres() {
        Assert.assertEquals(s.calculateSi(10, 5, 15), 7.5, 0.01);
    }
}
