import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


public class GsonClassReader {
	
	public static void main(String s[]){
		System.out.println("In GsonClassReader Class");
		JsonObject obj = new JsonObject();
		JsonArray arr = new JsonArray();
		obj.addProperty("text", "TEXT");
		arr.add(obj);
		obj = new JsonObject();
		obj.addProperty("text1", "TEXT2");		
		arr.add(obj);
		System.out.println("Array Size -- " + arr.size());
		JsonObject obj1 = (JsonObject) arr.get(0);
		System.out.println(obj1.get("text"));
	}

}
