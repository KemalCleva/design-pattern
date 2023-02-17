package it.euris.bridge;

public class ShapeFactory {

  private static ShapeFactory instance;

  private ShapeFactory() {

  }

  public static ShapeFactory getInstance() {
    if (instance == null) {
      instance = new ShapeFactory();
    }
    return instance;
  }

  public Shape createShape(ShapeEnum shapeEnum, ColorEnum colorEnum) {
    Color color = createColor(colorEnum);
    switch (shapeEnum) {
      case CIRCLE: return new Circle(color);
      case SQUARE: return new Square(color);
      default:
        throw new IllegalStateException("Unexpected value: " + shapeEnum);
    }
  }

  public Color createColor(ColorEnum colorEnum) {
    switch (colorEnum) {
      case RED: return new Red();
      case BLUE: return new Blue();
      default:
        throw new IllegalStateException("Unexpected value: " + colorEnum);
    }
  }
}
