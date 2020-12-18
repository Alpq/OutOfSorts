// Thank you to Reng Zheng for helping with Testing.
public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data)
  {
    for (int j = 0; j < data.length - 1; j++)
    {
      for (int i = 0 ;i < data.length - j - 1; i ++)
      {
          int temp;
          if (data[i] > data[i + 1])
          {
            temp = data[i + 1];
            data[i + 1] = data[i];
            data[i] = temp;
          }
      }
    }
  }
}
