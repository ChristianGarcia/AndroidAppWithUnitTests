package dev.garcia.christian.appwithtests;

import org.junit.Before;
import org.junit.Test;

import dev.garcia.christian.appwithtests.calculator.Calculator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Christian on 8/1/14.
 */
public class CalculatorTest {

    private Calculator mCalculator;

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    @Test
    public void testAdd2Plus3_ShouldGive5() {
        int sum = mCalculator.add(2, 3);
        assertThat(sum, is(equalTo(6)));
    }
}
