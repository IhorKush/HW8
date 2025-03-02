import java.util.Random;

public class Main {
    public static void main(String[] args) {

        double[] weights = new double[10];
        double weightOfPeople = 0;
        int peopleCount = 0;

        for (int i = 0; i < weights.length; i++) {
            weights[i] = (new Random().nextDouble() * 60) + 40;
            weightOfPeople += weights[i];
            if (weights[i] >= 60 && weights[i] <= 80) {
                peopleCount++;
            }
        }
        System.out.println("Middle weight of people is " + weightOfPeople / weights.length);
        System.out.println("Count of people who has weight between 60 and 80 is " + peopleCount);
    }
}
