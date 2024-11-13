package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//we need runwith options to run cucumber with junit
@RunWith(Cucumber.class)
//cucumber options decide what to execute, where to execute
@CucumberOptions(
        //features we use to provide the path of the feature files
        features = "src/test/resources/features/",
        //glue is the keyword we use to find the gherkin step def
        //we provide  the path of steps packages where we have all step definitions
        glue = "steps",
        //dry run stops the actual execution when set to true
        //it will scan all the steps definitions and provide if there is any step def
        //false will execute all steps
        dryRun = false,
        //and = both conditions must be true to execute it
        //or = at least one condition must be true to execute the code
        //tags = "@sprint2 or @sprint4 or @sprint5 // will execute only sprint2, we don't have sprint4
        //tags = "@sprint1 and @sprint4"//will not execute
        tags = "@order",
        //from
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"
                //rerun plugin generates the txt file of all failed test cases
                ,"rerun:target/failed.txt"
        }
)

public class RunnerClass {

}