package hotelbooking.getBookingID;

import com.google.gson.annotations.SerializedName;

//Author-Anilkumar

public class BookingID {

	@SerializedName("bookingid")
	private String bookingid;

	public void setBookingid(String bookingid){
		this.bookingid = bookingid;
	}

	public String getBookingid(){
		return bookingid;
	}

	@Override
 	public String toString(){
		return 
			"ResponseItem{" + 
			"bookingid = '" + bookingid + '\'' + 
			"}";
		}
}