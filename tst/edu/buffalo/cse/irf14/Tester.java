package edu.buffalo.cse.irf14;

import org.junit.runner.Computer;
import org.junit.runner.JUnitCore;


public class Tester {

    public static void main(String[] args) {
        JUnitCore core = new JUnitCore();
        core.run(new Computer(), AllTests.class);

    }

}
