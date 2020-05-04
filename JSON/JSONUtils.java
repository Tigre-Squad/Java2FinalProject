import java.io.InputStream;
import java.util.Scanner;

import org.json.JSONObject;

public class JSONUtils {

	public static String getJSONStringFromFile(String path) {
		Scanner scanner;
		InputStream in = FileHandle.inputStreamFromFile(path);
		System.out.println(in);
		scanner = new Scanner(in); // close the scanner
		String json = scanner.useDelimiter("\\Z").next();
		scanner.close();
		return json;
	}

	public static JSONObject getJSONObjectFromFile(String path) {
		return new JSONObject(getJSONStringFromFile(path));
	}

	public static boolean objectExists(JSONObject jsonObject, String key) {
		Object o;
		try {
			o = jsonObject.get(key);
		} catch (Exception e) {
			return false;
		}
		return o != null;
	}
}