package cn.ihotel.mapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		/**
		 * 1.Map对象的新建和初始化和遍历
		 * 2.之前都觉得Map，set这样的集合都是高大上的，现在觉得不过是什么类，都可以拿来试一试
		 * 
		 */
		Map<String,List<String>> mapTest = new HashMap<String,List<String>>();
		List<String> animalList = new ArrayList<String>();
		List<String> plantList = new ArrayList<String>();
		animalList.add("DOG");
		animalList.add("CAT");
		
		plantList.add("TREE");
		plantList.add("GRASS");
		mapTest.put("animal", animalList);
		mapTest.put("plant", plantList);
		
		MapTest mapTestObject = new MapTest();
		mapTestObject.workByKeySet(mapTest);
	}

	public void workByKeySet(Map<String,List<String>> hashMap){
		Set<String> key = hashMap.keySet();
		for(Iterator<String> it = key.iterator(); it.hasNext(); ){
			String s = (String)it.next();
			System.out.println("KEY为：" + s + "  value为：" +hashMap.get(s));
		}
	}

}
