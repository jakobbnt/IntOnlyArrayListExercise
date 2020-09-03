public class Main {

    public static void main(String[] args) {

        IntOnlyArray ourArray = new IntOnlyArray(0);
        ourArray.add(1);
        ourArray.add(2);
        ourArray.add(3);
        ourArray.add(4);
        System.out.println(ourArray);
        System.out.println(ourArray.get(0));
        ourArray.remove(2);
        System.out.println(ourArray);
        System.out.println(ourArray.size());
    }
}
