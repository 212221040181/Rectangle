

class Main{
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5,10);
        Rectangle rectangle2 = new Rectangle(8,12);

        System.out.println(rectangle1.calculateArea() );
        System.out.println(rectangle1.calculatePerimeter());;
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());
}
}

class Rectangle{
    double length;
    double breadth;


    public Rectangle(double length,double breadth)
    {
        this.length = length;
        this.breadth =breadth;
    }

    double calculateArea(){
        System.out.println("The area of rectangle is");
        return length*breadth;
    }

    double calculatePerimeter(){
        System.out.println("The perimeter of rectangle is");
        return 2 *(length+breadth);
}
}