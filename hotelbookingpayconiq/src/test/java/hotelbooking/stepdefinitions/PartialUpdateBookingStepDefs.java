package hotelbooking.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import hotelbooking.testBase.Base;
import hotelbooking.utilities.ConfigurationReader;
import hotelbooking.utilities.UsableMethods;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

//Author-Anilkumar

public class PartialUpdateBookingStepDefs extends Base {
    Response response;
    String firstname= ConfigurationReader.get("firstName");
    String lastname = ConfigurationReader.get("lastName");
    public PartialUpdateBookingStepDefs() throws IOException {
    }

    @Given("user sends a patch request to booking {string}")
    public void userSendsAPatchRequestToBooking(String idToBePartiallyUpdated) throws IOException {
        String ReadyToken = UsableMethods.createToken();
        String singleId= UsableMethods.getId();
        System.out.println(singleId);
        Map<String,String> partialBody = new HashMap<String,String>();
        partialBody.put("firstname", firstname);
        partialBody.put("lastname", lastname);

        response=given().
                headers("Cookie", ReadyToken,"Content-Type",ContentType.JSON, "Accept",ContentType.JSON).
                body(partialBody).
                when().
                patch(baseUrl+ "booking/"+ singleId);
        response.prettyPrint();
    }

    @When("user gets the patch status code {int}")
    public void userGetsThePatchStatusCode(int expectedStatusCode) {
        Assert.assertEquals(expectedStatusCode, response.getStatusCode());

    }

    @Then("user verify the booking was partially updated with {string}and {string}")
    public void userVerifyTheBookingWasPartiallyUpdatedWithAnd(String Firstname, String Lastname) throws IOException {
        Assert.assertTrue("Firstname does not match",response.asString().contains(firstname));
        Assert.assertTrue("Lastname does not match",response.asString().contains(lastname));
    }
}
