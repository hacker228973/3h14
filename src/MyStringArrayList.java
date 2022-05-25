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
        if (rangeCheckFor(index,"add")) {
            array[index] = element;
            resize(size + 1);
        }

    }

    public void remove(int index) {
        if (rangeCheckFor(index,"remove")){
            if (size - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, size - 1 - index);
            array[size - 1] = null;
        }
    }

    public void set(int index, String element) {
        if (rangeCheckFor(index,"set")) {
            array[index] = element;
        }


    }

    public void get(int index) {
        if (rangeCheckFor(index,"get")) {
            System.out.println(array[index]);
        }
    }

    public boolean rangeCheckFor(int index,String action){
        if (index >= 0 && index < size) {
            return true;
        }
        System.out.println("sry, but u cant "+ action +" the element, cause index under number "+ index +" exist from the size of the Array, maximum value is " +(size-1));
        return false;
    }


    @Override
    public String toString() {
        return "MyArrayList=" + Arrays.toString(array);
    }
}
