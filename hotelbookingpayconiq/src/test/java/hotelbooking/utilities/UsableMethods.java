package hotelbooking.utilities;

import com.fasterxml.jackson.databind.ObjectMapper;

import hotelbooking.getBookingID.BookingID;
import hotelbooking.testBase.Base;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

//Author-Anilkumar

public class UsableMethods extends Base {

    public static List<String> getIdList() throws IOException {
        Response response;
        BookingID[] getBooking;
        List<String>idlist=new ArrayList<>();
        ObjectMapper obj = new ObjectMapper();
        response=given().accept(ContentType.JSON).when().get(baseUrl + "booking");
        getBooking =obj.readValue(response.asString(), BookingID[].class);

        for (BookingID eachID :getBooking
             ) {idlist.add(eachID.getBookingid());

        }
        System.out.println(idlist);



        return idlist;
    }
    public static String getId() throws IOException {
        Response response;
        BookingID[] booking;
        List<String>idlist=new ArrayList<>();
        ObjectMapper obj = new ObjectMapper();
        response=given().accept(ContentType.JSON).when().get(baseUrl + "booking");
        booking =obj.readValue(response.asString(), BookingID[].class);

        for(int i = 0; i<booking.length; i++){
            idlist.add(booking[i].getBookingid());
        }
        String singleId= idlist.get(0).toString();

        System.out.println(singleId);
        return singleId;
    }

    public static String createToken(){

        Map<String,String> tokenBody = new HashMap<String,String>();
        tokenBody.put("username", ConfigurationReader.get("tokenUserName"));
        tokenBody.put("password", ConfigurationReader.get("tokenPassword"));
        Response response=given().
                contentType(ContentType.JSON).
                body(tokenBody).
                when().
                post(baseUrl + "auth");
        //response.prettyPrint();
        JsonPath token = response.jsonPath();
        String readyToken="token="+token.getString("token");
        //System.out.println(readyToken);
        return readyToken;

    }

@Test
    public void methodsCheck() throws IOException {

        getId();
        createToken();
        getIdList();

    }

}
