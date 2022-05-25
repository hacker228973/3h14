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
    private void resizeForRemove(int newLength) {
        String[] newArray = new String[newLength];
        System.arraycopy(array, 0, newArray, 0, newLength);
        size = newLength;
        array = newArray;

    }

    public void add(int index, String element) {
        if (rangeCheckFor(index,"add")) {
            if(array[index]==null) {
                resize(size + 1);
                array[index] = element;
            }
            else{
                resize(size + 1);
                for(int i = size-1;i>index;i--){

                    array[i]=array[i-1];
                }
                array[index] = element;
            }
        }

    }

    public void remove(int index) {
        if (rangeCheckFor(index,"remove")){
            if (size - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, size - 1 - index);
//            array[size - 1] = null;
            resizeForRemove(size-1);
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
        System.out.println("sry, but you can't "+ action +" the element, cause index under number "+ index +" exist from the size of the Array, maximum value is " +(size-1));
        return false;
    }


    @Override
    public String toString() {
        String[] newArray = new String[size-1];
        System.arraycopy(array, 0, newArray, 0, size-1);
        return "MyArrayList=" + Arrays.toString(newArray);

    }
}
