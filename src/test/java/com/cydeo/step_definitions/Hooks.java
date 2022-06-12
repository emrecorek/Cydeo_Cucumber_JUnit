package com.cydeo.step_definitions;

//pre post conditions for each scenario and step

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before
    public void setupScenario(){

        System.out.println("Setting up browser");

    }

    @After
    public void tearDownScenario(){

        System.out.println("Closing scenario");
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("------------------applying setup step");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("------------------applying after step");
    }


}
