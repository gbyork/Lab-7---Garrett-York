/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Garrett York
 */
public class InsuranceEstimatorTest {
    
    public InsuranceEstimatorTest() {
    }

    public void testCalculateLifeInsurance() throws Exception {
        System.out.println("calculateLifeInsurance");
        int age = 33;
        double expResult = 465.0;
        double result = InsuranceEstimator.calculateLifeInsurance(age);
        assertEquals(expResult, result, 0.0);
       
    }
 
        public void testThatExceptionThrown() throws Exception {
        Exception exception = assertThrows(InvalidCheck.class, () -> {
        InsuranceEstimator.calculateLifeInsurance(114);
        });
    }
         public void testThatExceptionThrown1() throws Exception {
        Exception exception = assertThrows(InvalidCheck.class, () -> {
        InsuranceEstimator.calculateLifeInsurance(113);
        });
    }
}
