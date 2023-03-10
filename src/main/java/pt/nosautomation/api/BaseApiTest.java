package pt.nosautomation.api;

import io.restassured.specification.RequestSpecification;
import org.junit.Before;

import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails;

public class BaseApiTest {

    protected RequestSpecification spec;

    @Before
    void initialize() {
        enableLoggingOfRequestAndResponseIfValidationFails();
    }


}
