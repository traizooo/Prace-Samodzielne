package course;
 
public class Lesson {
 
  public static void main(String[] args) {
   
int soap = 200; // Grams

int soapExpected = 520; // Grams

boolean holidays = true;
	  
		  
		 
if (holidays && soap < soapExpected) {
	
	int shortage = (soapExpected / 2) - soap;
	System.out.println(" You have " + shortage + " grams of soap");
	  
	  
}

else if (soap < soapExpected) {
	
	int shortage = soapExpected - soap;
	System.out.println(" You have " + shortage + " grams of soap ");
	
}

	  }
	  
	  
	  
	  
	  
	  
	  
	  
    }
  
