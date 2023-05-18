package com.ojas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Frequency {
	  public static void main(String args[]){
	        HashMap<Integer, Integer> hashMap=new HashMap<Integer, Integer>();
	        
	        int arr[]=new int[] {5,7,7,8,2,1,1,1,1,5,4,2,0,9,8};
	        
	        for(int i=0;i<arr.length;i++) {
	        	
	        	
	        	
	        	if(hashMap.containsKey(arr[i])) {
	        		hashMap.put(arr[i], hashMap.get(arr[i])+1);
	        		
	        	}else {
	        		hashMap.put(arr[i], 1);
	        	}
	        }
	       
	        System.out.println(hashMap);
	       Map<Integer, Long> collect = Arrays.stream(arr).boxed()
	       .collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
	       System.out.println(collect);
	       long count = Arrays.stream(arr).boxed().count();
	       System.out.println(count);
	    
	  }
}
