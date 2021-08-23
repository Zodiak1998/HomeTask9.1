import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {

        List<AutobusStops> stops = new ArrayList<>();
        AtomicInteger countOfPeople = new AtomicInteger();

        stops.add(new AutobusStops("Airport", 23, 0));
        stops.add(new AutobusStops("School", 2, 15));
        stops.add(new AutobusStops("Shop", 10, 1));
        stops.add(new AutobusStops("End", 0, 19));

        stops.stream().forEach(s-> countOfPeople.set((countOfPeople.get() + s.countPeopleIn) - s.countPeopleOut));

        if (countOfPeople.get() < 0) System.err.println("ERROR");
            else System.out.println("Count of people in the end: " + countOfPeople);

    }
}
