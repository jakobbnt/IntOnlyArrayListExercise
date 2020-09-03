import java.util.Arrays;

public class IntOnlyArray {


    int[] array;

    public IntOnlyArray(int i) {
        this.array = new int[i];
    }

    public IntOnlyArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void add(int i){
        int[] newArray = new int[this.array.length + 1];
        for(int j = 0; j < newArray.length; j++){
            if(j >= array.length){
                newArray[j] = i;
            }else {
                newArray[j] = array[j];
            }
        }
        this.array = newArray;
    }

    public int get(int i){
        return this.array[i];
    }

    public void remove(int index){
        int[] newArray = new int[this.array.length - 1];
        for(int i = 0; i < newArray.length; i++){
            if(i == index || i > index){
                newArray[i] = array[i+1];
            }else{
                newArray[i] = array[i];
            }
        }
        this.array = newArray;
    }

    public int size(){
        return array.length;
    }



    @Override
    public String toString() {
        return "IntOnlyArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
