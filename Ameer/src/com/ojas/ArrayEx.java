package com.ojas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayEx {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("ssss");
		list.add('a');
		list.add(111);
		list.add(null);
		Iterator<Double> itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
