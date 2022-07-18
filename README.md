# hotelbooking
Backend API Automation for Hotel Booking

**Assignment Workflow **

**API Documentation: **

http://restful-booker.herokuapp.com/apidoc/index.html#api-Booking-GetBookings 

**Project Requirements: **

• You have a working “createBooking” and “getBookingById” endpoints, make sure that 
“partialUpdateBooking , “deleteBooking” and “getBookingIds”(test get all bookingIds 
without filter, and add test for 1-2 parameters) are working. (Write automated tests 
that can be used for regression) 

**Pre-requisites:**
Java 8 installed
Maven Installed : Windows Installation
Eclipse / IntelliJ IDE installed
Create Maven project in Eclipse
io.rest-assured
com.google.code.gson
io.cucumber
net.masterthought

**API**
The APIs used for these classes to practice is based on very easy to use Hotel Booking API. It gives a real world live project experience while using the sandbox environment of swagger tool to test the APIs.

**Endpoints**

POST /partialUpdateBooking
PUT /partialUpdateBooking
GET /getBookingIds
POST /getBooking/:Id
DELETE /deleteBooking

**Test Runner for Positive Scenarios:**
https://github.com/anilmanu29/hotelbooking/blob/main/hotelbookingpayconiq/src/test/java/hotelbooking/runners/TestRunner.java

**Test Runner for Failed Scenarios:**
https://github.com/anilmanu29/hotelbooking/blob/main/hotelbookingpayconiq/src/test/java/hotelbooking/runners/FailedTestRunner.java


**Test Reports:**
1.PDF Report:
https://github.com/anilmanu29/hotelbooking/blob/main/hotelbookingpayconiq/test-output/PdfReport/ExtentPdf.pdf

2.HTML Report:
https://github.com/anilmanu29/hotelbooking/blob/main/hotelbookingpayconiq/test-output/SparkReport/Spark.html


**Framework**
Structure
This project is a standard Maven Java cuccumber BDD project with src folders and pom.xml

**Installation**
mvn clean install To install the project and it's dependencies

**Help**
If you got any questions don't hesitate to contact me: anilmanu29@gmail.com
