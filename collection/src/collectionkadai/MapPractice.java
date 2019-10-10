package collectionkadai;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args){

		Person sato = new Person("sato", 28);
		Person monzen = new Person("monzen", 22);
		Person suzuki = new Person("suzuki", 31);

		Map<String, Person> personMap = new HashMap<String, Person>();

		personMap.put("佐藤", sato);
		personMap.put("門前", monzen);
		personMap.put("鈴木", suzuki);

		if(personMap.containsKey("門前")){
			System.out.println("門前さんはいます");
		}else{
			System.out.println("門前さんはいません");
		}

		for(Map.Entry<String, Person> value : personMap.entrySet()){
			System.out.println(value.getKey() + "は" + value.getValue().getAge() + "才" );
		}

		int maxAge = 0;
		for(Map.Entry<String, Person> value : personMap.entrySet()){
			maxAge = Math.max(maxAge, value.getValue().getAge());
		}
		System.out.println(maxAge + "才が最年長です");
}
}