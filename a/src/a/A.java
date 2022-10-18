package a;

public class A{
	 private double radius = 1;
	 private double perimeter;
	 private double factor;
	 private double area;
	 
	 public A(double radius, double perimeter, double factor, double area) {
	 	this.radius = radius;
	 	this.perimeter = perimeter;
	 	this.factor = factor;
	 	this.area = area;
	 
	 	if(radius < 0)
	 		radius = 1;
	 
	 }
	 
/*   public A(){
 * 		this.radius = 1;
 * 
 * 	 public A(double perimeter, double factor, double area){
 * 		this();
 * 		this.perimeter = perimeter;
 *	 	this.factor = factor;
 *	 	this.area = area;
 * 		
 */
	 
	 
	 
	 
	 public void scale(double factor){
	 radius = radius*factor;
	 }
	 
	 public double getRadius(){
	 return radius;
	 }
	 
	 public double area(){
	 return Math.PI*radius*radius;
	 }
	 
	 public double perimeter(){
	 return 2*Math.PI*radius;
	 }

}
