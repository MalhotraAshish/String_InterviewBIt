package string_interviewbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Valid_Ip_Addresses {
	public static void main(String args[]) {
		System.out.println(restoreIpAddresses("25525511135"));
	}

	private static ArrayList<String> restoreIpAddresses(String string) {
		if (string.length() < 3 || string.length() > 12) {
			return new ArrayList<>();
		} else {
			ArrayList<String> ip = new ArrayList<>();
			int size = string.length();
			String newString = string;

			for (int i = 1; i < size - 2; i++) {
				for (int j = i + 1; j < size - 1; j++) {
					for (int k = j + 1; k < size; k++) {
						//System.out.println(newString.substring(0, k) + "." + newString.substring(k));
						newString = newString.substring(0, k) + "." + newString.substring(k);
						//System.out.println(newString.substring(0, j) + "." + newString.substring(j));
						newString = newString.substring(0, j) + "." + newString.substring(j);
						//System.out.println(newString.substring(0, i) + "." + newString.substring(i));
						newString = newString.substring(0, i) + "." + newString.substring(i);
						if (isValid(newString)) {
							System.out.println(newString + " i = " + i + " j = " + j + " k = " + k);
							ip.add(newString);
						}
						newString = string;
					}
				}
			}
			
			Collections.sort(ip, new Comparator<String>() {
				public int compare(String o1, String o2) {
					String a1[] = o1.split("[.]");
					String a2[] = o2.split("[.]");
					int result = -1;
					for(int i = 0; i<4 && result!=0; i++) {
						result = a1[i].compareTo(a2[i]);
					}
					return result;
 				}
			});
			return ip;
		}
	}

	private static boolean isValid(String newString) {
		String iparr[] = newString.split("[.]");
		for (int i = 0; i < iparr.length; i++) {
			int value = Integer.parseInt(iparr[i]);
			if (iparr[i].length() > 3 || value < 0 || value > 255) {
				return false;
			}
			if (iparr[i].length() > 1 && value == 0) {
				return false;
			}
			if (iparr[i].length() > 1 && value != 0 && iparr[i].charAt(0) == '0') {
				return false;
			}
		}
		return true;
	}
}
