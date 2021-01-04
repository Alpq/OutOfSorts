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
  public static void selectionSort(int[] data){
    int temp;
    for (int i = 0; i < data.length; i ++ ) {
      int form = i;
      int min = data[i];
      for (int j = i; j < data.length; j++ ) {
        if (data[j] < min) {form = j;}
        min = Math.min(data[j], min);
      }
      temp = data[i];
      data[i] = min;
      data[form] = temp;
    }
  }
  public static void insertionSort(int[] data){
    int temp;
    for (int i = 1; i < data.length; i ++ ) {
      if (data[i-1] > data[i])
      {
        temp = data[i];
        boolean notfound = true;
        int iterator = i;
        while (notfound && iterator > 0) {
          if (data[iterator - 1] < temp)
          {
            notfound = false;
            data[iterator] = temp;
          }
          else {data[iterator] = data[iterator - 1];}
          iterator--;
        }
      }
    }
  }
}
