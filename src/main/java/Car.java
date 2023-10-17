public class Car {
    public Speed speed;
    public Color color;
    public Model model;
    static Speed speed1 = new Speed(80, 160);

    static Speed speed2 = new Speed(65, 195);
    static Color color1 = new Color("Black", 3);
    static Color color2 = new Color("Blue", 2);
    static Model model1 = new Model("Audi", 1998);
    static Model model2 = new Model("BMW", 2005);

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", color=" + color +
                ", model=" + model +
                '}';

    }
}
