import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> s = new ArrayList<String>(Arrays.asList("a","b","c","a","d","b"));
HashSet<String>s1 = new HashSet<String>();
ArrayList<String> s3 = new ArrayList<String>();
System.out.println(s);
for(String q :s) {
	if(s1.add(q)==false) {
		s3.add(q);
	}

	}
System.out.println(s1);
System.out.println(s3);
s.removeAll(s3);
System.out.println(s);

	}

}
