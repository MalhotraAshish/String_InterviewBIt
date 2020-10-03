package string_interviewbit;

import java.util.ArrayList;
import java.util.List;

public class Longest_Common_Prefix {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abcdefgh");
		list.add("abcefgh");
		//list.add("abcefgh");
		System.out.println(longestCommonPrefix(list));
	}

	private static String longestCommonPrefix(List<String> list) {
		String sample = "";
		String result = "";
		if(list.size() == 1) {
			return list.get(0);
		}
		if(list != null && list.size()>0) {
			sample = list.get(0);
		}
		int j = 0;
		while(j<sample.length()) {
			for(int i = 0; i<list.size(); i++) {
				if(j>=list.get(i).length()||list.get(i).charAt(j) != sample.charAt(j)) {
					return result;
				}
			}
			result = result+sample.charAt(j);
			j++;
		}
		return result;
	}

}
