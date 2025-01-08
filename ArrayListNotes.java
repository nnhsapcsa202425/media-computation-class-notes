import java.util.ArrayList;

/**
 * Write a description of class ArrayListNotes here.
 *
 * @author mcallaghan
 * @version 07jan2025
 */
public class ArrayListNotes
{
    public static void main(String[] args)
    {
        /*
         * The ArrayList is a Java Generic.
         * 
         * We have to specify the class type of the elements in the list in angle
         *      brackets (i.e., < >) after every ArrayList identifier.
         *      
         * Primitives (e.g., int, double, boolean) are not classes and cannot be
         *      specified as the type of the element in a generic. Instead, we can
         *      use the corresponding Wrapper Classes (e.g., Integer, Double, Boolean).
         */
        ArrayList<Double> myList;
        myList = createRandomDoubleList(10, 20);
        System.out.println(myList);
        removeLessThan(myList, 10.0);
        System.out.println(myList);
        System.out.println(sumList(myList));
    }
    
    /**
     * Creates and returns a reference to an ArrayList of the specified number of
     *      Double elements where each element is assigned a random value between
     *      0 and range - 1.
     *      
     *  @param size     the number of Double elements to add to the list
     *  @param range    the range of random values to assign to each element [0, range)
     *  
     *  @return a reference to the newly created and initialized list
     */
    public static ArrayList<Double> createRandomDoubleList(int size, int range)
    {
        ArrayList<Double> list = new ArrayList<Double>();
        
        for(int i = 0; i < size; i++)
        {
            double value = Math.random() * range;
            
            /*
             * The add method adds the specified object to the end of the list.
             * 
             * Autoboxing:
             *      Primitive values are automatically converted to their corresponding
             *          wrapper class. However, type promotion does not occur.
             */
            list.add(value);
            //list.add(1);  // type promotion does not occur
        }
        
        return list;
    }
         
    
    /**
     * Removes items less than a specified limit from the specified list.
     * 
     * @param list  the list of numbers to potentially remove
     */
    public static void removeLessThan(ArrayList<Double> list, double limit)
    {
        /*
         * The size method returns the number of elements in the list.
         */
        for(int i = 0; i < list.size(); i++)
        {
            /* 
             * The get method returns the value of the element at the specified index.
             */
            double value = list.get(i);
            if (value < limit)
            {
                /*
                 * The remove method deletes the element at the specified index
                 *    from the list. All subsequent elements are "shifted left".
                 */
                list.remove(i);
                i--;
            }
        }
    }
    
    public static void removeLessThanAlt(ArrayList<Double> list, double limit)
    {
        for(int i = list.size() - 1; i >= 0; i--)
        {
            if(list.get(i) < limit)
            {
                // sometimes going backwards makes the algorithm easier!
                list.remove(i);
            }
        }
    }
    
    public static double sumList(ArrayList<Double> list)
    {
        int sum = 0;
        
        /*
         * Enhanced for loops support iterating through ArrayLists.
         * 
         *  Java will automatically "unbox" wrapper class objects (e.g., Integer)
         *      and assign to variables of primitive types (e.g., int).
         */
        for(double value : list)
        {
            sum += value;
            /*
             * Modifying the list (e.g., add, remove) inside an enhanced for loop
             *      generates a ConcurrentModificationException.
             */
            //list.add(7.0);
        }
        
        return sum;
    }
}