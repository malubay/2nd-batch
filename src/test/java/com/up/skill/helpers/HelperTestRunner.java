package com.up.skill.helpers;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by JPMPC-B213 on 1/21/2017.
 */
public class HelperTestRunner {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(HelpersTest.class);
            for (Failure failure :result.getFailures()){
                System.out.println(failure.toString());
            }
            System.out.println(result.wasSuccessful());
    }
}
