import java.util.Random;
public class Main{
  public static void main(String[] args) {
    int[] wow = new int[100];
    for (int i = 0 ;i < wow.length ; i ++ ) {
      {
        wow[i] = (new Random(1000)).nextInt();
      }
    }
    String s = "{ ";
    Sorts.bubbleSort(wow);
    for (int i = 0; i < wow.length ;i ++ ) {
      s = s + Integer.toString(wow[i]) + ", ";
    }
    s = s + " }";
    System.out.println(s);
    if (Tester.test(wow)) {System.out.println("CORRECTLY SORTED");}
  }
}
