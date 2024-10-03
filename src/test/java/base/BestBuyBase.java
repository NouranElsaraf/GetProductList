package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BestBuyBase {


    public class APIBase {


        @BeforeSuite(alwaysRun = true)
        @Parameters("APIBaseURL")
        public void initSuite(@Optional String apiBaseURL) {
            RestAssured.baseURI = apiBaseURL;
        }
    }
}
