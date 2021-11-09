package afterClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maplteration {
	public static void mapInteration() {

		Map<String, String> map = new HashMap<String, String>();
		map.put("key01", "value01");
		map.put("key02", "value02");
		map.put("key03", "value03");
		map.put("key04", "value04");
		map.put("key05", "value05");

		// 방법 01 : entrySet()
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
		}

		// 방법 02 : keySet()
		for (String key : map.keySet()) {
			String value = map.get(key);
			System.out.println("[key]:" + key + ", [value]:" + value);
		}

		// 방법 03 : entrySet().iterator()
		Iterator<Map.Entry<String, String>> iteratorE = map.entrySet().iterator();
		while (iteratorE.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratorE.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("[key]:" + key + ", [value]:" + value);
		}

		// 방법 04 : keySet().iterator()
		Iterator<String> iteratorK = map.keySet().iterator();
		while (iteratorK.hasNext()) {
			String key = iteratorK.next();
			String value = map.get(key);
			System.out.println("[key]:" + key + ", [value]:" + value);
		}
	}
}
