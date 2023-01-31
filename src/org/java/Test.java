package org.java;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test extends Sample {
	
	
	public Test() {
		
		System.out.println("DEFAULT");
	}
	public Test(int id){
		super("hello");
		System.out.println("id= "+id);
	}
	public static void main(String[] args) {
		
		Test test = new Test();
	}

}
