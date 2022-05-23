import java.util.Arrays;

public class MyStringArrayList {
    private int size = 1;
    private String[] array = new String[size];

    private void resize(int newLength){
        String[] newArray = new String[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        size=newLength;
        array = newArray;
    }

    public void add(int index, String element){
        array[index]=element;
        resize(size+1);
    }

    public void remove(int index){

        if (size - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, size - 1 - index);
        array[size-1]=null;

    }
    public void set(int index, String element){
        array[index]=element;
    }
    public void get(int index){
        System.out.println(array[index]);
    }
    @Override
    public String toString() {
        return "MyArrayList=" + Arrays.toString(array);
    }
}
