import java.util.Random;
public class Main{
  public static void main(String[] args) {
    int[] wow = new int[101];
    for (int i = 0 ;i < wow.length ; i ++ ) {
      {
        //wow[i] = (new Random()).nextInt();
        wow[i] = (new Random()).nextInt() ;
      }
    }
    String s = "{ ";
    for (int i = 0; i < wow.length ;i ++ ) {
      s = s + Integer.toString(wow[i]) + ", ";
    }
    s = s + " }";
    System.out.println(s);
    System.out.println();
    System.out.println();
     s = "{ ";
    Sorts.insertionSort(wow);
    for (int i = 0; i < wow.length ;i ++ ) {
      s = s + Integer.toString(wow[i]) + ", ";
    }
    s = s + " }";
    System.out.println(s);
    if (Tester.test(wow)) {System.out.println("CORRECTLY SORTED");}
  }
}
