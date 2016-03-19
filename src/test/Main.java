/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Testing.class);
        result.getFailures().stream().forEach((failure) -> {
            System.out.println(failure.toString());
        });
        String message;
        if (result.wasSuccessful()) {
            message = "Test was successfull with " + result.getFailureCount() + " Errors";
            System.out.println(message);

        } else {
            message = "Test wasn't successfull  with " + result.getFailureCount() + " Errors";
            System.err.println(message);

        }

    }

}
