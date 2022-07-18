package hotelbooking.getBookingID;

import java.util.List;
import com.google.gson.annotations.SerializedName;

//Author-Anilkumar

public class GetBooking {

	@SerializedName("ResponseJava")
	private List<BookingID> responseJava;

	public void setResponse(List<BookingID> responseList){
		this.responseJava = responseList;
	}

	public List<BookingID> getResponse(){
		return responseJava;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"response = '" + responseJava + '\'' +
			"}";
		}
}