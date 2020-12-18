public class Tester{
  public static boolean test(int[] wow)
  {
    boolean isit = true;
    int iterator = 0;
    while (iterator < wow.length - 1 && isit )
    {
      isit = wow[iterator] <= wow[iterator + 1];
      iterator ++;
    }
    return isit;
  }
}
