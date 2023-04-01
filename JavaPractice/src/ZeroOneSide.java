import java.util.Arrays;

public class ZeroOneSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] n = {12,0,8,9,0,76,-13,0};
int a = n.length;
int [] n1 = new int[a];
int s=0;
for(int i =0;i<a;i++) {
	if(n[i] !=0) {
		n1[s]=n[i];
		s++;
	}
}
System.out.println(Arrays.toString(n1));
	}

}
