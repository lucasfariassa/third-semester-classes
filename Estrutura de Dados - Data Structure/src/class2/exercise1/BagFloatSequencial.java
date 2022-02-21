package class2.exercise1;

public class BagFloatSequencial implements BagFloat {
    private final float[] vector;
    private int n;

    // The bag structure
    public BagFloatSequencial() {
        vector = new float[10];
        n = 0;
    }

    // Return the wanted item
    public float get(int i) {
        return vector[i];
    }

    // Insert a new item inside the bag
    public void insert(float item) {
        vector[n++] = item;
    }

    // Return the number of itens inside the bag
    public int size() {
        return n;
    }
}
