public class Model {
    String name;
    int year;

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public Model(String name, int year) {
        this.name = name;
        this.year = year;

    }
}
