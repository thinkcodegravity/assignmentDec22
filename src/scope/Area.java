package scope;

public class Area {

	public float square(float length)
	{
		float area = length*length;
		return area;
	}
	
	public double circle(float radius)
	{
		double area = Math.PI * radius * radius;
		return area;
	}
}
