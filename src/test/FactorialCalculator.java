/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samundra
 */
class FactorialCalculator  extends Thread{
public static FactorialCalculator fc = new FactorialCalculator();
    @Override
    public void run() {
        try {
            Thread.sleep(7000);
            System.out.println("hello k cha");
        } catch (InterruptedException ex) {
            Logger.getLogger(FactorialCalculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}