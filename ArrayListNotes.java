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
         * 
         */
        ArrayList<Double> myList;
        myList = createRandomDoubleList(10, 20);
        System.out.println(myList);
    }
    
    /**
     * Creates and returns a reference to an ArrayList of the specified number of
     *      Double elements where each element is assigned a random value between
     *      1 and range.
     *      
     *  @param size     the number of Double elements to add to the list
     *  @param range    the range of random values to assign to each element [1, range)
     *  
     *  @return a reference to the newly created and initialized list
     */
    public static ArrayList<Double> createRandomDoubleList(int size, int range)
    {
        ArrayList<Double> list = new ArrayList<Double>();
        
        for(int i = 0; i < size; i++)
        {
            double value = (Math.random() * range) + 1;
            /*
             * The add method adds the specified object to the end of the list.
             * 
             * Autoboxing:
             *      Primitive values are automatically converted to their corresponding
             *          wrapper class. However, type promotion does not occur.
             */
            list.add(value);
            
        }
        return list;
    }
         
    
    /**
     * Removes even numbers from the specified list.
     * 
     * @param list  the list of number of potentially remove
     */
    public static void removeLessThan(ArrayList<Double> list, double limit)
    {
        
    }
    
    public static void removeLessThanAlt(ArrayList<Double> list, double limit)
    {
        
    }
    
    public static double sumList(ArrayList<Double> list)
    {
        int sum = 0;
        
        
        
        return sum;
    }
}