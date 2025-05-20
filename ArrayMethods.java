/********************************************
*	AUTHOR:	Conal Hamilton
* COLLABORATORS: None
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED: May 20 2025
********************************************/

/********************************************
*	ArrayMethods
*********************************************
*	PROGRAM DESCRIPTION:
*	Collection of useful methods for int arrays.
*********************************************

/* UML CLASS DIAGRAM:
-----------------------------------------
ArrayMethods
-----------------------------------------
-----------------------------------------
+ arrayString(array : int[]) : String //static
+ swap(array : int[], a : int, b : int) : void //static
+ indexOfMin(array : int[], startIndex : int) : int //static
+ reverse(array : int[]) : void //static
+ selectionSort(array : int[]) : void //static
-----------------------------------------
*/

public class ArrayMethods
{
  /**
   * Assembles and returns string containing contents of an int array
   * 
   * @param a int array of values, must be of 1 length or greater
   * 
   * @return contents of array in String separated by commas and concatenated with brackets
   * 
  */
  public static String arrayString(int[] a)
  {
    String results = "{ " + a[0];
    for (int i = 1; i < a.length; i++)
    {
      results += ", " + a[i];
    }
    results += " }";
    return results;
  }
  
  /**
   * Swaps two values of an int array at the given locations
   * 
   * @param array int array to be modified
   * @param a array index of first location to swap, must be valid index number
   * @param b array index of second location to swap, must be valid index number
  */
  public static void swap(int[] array, int a, int b)
  {
    int valFromA = array[a];
    int valFromB = array[b];
    array[a] = valFromB;
    array[b] = valFromA;
  }
	
	/**
   * Identifies and returns the index number of the smallest value in a given int array, ignoring all values before the given index
   * 
   * @param array int array to be analyzed
   * @param startIndex index of value to start analysis at, earlier values in the array will be ignored, must be valid array index
   * @return index of smallest value in the array, ignoring all values before that held at startIndex
  */
  public static int indexOfMin(int[] array, int startIndex)
  {
    int testValue = array[startIndex];
    int testValueIndex = startIndex;
    for (int i = startIndex; i < array.length; i++)
    {
      if(testValue >= array[i])
      {
        testValue = array[i];
        testValueIndex = i;
      }
    }
    return testValueIndex;
  }

	/**
   * Reverses the order of a given int array
   * 
   * @param array int array to be reversed, will be modified
  */
  public static void reverse(int[] array)
  {
    int halfLength = array.length/2;
    for(int i = 0; i < halfLength; i++)
    {
      ArrayMethods.swap(array, i, array.length-i-1);
    }
  }

	/**
   * Sorts a given int array by ascending value
   * 
   * @param array int array to be sorted, will be modified
  */
  public static void selectionSort(int[] array)
  {
    for (int i = 0; i < array.length; i++) 
    {
      int indexMinValue = ArrayMethods.indexOfMin(array, i);
      ArrayMethods.swap(array, i, indexMinValue);
    }
  }

}
