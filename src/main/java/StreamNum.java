import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamNum {
    private static final int SIZE = 50;
    private static final int RND_MIN = 1;
    private static final int RND_MAX = 500;

    public static void main (String[] args){
        var mainList = randomList(SIZE);
        List<Integer> evens = new ArrayList<>(), odds = new ArrayList<>();
        mainList.forEach(i -> { if ( i % 2 == 0) evens.add(i); else odds.add(i); });
        System.out.println(mainList);
        System.out.println(evens);
        System.out.println(odds);
    }

    public static List<Integer> randomList (int size) {
        Random rand = new Random();
        List<Integer> list = Stream
                .generate(() -> rand.nextInt(RND_MIN, RND_MAX))
                .distinct()
                .limit(size)
                .sorted()
                .toList();
        return list;
    }
}
