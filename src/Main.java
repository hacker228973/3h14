public class Main {
    public static void main(String[] args) {

        MyStringArrayList arr = new MyStringArrayList();

        arr.add(0, "text");

        arr.add(1, "text");

        arr.remove(0);

        arr.set(0, "test 2");

        arr.get(1);
        System.out.println(arr); // toString()
    }
}
