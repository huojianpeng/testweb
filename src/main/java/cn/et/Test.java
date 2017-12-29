package cn.et;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

public class Test {

	public static void main(String[] args) throws Exception {
		Map map=new HashMap();
		map.put("key", 1);
		Map map1=new HashMap();
		BeanUtils.copyProperties(map, map1);
		System.out.println(map1.get("key"));
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		
	}
}
