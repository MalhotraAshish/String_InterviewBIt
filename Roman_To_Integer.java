package string_interviewbit;

import java.util.ArrayList;

public class Roman_To_Integer {
	public static void main(String args[]) {
		String  str = "MCMXII";
		System.out.println(romanToInt(str));
	}

	private static int romanToInt(String str) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("I");
		list1.add("V");
		list1.add("X");
		list1.add("L");
		list1.add("C");
		list1.add("D");
		list1.add("M");
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(5);
		list2.add(10);
		list2.add(50);
		list2.add(100);
		list2.add(500);
		list2.add(1000);
		int sum = 0;
		sum = sum + list2.get(list1.indexOf(String.valueOf(str.charAt(0))));
		for(int i = 1; i<str.length(); i++) {
			if(list1.indexOf(String.valueOf(str.charAt(i))) > list1.indexOf(String.valueOf(str.charAt(i-1)))) {
				sum = sum - list2.get(list1.indexOf(String.valueOf(str.charAt(i-1))));
				sum = sum + (list2.get(list1.indexOf(String.valueOf(str.charAt(i)))) - list2.get(list1.indexOf(String.valueOf(str.charAt(i-1)))));
			}else {
				sum = sum + list2.get(list1.indexOf(String.valueOf(str.charAt(i))));
			}
		}
		return sum;
	}
}
