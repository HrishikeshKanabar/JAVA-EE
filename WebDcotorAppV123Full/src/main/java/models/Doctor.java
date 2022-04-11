package models;

/*
     Step-1 Provide default or no argument constructor
     
     Step-2 implement Serializable
     
     Step-3 Properties of class or variable or fields of class
     
     Step-4 getters and setters
     
     
*/

//  Step-2 implement Serializable

public class Doctor implements java.io.Serializable {
	
	//Step-3 Properties of class or variable or fields of class
	
	private String doc_id;
	private String doc_fn;
	private String doc_ln;
	private String doc_email;
	private String doc_pass;
	
	
	// Step-1 Provide default or no argument constructor
	
	public Doctor() {
		
	}
	
	// Step-4 getters and setters
	
	// Alt+shift+s


	public String getDoc_id() {
		return doc_id;
	}


	public void setDoc_id(String doc_id) {
		this.doc_id = doc_id;
	}


	public String getDoc_fn() {
		return doc_fn;
	}


	public void setDoc_fn(String doc_fn) {
		this.doc_fn = doc_fn;
	}


	public String getDoc_ln() {
		return doc_ln;
	}


	public void setDoc_ln(String doc_ln) {
		this.doc_ln = doc_ln;
	}


	public String getDoc_email() {
		return doc_email;
	}


	public void setDoc_email(String doc_email) {
		this.doc_email = doc_email;
	}


	public String getDoc_pass() {
		return doc_pass;
	}


	public void setDoc_pass(String doc_pass) {
		this.doc_pass = doc_pass;
	}
	
	


	


	
	
	
    
}
