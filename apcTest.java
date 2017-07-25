package container;

import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import utils.jsonProcess;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
import javax.swing.JOptionPane;

//@RunWith(SpringRunner.class)

public class apcTest {

	apc inputData = new apc();
	
	
	@Test
	public void test() 
  {
		String ApcDataRAw = null;
		//TODO open file and input String new File("/home/reeba/Documents/workspace-sts-3.9.0.RELEASE/demo/src/test/resource/apc_sample.json")
		
    JSONParser parser = new JSONParser();

		try 
		{
    	Object obj = parser.parse(new FileReader("/home/reeba/Documents/workspace-sts-3.9.0.RELEASE/demo/src/test/resource/apc_sample.json"));
        JSONObject jsonObject = (JSONObject) obj;
        System.out.println(jsonObject);
        ApcDataRAw = jsonObject.toJSONString();
        inputData = (apc) jsonProcess.processData(ApcDataRAw, inputData);
        System.out.println(inputData);
		assertTrue("APC object not null", inputData.getvehicle_id() > 0);		
     
		}
		catch (FileNotFoundException e) {
        e.printStackTrace();
		} catch (IOException e) {
        e.printStackTrace();
		} catch (ParseException e) {
        e.printStackTrace();
		}
			
	}

}
