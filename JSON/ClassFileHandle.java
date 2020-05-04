import java.io.InputStream;

public class ClassFileHandle {
	/**
    * @author Julian Mato-Hernandez
    */

	public static InputStream inputStreamFromFile(String path) {
		try {
			InputStream inputStream = ClassFileHandle.class.getResourceAsStream(path);
			return inputStream;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}