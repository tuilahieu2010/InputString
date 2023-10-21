/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Common.Algorithm;
import View.Menu;
/**
 *
 * @author hieu
 */
public class ManagerMenu extends Menu<String>{
    static String[] options = {"Input", "Result", "Exit"};
    Algorithm ar;

    public ManagerMenu() {
        super("==== ANALYSIS STRING PROGRAM =====", options);
        ar = new Algorithm();
    }
    @Override
    public void execute(int n) {
        switch(n) {
            case 1: ar.getInput();
            case 2: ar.getResult();
            case 3: System.exit(0);
        }
    }
}