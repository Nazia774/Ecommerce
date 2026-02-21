package tests;

public class SimpleInterest {
    public double calculateSi(double principle, double rate, double time) {
    	if(principle<=0 || rate<=0 ||time<=0) {
    	    throw new IllegalArgumentException("Principle, Rate and Time must be greater than zero");
    	    
    	}
    	return (principle*rate*time)/100;
    }
}
