

public class Main {
    public static void main(String[] args) {
        UnaCompSciList<Integer> myList = new UnaCompSciList<>();

        for (int i = 0; i < 10; i++) {
            myList.insertAtBeginning(i + 1);
            System.out.println(myList);
        }

        System.out.println(myList);

        myList.removeAtEnding();

        System.out.println(myList);

        System.out.println();
    }
}