package mathHomework;
import java.util.Scanner;
public class circumToArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner scan = new Scanner(System.in);
		System.out.println("type  a circumference");
int circum = scan.nextInt();
int radiusPi = circum/2;
double radius = radiusPi/3.14159;
double area = radius*radiusPi;
System.out.println("the area of the circle is "+area);
	}

}
