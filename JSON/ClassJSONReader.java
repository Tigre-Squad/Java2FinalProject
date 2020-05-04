import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class ClassJSONReader{
    /**
    * @author Julian Mato-Hernandez
    */
    private static String path = "FuckingClass.json";
    public ClassJSONReader(String _class, int lvl){
        JSONObject obj = ClassJSONUtils.getJSONObjectFromFile(path);
        String[] names = JSONObject.getNames(obj);
		for (String string : names) {
			System.out.println(string + ": " + obj.get(string));
        }


        System.out.println("/n/n/n");


        JSONArray Bonus = obj.getJSONObject("Cleric").getJSONObject("Class Features").getJSONObject("The Cleric").getJSONArray("content").getJSONObject(0).getJSONArray("Level");;//.getJSONObject("table").getJSONArray("Level");
        //JSONArray bb = Bonus.getJSONObject(1).getJSONArray("Level");
        ArrayList<String> list = new ArrayList<String>();     
        JSONArray jsonArray = (JSONArray)Bonus; 
        if (jsonArray != null) { 
          int len = jsonArray.length();
          for (int i=0;i<len;i++){ 
          list.add(jsonArray.get(i).toString());
          System.out.println(i);
          System.out.println(list);
          } 
        }
    }
        public static void main(String[] args) {
            ClassJSONReader l = new ClassJSONReader("Cleric",1);
        
        }
}