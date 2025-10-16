

public class Circle extends Shape {
    private double radius;  // خاصية إضافية

    public Circle(Point position, double radius) {
        super(position);
        this.radius = radius;
    }

    // إعادة تعريف لـ Adjustable
    @Override
    public void resize(double factor) {
        radius *= factor;
    }

    @Override
    public double getSize() {
        return radius;
    }

    // إعادة تعريف للرسم (تعدد شكلي)
    @Override
    public void draw() {
        System.out.println("Drawing a circle at " + position + " with radius " + radius);
    }

    // Getter و Setter للشعاع
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
}
