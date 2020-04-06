import org.junit.jupiter.api.Test;

import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

class CollectionTest {
    @Test
    void deque () {
        int [] Arr = new int[]{7, 5, 5, 7, 5, 5, 7, 5, 5, 6};
        assertEquals(3, Collection.deque(Arr,10,3));
    }
}