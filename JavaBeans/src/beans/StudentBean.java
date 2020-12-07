package beans;

/*

It provides a default, no-argument constructor.

It should be serializable and that which can implement the Serializable interface.

It may have a number of properties which can be read or written.

It may have a number of "getter" and "setter" methods for the properties

*/

// It should be serializable and that which can implement the Serializable interface.

public class StudentBean implements java.io.Serializable {
	
   // It may have a number of properties which can be read or written.
   private String firstName = null;
   private String lastName = null;
   private int age = 0;

   
   // It provides a default, no-argument constructor
   public StudentBean() {
   }
   
   
   // It may have a number of "getter" and "setter" methods for the properties
   
   // getters
   
   public String getFirstName(){
      return firstName;
   }
   public String getLastName(){
      return lastName;
   }
   
   public int getAge(){
      return age;
   }
   
   // setters
   
   public void setFirstName(String firstName){
      this.firstName = firstName;
   }
   
   public void setLastName(String lastName){
      this.lastName = lastName;
   }
   public void setAge(int  age){
      this.age = age;
   }
}
