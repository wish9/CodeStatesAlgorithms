import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        String[] arr = new String[]{"Queen", "Elizabeth", "Of Hearts", "Beyonce"};
//        TransformFirstAndLast transform = new TransformFirstAndLast();
//
//
//        HashMap<String, String> output = transform.transformFirstAndLast(arr);
//        System.out.println(output);


        TransformFirstAndLast transform = new TransformFirstAndLast();

        System.out.println(transform.computeWhenDouble(7));
        System.out.println(transform.computeWhenDouble(2.3));
    }
}