package pt.nosautomation.api;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pt.nosautomation.api.domain.PeopleDTO;
import pt.nosautomation.api.domain.UserDTO;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class UserStepDefs extends BaseApiTest {

    private static final String BASE_URL = "https://gorest.co.in";
    private static int userId = 0;
    protected Response response;

    //Commons
    @Given("^Want call user function with the path: (.+)$")
    public void callUserFunction(String path) {
        spec = new NosApiRequestSpecification().getRequestSpecification(BASE_URL, path);
    }

    @Then("^The HttpStatus is (.+)$")
    public void validateStatusResponse(int statusCode) {
        assertEquals(response.statusCode(), statusCode);
    }

    @Then("^Validate the response - name: (.+), email: (.+), gender: (.+), status: (.+)$")
    public void validateResponse(String name, String email, String gender, String status) {
        JsonPath responseBody = response
                .then()
                .extract()
                .body()
                .jsonPath();

        assertEquals(name, responseBody.getString("name"));
        assertEquals(email, responseBody.getString("email"));
        assertEquals(gender, responseBody.getString("gender"));
        assertEquals(status, responseBody.getString("status"));
        userId = responseBody.getInt("id");
    }

    //Create
    @When("^Make the request to create with Body - name: (.+), email: (.+), gender: (.+), status: (.+)$")
    public void sendRequestCreate(String name, String email, String gender, String status) {
        response = given()
                .spec(spec)
                .when()
                .body(new UserDTO(name, email, gender, status))
                .post();
    }

    //Get by id
    @When("^Make the request to get user with userId$")
    public void requestById() {
        response = given()
                .spec(spec)
                .pathParam("id", userId)
                .when()
                .get();
    }

    //Patch by id
    @When("^Make the request to patch user with userId to update name: (.+) and gender: (.+)$")
    public void patchById(String name, String gender) {
        response = given()
                .spec(spec)
                .pathParam("id", userId)
                .when()
                .body(new PeopleDTO(name, gender))
                .patch();
    }

    // Delete by id
    @When("^Make the request to delete user with userId$")
    public void patchById() {
        response = given()
                .spec(spec)
                .pathParam("id", userId)
                .when()
                .delete();
    }

}
