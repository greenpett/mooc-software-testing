package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
         nf.find(new int[] {3, 7, 6, 8, 1});

        // this crashes
        nf.find(new int[] {4, 3, 8, 2, 1, 40, 77});

        System.out.println(nf.getSmallest());
        System.out.println(nf.getLargest());
    }
}
