package opps;
import javax.sound.sampled.Line;


@SuppressWarnings("unused")
abstract class Shape
{
	abstract void draw();

}
class line extends Shape
{
	void draw()
	{
		System.out.println("Drawing a line ");
	}
}
class Rect extends Shape  
{
	void draw()
	{
		System.out.println("Drawing a Rectangle");
	}
}
class Cube extends Shape
{
	void draw()
	{
		System.out.println("Drawing a Cube");
	}
}
class Circle extends Shape  
{
	void draw()
	{
		System.out.println("Drawing a Circle");
	}
}
class Cone extends Shape
{
	void draw()
	{
		System.out.println("Drawing a Cone");
	}
}




