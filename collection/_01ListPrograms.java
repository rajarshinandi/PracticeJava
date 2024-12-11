import java.util.ArrayList;

public class _01ListPrograms {
    public static void main(String[] args) {

//        Example of non generic Collection (list)
//        Here we can add any datatype in the arraylist (not type-safe)

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add("Thirty!!");
        al.add(true);

        System.out.println(al);
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i) + " is of type " + al.get(i).getClass());
        }

    }
}

