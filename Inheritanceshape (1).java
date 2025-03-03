class Inheritanceshape {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(12.0,13.0);
        r.area();
        triangle s=new triangle(12.0,13.0);
        s.area();
        square t=new square(12.0);
        t.area();
        circle q=new circle(2.0);
        q.area();
    }
}
class Shape{
    double area;
        double l;
         double b;
         double a;
        final double pie=3.14;
    void area(){
         System.out.println("area of shape");
    }
}
class Rectangle extends Shape{
        Rectangle( double l, double b){
            this.l=l;
            this.b=b;
            area=l*b;
        }
      public void area(){
          super.area();
             System.out.println("area of rectangle:"+area);
    }
}
class triangle extends Shape{
        triangle( double l, double b){
            this.l=l;
            this.b=b;
            area=0.5*l*b;
        }
      public void area(){
             System.out.println("area of triangle:"+area);
    }
}
class square extends Shape{
        square( double a){
            this.a=a;
            area=a*a;
        }
      public void area(){
             System.out.println("area of square:"+area);
    }
}
class circle extends Shape{
        circle( double a){
            this.a=a;
            area=pie*a*a;
        }
      public void area(){
             System.out.println("area of circle:"+area);
    }
}