package j6_part2;

public class Short_the_array {

	public static void main(String[] args) {
		
int array[]= {1,2,3,4,5,6};
int temp;
for (int i = 0; i < array.length; i++) {
	
	for (int j = 0; j < array.length; j++) {
		if (array[i]<=array[j]) {
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;	
		}
		
	}	
}System.out.println();

for (int i = 0; i < array.length; i++) {
	System.out.println(array[i]);
		
}

	}

}
