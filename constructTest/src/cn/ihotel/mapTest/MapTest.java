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
		 * 1.Map������½��ͳ�ʼ���ͱ���
		 * 2.֮ǰ������Map��set�����ļ��϶��Ǹߴ��ϵģ����ھ��ò�����ʲô�࣬������������һ��
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
			System.out.println("KEYΪ��" + s + "  valueΪ��" +hashMap.get(s));
		}
	}

}
