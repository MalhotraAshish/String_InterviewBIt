package string_interviewbit;

public class Compare_Version_Numbers {

	public static void main(String[] args) {
		//String str1 = "444444444444444444444444";
		String str1 = "4444371174137455";
		String str2 = "5.168";
		//String str2 = "444444444444444444444444";
		System.out.println(compareVersion(str1, str2));
	}

	private static int compareVersion(String str1, String str2) {
        String[] v1 = str1.split("\\.");
        String[] v2 = str2.split("\\.");
        
        int size = Math.max(v1.length, v2.length);
        int i = 0;
        while (i < size){
            try{
            long ver1 = i >= v1.length ? 0 : Long.parseLong(v1[i]);
            long ver2 = i >= v2.length ? 0 : Long.parseLong(v2[i]);
            
            if(ver1 > ver2)
                return 1;
            if(ver1 < ver2)
                return -1;
            }catch(Exception e){
                int r = v1[i].compareTo(v2[i]);
                if(r != 0)
                  return r > 0 ? 1 : -1;
            }
            i++;
        }
        
        return 0;}

}
