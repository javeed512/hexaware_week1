package com.streams;

import java.util.Arrays;
import java.util.List;

public class MapStreamDemo {

	public static void main(String[] args) {

		String names[] = { "smith", "aditya", "vishal", "jyothika", "Datta", "Kethana" };

		List<String> list = Arrays.asList(names);

		list.stream().map((name) -> {
			System.out.println(name);
			return name.length();
		}).forEach((len) -> {
			
			System.out.println(len);
		});

	}

}
