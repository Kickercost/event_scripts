package com.dsmhack.igniter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(Cucumber.class)
@SpringBootTest
@CucumberOptions(plugin = {"pretty"},features = {"./features/"})
public class IgniterApplicationTests {

	@Test
	public void contextLoads() {
	}

}
