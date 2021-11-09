package p14lamda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class quizEx06 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("lang", "java");
		map.put("fw", "spring");
		map.put("fe", "html");
		
		map.forEach(new BiConsumer<String , String>() {
				@Override
				public void accept(String key, String value) {
					System.out.println("key:" + key + " value:" + value );
				}
		});
		
		map.forEach( (key,val) -> System.out.println(key + " : " + val));
		
	}
}
