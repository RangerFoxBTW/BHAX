import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
	
	public static void main(String[] args) {
		
		ArrayList arraylist = new ArrayList();
        LinkedList linkedlist = new LinkedList();

        
		//Arraylist Add
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            arraylist.add(i);
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("ArrayList Add time: " + duration);

        //LinkedList Add
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            linkedlist.add(i);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("LinkedList Add time: " + duration);
        
        
        System.out.println("-----------------------------------------------------------");
        
        
        //ArrayList Get
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            arraylist.get(i);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("ArrayList Get time: " + duration);

        //LinkedList Get
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            linkedlist.get(i);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("LinkedList Get time: " + duration);
         
         
        System.out.println("-----------------------------------------------------------");
         
         
        //ArrayList Remove
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            arraylist.remove(i);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("ArrayList Remove time: " + duration);


        //LinkedList Remove
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            linkedlist.remove(i);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("LinkedList Remove time: " + duration);

         
	}

}