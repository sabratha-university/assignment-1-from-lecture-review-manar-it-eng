public class Main {
    public static void main(String[] args) {
        // إنشاء نقطة تمثل الموقع
        Point position = new Point(2, 3);

        // إنشاء دائرة باستخدام الكلاس الجديد
        Circle c = new Circle(position, 5);

        // عرض معلومات الدائرة
        System.out.println("Circle's radius: " + c.getRadius());
        System.out.println("Circle's size: " + c.getSize());
        System.out.println("Circle's position: " + position);

        // رسم الدائرة
        c.draw();

        // تعديل الحجم بالضرب في 2
        c.resize(2);
        System.out.println("After resizing by factor 2:");
        c.draw();

        // تعديل الحجم بالضرب في 3
        c.resize(3);
        System.out.println("After resizing by factor 3:");
        c.draw();
    }
}