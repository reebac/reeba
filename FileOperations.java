package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations 
{
	public static void main(String[] args)
    {
    	FileReader();
    }
    	
    public static void FileReader()
    {
    		JSONParser parser = new JSONParser();

    		try 
    		{
        	Object obj = parser.parse(new FileReader("/home/reeba/Documents/workspace-sts-3.9.0.RELEASE/demo/src/test/resource/apc_sample.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            long VehicleID = (long) jsonObject.get("vehicle_id");
            System.out.println("Vehicle ID: " +VehicleID);

            long Route = (long) jsonObject.get("route");
            System.out.println("Route: " +Route);
            
            long direction = (long) jsonObject.get("direction");
            System.out.println("Direction: " +direction);

            double recordTimestamp = (double) jsonObject.get("recordTimestamp");
            System.out.println("Time: " +recordTimestamp);
            
            String OccupancyStatusEnum = (String) jsonObject.get("OccupancyStatusEnum");
            System.out.println("Vehicle Status: " +OccupancyStatusEnum);

            long estimatedCount = (long) jsonObject.get("estimatedCount");
            System.out.println("Count: " +estimatedCount);
            
            
    		} catch (FileNotFoundException e) {
            e.printStackTrace();
    		} catch (IOException e) {
            e.printStackTrace();
    		} catch (ParseException e) {
            e.printStackTrace();
    		}
    		
    }

}
