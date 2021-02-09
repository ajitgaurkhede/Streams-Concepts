package LambdaConcept;

public class LambdaDeclaration {

	public static void main(String[] args) {
	
		/*WebPage w1 = new WebPage() {
			
			public void header(String value) {
				
				System.out.println("value = "+value);
				
			}
			
		};*/
		
		
		WebPage w1 = (String value)->{
			
			System.out.println("hi "+value);
		};
		
		WebPage w2 = (value) -> System.out.println("uppercase --"+value.toUpperCase());
		
		WebPage w3 = (n) -> System.out.println("Length --."+n.length());
		
		w1.header("hello");
		w2.header("google");
		w3.header("google");

	}

}
