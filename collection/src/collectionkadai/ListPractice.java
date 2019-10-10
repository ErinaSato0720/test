package collectionkadai;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

	public static void main(String[] args){

		Person sato = new Person("sato",28);
		Person monzen = new Person("monzen", 22);
		Person suzuki = new Person("suzuki", 31);

		List<Person> personList = new ArrayList<Person>();

		personList.add(sato);
		personList.add(monzen);
		personList.add(suzuki);

		for(Person value : personList){

			System.out.println(value.getName() + "は" + value.getAge() + "才");

		}

			System.out.println("\n");

			System.out.println("1件目は" + personList.get(0).getName() + "さんです");

	}
}
