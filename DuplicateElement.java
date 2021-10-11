package Duplicate1;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class DuplicateElement {
	    public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(5, 2, 3, 1, 3, 7, 2, 9, 9, 3);

	        Set<Integer> result = findDuplicateBySetAdd(list);

	        result.forEach(System.out::println);
	    }
	    public static <T> Set<T> findDuplicateBySetAdd(List<T> list) {
        Set<T> items = new HashSet<>();
	        return list.stream()
	                .filter(n -> !items.add(n)) 
	                .collect(Collectors.toSet());

	    }

	}

