package br.com.iweducation.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:caracteristicas", tags = "@ContaTestRunner", glue = "br.com.iweducation.passos", monochrome = true, dryRun = false)
public class ContaTestRunner {

}
