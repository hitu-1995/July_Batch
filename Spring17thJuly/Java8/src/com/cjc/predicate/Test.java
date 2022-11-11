package com.cjc.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(7);
		list.add(8);

		Predicate<Integer> even = x -> x % 2 == 0;

		List<Integer> evenList = new ArrayList<Integer>();

		for (Integer n : list) {

			if (even.test(n))
				evenList.add(n);
		}
		System.out.println("list " + list);
		System.out.println("even List " + evenList);

	}

	public static void checkEvenOdd() {
		Predicate<Integer> checkEvenOdd = (x) -> x % 2 == 0;

		boolean flag = checkEvenOdd.test(25);

		if (flag)
			System.out.println("Number is even");
		else
			System.out.println("Number is Odd");
	}
}
