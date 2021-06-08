import java.util.ArrayList;
import java.util.HashMap;

public class MarkAndCompactGCMain {
    public static void main ( String[] args ){
        if( args.length != 4 ){
            System.out.println("Invalid number of arguments!");
            return;
        }
        // 0 heap - 1 roots - 2 pointers - 3 newHeap
        MarkAndCompactGC garbageCollector = new MarkAndCompactGC(args[0], args[1] , args[2] );
        FileHandling.storeHeap(garbageCollector.markAndCompactGC() , args[3]);
    }
}

