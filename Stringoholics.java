package string_interviewbit;

import java.util.ArrayList;

public class Stringoholics {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("ababa");
		list.add("aba");
		// list.add("aaaaaaaaaaaaa");
		System.out.println(solve(list));
	}

	private static long solve(ArrayList<String> A) {
		int n = A.size();
		long v[] = new long[n];
		for (int i = 0; i < n; i++) {
			long x = A.get(i).length();
			if (x <= 1)
				v[i] = 1;
			else {
				int k = 1, c = 0;
				while (true) {
					c = (k * (k + 1)) / 2;
					if (c % x == 0) {
						v[i] = k;
						break;
					}
					k++;
				}
			}
		}
		long ans = 1;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n && v[i] != 1; j++) {
				v[j] = v[j] / gcd(v[i], v[j]);
			}
			ans = (long) (ans % 1000000007 * (v[i]) % 1000000007) % 1000000007;
		}
		return ans % 1000000007;
	}

	public static long gcd(long v, long v2) {
		if (v == 0)
			return v2;

		return gcd(v2 % v, v);
	}

}
