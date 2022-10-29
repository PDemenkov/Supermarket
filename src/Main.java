import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Main {
    private static final List<String> NAMES = List.of(
            "Ivan Ivanov",
            "Petr Petrov",
            "Nikolay Nikolaev",
            "Alexei Ivanov",
            "Mariya Sidoraove",
            "Gleb mihaylov",
            "Mickail Petrov",
            "Ivan Petrov",
            "Petr Ivanov",
            "Dmitry Dmitriev"
    );
    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE=5;
    public static void main(String[] args) {

        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        ramdomFill(queue1);
        ramdomFill(queue2);
        System.out.println(queue1);
        System.out.println(queue2);
        add("Pavel",queue1,queue2);
        System.out.println(queue1);
        System.out.println(queue2);


    }
private static void add(String name,Queue<String> queue1,Queue<String>queue2) {
    if (queue1.size() < queue2.size() && queue1.size()!=MAX_SIZE) {
        queue1.offer(name);
    } else if (queue2.size() < queue1.size() && queue2.size() != MAX_SIZE) {
        queue2.offer(name);
    }
    if (queue1.size()==MAX_SIZE || queue2.size()==MAX_SIZE){
        System.out.println("Нужно позвать Галю!");
    }
}
private static void remove(Queue<String> queue1,Queue<String>queue2) {
    if (RANDOM.nextBoolean()) {
        queue1.poll();
    } else {
        queue2.poll();
    }
}
    private static void ramdomFill(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE+1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }
}