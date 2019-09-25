package utility;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonExtractor {
	
	private JSONObject obj;
	private String jsonBody;
	
	public String dataExtract(String data, String key) {
		jsonBody = data;
		obj = new JSONObject(jsonBody);
		String[] keys = key.split("[\\[''\\]]+");
		int length = keys.length;
		for(int i=1;i<length-2;i++) {
			if(Pattern.matches("\\d+", keys[i+1])) {
				obj = getJsonObjectArray(keys[i], Integer.parseInt(keys[i+1]));
			}
			else if(!Pattern.matches("\\d+", keys[i])){
				obj = getJsonObject(keys[i]);
			}
		}
		if(Pattern.matches("\\d+", keys[length-1])) {
			JSONArray temp = obj.getJSONArray(keys[length-2]);
			return temp.get(Integer.parseInt(keys[length-1])).toString();
		}
		else {
			return obj.get(keys[length-1]).toString();
		}
	}	
	private JSONObject getJsonObject(String key) {
		return obj.getJSONObject(key);
	}
	
	private JSONObject getJsonObjectArray(String key, int index) {
		JSONArray ob = obj.getJSONArray(key);
		return ob.getJSONObject(index);
	}
	
}
