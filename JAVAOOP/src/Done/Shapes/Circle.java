package Shapes;

/**
 * Created by Acer-PC on 3/9/2017.
 */
public class Circle extends Shape{

    private Double radius;

    public Circle(Double radius) {
        this.setRadius(radius);
        this.calculateArea();
        this.calculatePerimeter();
    }

    @Override
    public void calculatePerimeter() {
        super.setPerimeter(2 * Math.PI * this.getRadius());
    }

    @Override
    public void calculateArea() {
        super.setArea(Math.PI * this.getRadius() * this.getRadius());
    }

    private final Double getRadius() {
        return radius;
    }

    private void setRadius(Double radius) {
        this.radius = radius;
    }
}
