import java.util.Arrays;

public class MyStringArrayList {
    private int size = 1;
    private String[] array = new String[size];

    private void resize(int newLength) {
        String[] newArray = new String[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        size = newLength;
        array = newArray;
    }

    public void add(int index, String element) {
        if (index >= 0 && index < size) {
            array[index] = element;
            resize(size + 1);
        }
        else{
            System.out.println("sry, but u cant add element, cause index under number "+ index +" exist from the size of the Array, maximum value is " +(size-1));
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            if (size - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, size - 1 - index);
            array[size - 1] = null;
        }else{
            System.out.println("sry, but u cant remove element, cause index under number "+ index +" exist from the size of the Array, maximum value is " +(size-1));
        }
    }

    public void set(int index, String element) {
        if (index >= 0 && index < size) {
            array[index] = element;
        }else{
            System.out.println("sry, but u cant set element, cause index under number "+ index +" exist from the size of the Array, maximum value is " +(size-1));
        }

    }

    public void get(int index) {
        if (index >= 0 && index < size) {
            System.out.println(array[index]);
        }else{
            System.out.println("sry, but u cant get element, cause index under number "+ index +" exist from the size of the Array, maximum value is " +(size-1));
        }
    }

    @Override
    public String toString() {
        return "MyArrayList=" + Arrays.toString(array);
    }
}
