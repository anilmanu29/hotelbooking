package hotelbooking.partiallyUpdate;

import com.google.gson.annotations.SerializedName;

//Author-Anilkumar

public class PartiallyUpdate {

	@SerializedName("firstname")
	private String firstname;

	@SerializedName("additionalneeds")
	private String additionalneeds;

	@SerializedName("bookingdates")
	private Bookingdates bookingdates;

	@SerializedName("totalprice")
	private int totalprice;

	@SerializedName("depositpaid")
	private boolean depositpaid;

	@SerializedName("lastname")
	private String lastname;

	public void setFirstname(String firstname){
		this.firstname = firstname;
	}

	public String getFirstname(){
		return firstname;
	}

	public void setAdditionalneeds(String additionalneeds){
		this.additionalneeds = additionalneeds;
	}

	public String getAdditionalneeds(){
		return additionalneeds;
	}

	public void setBookingdates(Bookingdates bookingdates){
		this.bookingdates = bookingdates;
	}

	public Bookingdates getBookingdates(){
		return bookingdates;
	}

	public void setTotalprice(int totalprice){
		this.totalprice = totalprice;
	}

	public int getTotalprice(){
		return totalprice;
	}

	public void setDepositpaid(boolean depositpaid){
		this.depositpaid = depositpaid;
	}

	public boolean isDepositpaid(){
		return depositpaid;
	}

	public void setLastname(String lastname){
		this.lastname = lastname;
	}

	public String getLastname(){
		return lastname;
	}

	@Override
 	public String toString(){
		return 
			"PartiallyUpdate{" + 
			"firstname = '" + firstname + '\'' + 
			",additionalneeds = '" + additionalneeds + '\'' + 
			",bookingdates = '" + bookingdates + '\'' + 
			",totalprice = '" + totalprice + '\'' + 
			",depositpaid = '" + depositpaid + '\'' + 
			",lastname = '" + lastname + '\'' + 
			"}";
		}
}