<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<HTML>
<HEAD>
<TITLE>Symptoms Form</TITLE>
 <link rel="stylesheet" href="CSS/style.css">
</HEAD>
<BODY>


<FORM action="results">

<div class="imgcontainer">
    <img src="https://www.cdc.gov/dengue/images/symptoms/DengueSymptoms.jpg" alt="Avatar" class="avatar">
  </div>
<Center><h1> Please enter following details and check mark symptoms </h1></Center>

<div class="container">
    <label for="uname"><b>First Name</b></label>
    <input type="text" placeholder="Enter Username" name="fname" required>

    <label for="pass"><b>Last Name</b></label>
    <input type="password" placeholder="Enter Password" name="lname" required>
    
    </br>
    </br>
	<label for="for"><b> For </b></label>
	</br>
	</br>
	<SELECT NAME="for" SIZE="2" >
	<OPTION VALUE="me">ME</OPTION>
	<OPTION VALUE="someoneelse">SOME ONE ELSE</OPTION>
	</SELECT>
	
	</br>
    </br>
	<label for="gender"><b> Gender </b> </label>
	</br>
    </br>
	<INPUT TYPE="RADIO" NAME="integer" VALUE="1">Male
	<INPUT TYPE="RADIO" NAME="integer" VALUE="2">Female
		
    </br>
    </br>
    <label>
		<label for="sympto"><b>Symptoms </b> </label>
		 </br>
         </br>
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Cold">Cold
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Headache">Headache
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Fever">Fever
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Diarrhea">Diarrhea
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Fatigue">Fatigue
		  </br>
		  </br>
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Muscle aches">Muscle aches
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Coughing">Coughing
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Earache">Earache
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="hightemperaturehigh temperature (fever)">high temperature (fever)
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="being sick">being sick
		  </br>
		  </br>
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="a lack of energy">a lack of energy
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Shortness of breath or difficulty breathing">Shortness of breath or difficulty breathing
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Muscle or body aches">Muscle or body aches
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="New loss of taste or smell">New loss of taste or smell
		  </br>
		  </br>
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Sore throat">Sore throat
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Congestion or runny nose">Congestion or runny nose
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Nausea or vomiting">Nausea or vomiting
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Diarrhea">Diarrhea
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Bloating">Bloating
		  </br>
		  </br>
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Stomach Cramps">Stomach Cramps
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="abdominal pain">abdominal pain
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="rectal bleeding">rectal bleeding
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Pain and Hot flashes">Pain and Hot flashes
		  </br>
		  </br>
		<INPUT TYPE="CHECKBOX" NAME="symptoms" VALUE="Pain and Joint Popping">Pain and Joint Popping
		    </label>
	
  </div>
  
  <div class="container" style="background-color:#f1f1f1">

	<button type="submit" VALUE="Submit">CLICK HERE TO FIND DISEASE</button>
	<center><button type="reset"  class="cancelbtn" VALUE="Reset">RESET</button></center>
  </div>
  
</FORM>
</BODY>
</HTML>