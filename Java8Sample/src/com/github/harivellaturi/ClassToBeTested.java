package com.github.harivellaturi;
import java.util.List;
import java.util.stream.Collectors;

public class ClassToBeTested{
	
	public List<String> convertToUpperCase(List<String> words) {
		return words.stream()
					.map(string -> string.toUpperCase())
					.collect(Collectors.toList());
	}
}



