package com.chroma.stepDefinitions;

import com.chroma.web.WebDriverUtils;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends WebDriverUtils {

    @Before
    public void start(){
        setUp();
    }
    
    @After
    public void end(){
        tearDown();
    }
}
