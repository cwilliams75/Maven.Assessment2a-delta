package rocks.zipcode.assessment2.arrays;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
       // int [] newIntegerArray = new int[integerArray.length +1];

       // for (int i = 0; i < integerArray.length ; i++) {
         //   newIntegerArray[i] = integerArray[i];
       // }
       // newIntegerArray[newIntegerArray.length - 1] = valueToBeAdded;
        return null;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
       // int i;
       // nt newarr[] = new int[valueToBeInserted + 1];

      //  for (int i = 0; i < valueToBeInserted + 1; i++) {
       //     if (i < indexToInsertAt - 1)
        //        newarr[i] = integerArray[i];
        //    else if (i == valueToBeInserted - 1)
        //        newarr[i] = valueToBeInserted;
        //    else
        //        newarr[i] = integerArray[i - 1];
      //  }
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {

        return indexToFetch;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        return null;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        return null;
    }
}
