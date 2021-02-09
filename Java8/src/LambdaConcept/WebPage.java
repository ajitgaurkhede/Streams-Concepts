package LambdaConcept;

//SAM -- Single Abstract Method

@FunctionalInterface
public interface WebPage {
	
	void header(String value);
	
	//void t(); if u using lamda then u can only write one method

}
