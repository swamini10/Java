

package encapsulationdemo.demo;
import java.util.Scanner;


public class MainApp {
public static void main(String[] args) {
	Data dt=new Data();
	boolean start=true;
	while (start) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ENter 1 for set data\nEnter 2 for get Data\n press 3 for exit");
	
	int ch=sc.nextInt();
	switch (ch) {
	case 1:
		dt.setData();
		break;
		
	case 2:
		dt.getData();
		break;
		
	case 3:
		start=false;
		break;
	}
}
	
}
}
