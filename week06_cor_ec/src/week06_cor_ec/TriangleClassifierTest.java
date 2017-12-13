package week06_cor_ec;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleClassifierTest {

//	Two inputs are input the same EC if they result in the same classification
//	or they both raise an exception 
	
//	EC1 -- input is not a triangle
//	EC1 -- result is Equilateral
//	EC2 -- result is Isosceles
//	EC3 -- result is Scalene
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testEC1() {
		TriangleClassifier.classify(0., 0., 0.);
	}
	
	
	@Test
	public void testEC2(){
		try{
			TriangleClassifier.classify(0., 0., 0.);
		}
		catch (IllegalArgumentException e){}
		
	}

}
