public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.color = Car.color1;
        car1.model = Car.model1;
        car1.speed = Car.speed1;

        Car car2 = new Car();
        car2.color = Car.color2;
        car2.model = Car.model2;
        car2.speed = Car.speed2;

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();

        while (car1.speed.velocity < 100) {
            car1.speed.accelerate();
        }
        while (car2.speed.velocity < 100) {
            car2.speed.accelerate();
        }
        System.out.println(car1);
        System.out.println(car2);
        System.out.println();

        while (car1.speed.velocity > 0) {
            car1.speed.slowDown();
            if (car1.speed.velocity < 0) {
                car1.speed.velocity = 0;
            }
        }
        while (car2.speed.velocity > 0) {
            car2.speed.slowDown();
            if (car2.speed.velocity < 0) {
                car2.speed.velocity = 0;
            }
        }
        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
    }
}
