
public class Main {
    public static void main (String[] args) {
        int [] Arr1 = new int[] {6,2,6,8,3,7,1,4,4};
        System.out.println ("Number of integer(s) in the set = 9");
        System.out.println ("Size of the subArray to consider = 3");
        System.out.println ("Output = "+ Collection.deque(Arr1,9,3));
        System.out.println ();

        int [] Arr2 = new int[] {2, 2, 2, 2, 2, 2, 2, 2};
        System.out.println ("Number of integer(s) in the set = 8");
        System.out.println ("Size of the subArray to consider = 4");
        System.out.println ("Output = "+ Collection.deque(Arr2,8,4));
        System.out.println ();

        int [] Arr3 = new int[] {7, 5, 5, 7, 5, 5, 7, 5, 5, 6};
        System.out.println ("Number of integer(s) in the set = 10");
        System.out.println ("Size of the subArray to consider = 3");
        System.out.println ("Output = "+ Collection.deque(Arr3,10,3));

    }
}

