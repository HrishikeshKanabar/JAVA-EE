package models;


/*
     Step-1 Provide default or no argument constructor
     
     Step-2 implement Serializable
     
     Step-3 Properties of class or variable or fields of class
     
     Step-4 getters and setters
     
     
*/

public class Patient implements java.io.Serializable {
	
	public String pat_fn; 
	public String pat_ln ;
	public String pat_email;
	public String pat_phone; 
	public String pat_sympt; 
	public String pat_tests; 
	public String pat_results;  
	public String pat_dis;
	public String doc_id;
	
	public Patient(){
		
	}
	
	
	public Patient(String pat_fn, String pat_ln, String pat_email,String pat_phone, String pat_sympt,String pat_tests,String pat_results,String pat_dis, String doc_id){
		 this.pat_fn=pat_fn;
		 this.pat_ln=pat_ln;
		 this.pat_email=pat_email;
		 this.pat_phone =pat_phone;
		 this.pat_sympt =pat_sympt;
		 this.pat_tests=pat_tests;
		 this.pat_results  =pat_results;
		 this.pat_dis=pat_dis;
		 this.doc_id=doc_id;
		
	}
   
	
	// getters and setters

	public String getPat_fn() {
		return pat_fn;
	}


	public void setPat_fn(String pat_fn) {
		this.pat_fn = pat_fn;
	}


	public String getPat_ln() {
		return pat_ln;
	}


	public void setPat_ln(String pat_ln) {
		this.pat_ln = pat_ln;
	}


	public String getPat_email() {
		return pat_email;
	}


	public void setPat_email(String pat_email) {
		this.pat_email = pat_email;
	}


	public String getPat_phone() {
		return pat_phone;
	}


	public void setPat_phone(String pat_phone) {
		this.pat_phone = pat_phone;
	}


	public String getPat_sympt() {
		return pat_sympt;
	}


	public void setPat_sympt(String pat_sympt) {
		this.pat_sympt = pat_sympt;
	}


	public String getPat_tests() {
		return pat_tests;
	}


	public void setPat_tests(String pat_tests) {
		this.pat_tests = pat_tests;
	}


	public String getPat_results() {
		return pat_results;
	}


	public void setPat_results(String pat_results) {
		this.pat_results = pat_results;
	}


	public String getPat_dis() {
		return pat_dis;
	}


	public void setPat_dis(String pat_dis) {
		this.pat_dis = pat_dis;
	}


	public String getDoc_id() {
		return doc_id;
	}


	public void setDoc_id(String doc_id) {
		this.doc_id = doc_id;
	}
	
 
}
