
public class Main {

    public static void main(String[] args) {
        Vehicle plane1 = new Plane("Boeing 747", 2000000);
        Vehicle plane2 = new Plane("Boeing 747", 2000000);
        Vehicle boat1 = new Boat("Suzuki", 1100);
        Vehicle boat2 = new Boat("Isuzu", 1300);

        System.out.println("Plane1 = " + plane1);
        System.out.println("Plane2 = " + plane2);
        System.out.println("Boat1 = " + boat1);
        System.out.println("Boat2 = " + boat2);

        System.out.println("Plane1 == Plane2 = " + plane1.equals(plane2));
        System.out.println("Boat1 == Boat2 = " + boat1.equals(boat2));
    }

}
