package class2.exercise1;

public class Test {
    public static void main(String[] args) {
        BagFloat sacola = new BagFloatSequencial(); // create a new bag
        sacola.insert(1); // add the item 1 to [0] position inside the bag
        sacola.insert(2);
        sacola.insert(3);
        sacola.insert(4);

        System.out.println(sacola.size()); // print the number of itens inside the bag
        System.out.println(sacola.get(1)); // indicate the number of the item [1]
    }
}
