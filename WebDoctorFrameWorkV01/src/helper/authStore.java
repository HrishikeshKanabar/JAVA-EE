package helper;
import java.util.*;  

public class authStore {
	
	
	 Map<String, List<String>> myMaps = new HashMap<String, List<String>>();
	
	 
	public List<String> diseaseGenerator(List<String> symptoms) {
		
		
		 Map<String, List<String>> diseasesVsSymptoms = new HashMap<String, List<String>>();
		 
		 List<String> SymptomsList1 = new ArrayList<String>();
		 SymptomsList1.add("high temperature (fever)");
		 SymptomsList1.add("Fatigue");
		 SymptomsList1.add("Muscle or body aches");
		 diseasesVsSymptoms.put("Typhoid",SymptomsList1);
		
		 
		 List<String> SymptomsList2 = new ArrayList<String>();
		 SymptomsList2.add("high temperature (fever)");
		 SymptomsList2.add("Fatigue");
		 SymptomsList2.add("Muscle or body aches");
		 SymptomsList2.add("a lack of energy");
		 diseasesVsSymptoms.put("Dengue",SymptomsList2);
		
		 
		 
		 List<String> SymptomsList3 = new ArrayList<String>();
		 SymptomsList3.add("Fever");
		 SymptomsList3.add("Fatigue");
		 SymptomsList3.add("Muscle aches");
		 SymptomsList3.add("a lack of energy");
		 diseasesVsSymptoms.put("Jaundice",SymptomsList3);
		 
		 
		 
		 List<String> SymptomsList4 = new ArrayList<String>();
		 SymptomsList4.add("Fever");
		 SymptomsList4.add("Sore throat");
		 SymptomsList4.add("Congestion or runny nose");
		 SymptomsList4.add("a lack of energy");
		 diseasesVsSymptoms.put("Normal cold and cough",SymptomsList4);
		
		 
		 List<String> SymptomsList5 = new ArrayList<String>();
		 SymptomsList5.add("Fever");
		 SymptomsList5.add("Nausea or vomiting");
		 SymptomsList5.add("Congestion or runny nose");
		 SymptomsList5.add("a lack of energy");
		 SymptomsList5.add("rectal bleeding");
		 diseasesVsSymptoms.put("Stomach ulcer",SymptomsList5);
		
		 
		 List<String> SymptomsList6 = new ArrayList<String>();
		 SymptomsList6.add("Earache");
		 SymptomsList6.add("Nausea or vomiting");
		 SymptomsList6.add("Fever");
		 
		 diseasesVsSymptoms.put("Ear drum burst",SymptomsList6);
		 
		  
		 List<String> SymptomsList7 = new ArrayList<String>();
		 SymptomsList7.add("Earache");
		 SymptomsList7.add("Nausea or vomiting");
		 SymptomsList7.add("Fever");
		 diseasesVsSymptoms.put("Ear drum burst",SymptomsList7);
		 
		 
		 List<String> SymptomsList8 = new ArrayList<String>();
		 SymptomsList8.add("Pain and Joint Popping ");
		 SymptomsList8.add("Muscle aches");
		 diseasesVsSymptoms.put("Joint pain",SymptomsList8);
		
		 
		 //System.out.println("diseases  symptoms :"+diseasesVsSymptoms);
		 
		 
		 List<String> diseaseList = new ArrayList<String>();
	       
	       return diseaseList;
		
	    
	    
	}
	
	// Generates username and password
	
	public Map<String ,String> authgenerator(String usrName){
		
		Map<String ,String> authStore = new HashMap<String,String>();
		
		Map<String ,String> usrPass = new HashMap<String,String>();
		
		authStore.put("doctor34", "opera");
		authStore.put("doctor67", "kite");
		authStore.put("doctor789","lone");
		
		
		String pass=authStore.get(usrName);
		
		//System.out.println("Password:"+pass);
	
		
		usrPass.put(usrName, pass);
		
		
		return usrPass;
	}
	
	
	// test
	
	 public static void main(String[] args) {
		 
		 authStore obj = new authStore();
		 Map<String ,String> testMap = new HashMap<String,String>();
		 
		 testMap = obj.authgenerator("doctor34");
		 
		 //System.out.println("AUTH MAP:"+testMap );
			
			
		 List<String> diseases = new ArrayList<String>();
	 
		
		
		List<String> SymptomsList = new ArrayList<String>();
		 
		 SymptomsList.add("a lack of energy");
		 SymptomsList.add("Fever");
		
		 diseases = obj.diseaseGenerator(SymptomsList);
	 }
	

}

 
