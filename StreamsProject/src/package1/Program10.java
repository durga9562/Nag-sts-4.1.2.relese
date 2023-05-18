package package1;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
//Given a String, find the first repeated character in it using Stream functions?
public class Program10 {
	public static void main(String args[]) {
        String input = "Ameer";

        Character result = input.chars()    
                                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))        
                                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) 
                                .entrySet()
                                .stream()
                                .filter(entry -> entry.getValue() > 1L)
                                .map(entry -> entry.getKey())
                                .findFirst()
                                .get();
		System.out.println(result);
	}

}
