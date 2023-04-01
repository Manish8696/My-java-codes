import java.util.Arrays;

public class EvenOneSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a = {12,45,76,90,89};
int b = a.length;
int k = b-1;
int y=0;

int [] n = new int[b];

for(int i = 0;i<b;i++) {
	if(a[i]%2==0) {
		n[y]=a[i];
		y++;
	}
	else {
		n[k]=a[i];
		k--;
	}
}

System.out.println(Arrays.toString(n));
System.out.println("without use of another array:----------------");
int p =0;
int temp;
for(int i = 0;i<b;i++) {
	if(a[i]%2==0) {
		temp=a[i];
		a[i]=a[p];
		a[p]=temp;
		p++;
	}
}
System.out.println(Arrays.toString(a));
	}

}
