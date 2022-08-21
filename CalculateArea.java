package methods;

public class CalculateArea {

	void CalculateArea(int radius)
	{
		double area=3.14*radius*radius;
		System.out.println("The area of circle=:"+area);
	}
	void CalculateArea(int l,int b)
	{
		double area=l*b;
		System.out.println("The area of Recatangle=:"+area);
	}
	void CalculateArea(int s1,int s2,int s3)
	{
		int s=s1+s2+s3;
		double area=Math.sqrt(s*(s-s1)*(s-s2)*s-s3);
		System.out.println("The areaof triangle is=:"+area);
	}

}
