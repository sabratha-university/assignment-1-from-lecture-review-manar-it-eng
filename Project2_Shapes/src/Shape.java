

public abstract class Shape implements Movable, Adjustable {
    protected Point position;  // تركيب: Shape يحتوي على Point

    public Shape(Point position) {
        this.position = position;
    }

    // تنفيذ Movable
    @Override
    public void move(double dx, double dy) {
        position.setX(position.getX() + dx);
        position.setY(position.getY() + dy);
    }

    @Override
    public Point getPosition() {
        return position;
    }

    // تنفيذ Adjustable (أساسي، يُعاد تعريفه في الفئات الفرعية)
    @Override
    public abstract void resize(double factor);
    @Override
    public abstract double getSize();

    // طريقة أساسية للرسم (تُعاد تعريفها للتعدد الشكلي)
    public abstract void draw();
}
