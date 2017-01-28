package com.up.skill.helpers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;


/**
 * Created by JPMPC-B213 on 1/21/2017.
 */
public class HelpersTest{


   // Helpers helpers = new Helpers();

  /*  @Test
    public void forTest(){
        String name = "Jack";
        assertEquals(testName,Helpers.forTest(name));
    }*/


    String testName = "Jack12";
    String name = "Jack";
    int[] expectedOutput = {0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181};//,6765
    boolean isFibonacci = true;
    int startingPoint = 0;
    int maxLimit = 20;

    @Mock
    Helpers helper;


    @Before
    public void create(){

        initMocks(this);
        //when(helper.fibonacciSequence(8)).thenReturn(sequence);
        //when(helper.add(2,5)).thenReturn(7);
        when(helper.testThis(name)).thenReturn(testName);
        //when(helper.fibonacciSequence(startingPoint,maxLimit,expectedOutput)).thenReturn(isFibonacci);
        //when(helper.fibonacciSequence(startingPoint,maxLimit)).thenReturn(expectedOutput);
    }

    @Test
    public void testThis(){

        assertEquals(testName,helper.testThis(name));
    }

    @Test
    public void fibonacciTest() {

        int[] sequence = helper.fibonacciSequence(startingPoint,maxLimit);
            for( int i = 0 ; i < sequence.length ; i++){
                assertEquals(expectedOutput[i] , sequence[i]);
            }
       // System.out.println(expectedOutput[0]);
        //System.out.print(helper.fibonacciSequence(startingPoint,maxLimit));
        //assertArrayEquals(expectedOutput,helper.fibonacciSequence(startingPoint,maxLimit));
       //System.out.print(helper.fibonacciSequence(startingPoint,maxLimit,expectedOutput));
        //assertFalse(Helpers.fibonacciSequence(startingPoint,maxLimit,expectedOutput));
        //System.out.print(helper.fibonacciSequence(startingPoint,maxLimit,expectedOutput));
        //assertTrue(helper.fibonacciSequence(startingPoint,maxLimit,expectedOutput));
    }
}



