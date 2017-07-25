package utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonProcess
{

	public static Object processData(String inputData, Object Input)
	{
		
		ObjectMapper mapper = new ObjectMapper(); 
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	 
		try 
		{
			// Convert JSON string to Object
		//	String x = "{'vehicle_id': 7454, 'route': 705}";
	    //	mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
			Input = mapper.readValue(inputData, Input.getClass());
		
		} 
		catch (Exception e) 
		{
            e.printStackTrace();
        }   
	
       return  Input; 
	}

}
