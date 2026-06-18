package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public  static String bearerToken;

	Properties properties;

	public ConfigReader(String fileName) throws IOException {

		properties = new Properties();

		FileInputStream fis = new FileInputStream("src/test/resources/" + fileName);

		properties.load(fis);
		fis.close();
	}

	public String getData(String key) {
		String value = properties.getProperty(key);
		if (value == null) {
			return "";
		}
		return value.trim();
	}
	
	 public void setBearerToken(String token) {
	        bearerToken = token;
	    }

	 public String getBearerToken() {
	        return bearerToken;
	    }
}
