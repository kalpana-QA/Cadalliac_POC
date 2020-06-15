package com.tripmasters.framework.fileReaders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * The JsonDataReader class reads the data from .json file.
 *
 * @author Shivam Kashyap
 * @version 1.8
 * @since 2020-01-26
 * 
 */
public class JsonDataReader {
	
	private static String jsonFilePath = System.getProperty("user.dir") + "/src/test/resources/testdata/Config.json";
																		
	private static File jsonFile = null;
	private static Object obj = null;
	private static JSONObject jObject = null;

	/**
	 * The getJSONData method fetch the data from .JSON file corresponding to
	 * key as single parameter.
	 *
	 * @author Shivam Kashyap
	 * @param String
	 * @version 1.8
	 * @since 2020-01-26
	 * @return String
	 * 
	 */

	public static String getJSONData(String key) throws FileNotFoundException, IOException, ParseException {

		try {
			//System.out.println("jsonFilePath is : "+jsonFilePath);
			jsonFile = new File(jsonFilePath);
			obj = new JSONParser().parse(new FileReader(jsonFile));
			jObject = (JSONObject) obj;
			// System.out.println("jObject : "+jObject);
			String jsonData = (String) jObject.get(key).toString();
			System.out.println("json data: " + jsonData);

			return jsonData;
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;

	}

}