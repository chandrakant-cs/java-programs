import java.util.Scanner;
abstract class shape
{
    double dim1,dim2;
    shape(double a,double b)
    {
        dim1=a;
        dim2=b;
    }
    abstract void area();
}

class rectangle extends shape
{

     rectangle(double length,double breadth)
    {
        super(length,breadth);
    }
    void area()
    {
        System.out.print("area of rectangle is ::");
        System.out.println( dim1*dim2);
    }
}

class triangle extends shape
{

    triangle(double height,double base )
    {
        super(height,base);
    }
    void area ()
    {
        System.out.print("area of triangle is::");
        System.out.println( dim1*dim2*0.5);
    }
    
}

class circle extends shape
{

    public circle(double radius) {
        super(radius,0);
    }
    void area ()
    {
        System.out.print("area of circle is ::");
        System.out.println(dim1*dim1*3.14);
    }
    
}

class shapedemo 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter rectagle length and breadth::");
        double length=s.nextDouble();
        double breadth=s.nextDouble();

        System.out.println("enter triangle height and base::");
        double height=s.nextDouble();
        double base=s.nextDouble();

        System.out.println("enter circle radius::");
        double radius=s.nextDouble();

        
        rectangle r=new rectangle(length,breadth);
        triangle t=new triangle(height,base);
        circle c=new circle(radius);

        r.area();
        c.area();
        t.area();
    }
}