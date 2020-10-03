package string_interviewbit;

import java.util.ArrayList;

public class Pretty_Json {
	public static void main(String args[]) {
		String str = "{A:\"B\",C:{D:\"E\",F:{G:\"H\",I:\"J\"}}}";
		System.out.println(prettyJSON(str));
	}

	private static ArrayList<String> prettyJSON(String a) {
	    
	    int tabCount = 0;
	    
	    ArrayList<String> ans = new ArrayList<String>();
	    
	    for (int i = 0; i < a.length(); i++) {
	        
	        if (a.charAt(i) == '{' || a.charAt(i) == '[') {
	            ans.add(get(tabCount).append(a.charAt(i)).toString());
	            tabCount++;
	        } else if (a.charAt(i) == '}' || a.charAt(i) == ']') {
	            tabCount--;
	            ans.add(get(tabCount).append(a.charAt(i)).toString());
	        } else if (a.charAt(i) == ' ') {
	            
	        } else if (a.charAt(i) == ',') {
	            ans.set(ans.size() - 1, ans.get(ans.size() - 1).concat(","));
	        } else {
	            int start = i;
	            while (i < a.length() && (a.charAt(i) != ',' && a.charAt(i) != '[' && a.charAt(i) != '{' && a.charAt(i) != ']' && a.charAt(i) != '}')) {
	                i++;
	            }
	            
	            if (i >= a.length()) {
	                break;
	            }
	            
	            if (a.charAt(i) == ',') {
	                ans.add(get(tabCount).toString() + a.substring(start, i + 1));
	            } else if (a.charAt(i) == '}' || a.charAt(i) == ']') {
	                ans.add(get(tabCount).toString() + a.substring(start, i));
	                i--;
	            } else if (a.charAt(i) == '{' || a.charAt(i) == '[') {
	                ans.add(get(tabCount).toString() + a.substring(start, i));
	                i--;
	            }
	        }
	    }
	    
	    return ans;
	}
	
	private static StringBuilder get(int tabCount) {
	    StringBuilder toAdd = new StringBuilder();
	    for (int j = 0; j < tabCount; j++) {
	        toAdd.append('\t');
	    }
	    return toAdd;
	}
}

class Indent {
    char c;
    int tab;
    
    Indent(char c, int tab) {
        this.c = c;
        this.tab = tab;
    }
}
