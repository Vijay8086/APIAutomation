package org.example.ex01_sampleCheck;

import io.restassured.RestAssured;

public class APITesting003_NoDesignPattern {


    public void step1() {
        System.out.println("step1");
    }

    public void step2() {
        System.out.println("step2");
    }

    public void step3(String param1) {
        System.out.println("step3");
    }

    public static void main(String[] args) {
        APITesting003_NoDesignPattern np = new APITesting003_NoDesignPattern();
        np.step1();
        np.step2();
        np.step3("Vijay");
    }
}



