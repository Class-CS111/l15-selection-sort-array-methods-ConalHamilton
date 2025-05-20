/********************************************
*	AUTHOR:	Conal Hamilton
* COLLABORATORS: None
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED:	May 20 2025
********************************************/

public class Main 
{
  public static void main(String[] args)
  {
    int[] values = {12, 16, 26, 42, 53, 77, 84};
    int[] numbers = {42, 16, 84, 12, 77, 26, 53};
    int[] numbers2 = {42, 16, 84, 12, 77, 26, 53, 6};
    System.out.println("Test array named 'values' contains: " + ArrayMethods.arrayString(values));
    ArrayMethods.swap(values, 0, 6);
    System.out.println("Test array after swapping first and last elements contains: " + ArrayMethods.arrayString(values));
    System.out.println("Test array 'numbers' contains: " + ArrayMethods.arrayString(numbers));
    System.out.println("Index of the smallest value in array 'numbers' is: " + ArrayMethods.indexOfMin(numbers, 0) + "(Should be 3)");
    System.out.println("Index of the smallest value in array 'numbers' when observed from the 4th index on is: " + ArrayMethods.indexOfMin(numbers, 4) + "(Should be 5)");
    System.out.println("The array 'numbers' currently is: " + ArrayMethods.arrayString(numbers));
    ArrayMethods.reverse(numbers);
    System.out.println("After reversing, the array 'numbers' is: " + ArrayMethods.arrayString(numbers));
    System.out.println("The array 'numbers2' currently is: " + ArrayMethods.arrayString(numbers2));
    ArrayMethods.reverse(numbers2);
    System.out.println("After reversing, the array 'numbers2' is: " + ArrayMethods.arrayString(numbers2));
    System.out.println("The array 'numbers' currently is: " + ArrayMethods.arrayString(numbers));
    ArrayMethods.selectionSort(numbers);
    System.out.println("The array 'numbers' after sorting by ascending value is: " + ArrayMethods.arrayString(numbers));
  }
}
