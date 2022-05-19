package PracticeSet1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.path.json.JsonPath;

public class ParseJSON {
	
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("E:\\Eclipse\\Workspace\\SerializingJSON\\src\\test\\java\\PracticeSet1\\sample.json");
			JsonPath parser = new JsonPath(reader);
			Object obj = parser.get(".");
			Map result = (Map) obj;
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
