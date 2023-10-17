public class Color {
    String name;
    int density;

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", density=" + density +
                '}';
    }

    public Color(String name, int density) {
        this.name = name;
        this.density = density;

    }
}
