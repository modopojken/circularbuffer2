import java.util.NoSuchElementException;

/**
 * Queue for ints implemented with a circular buffer.
 */
public class CircularBuffer {
    private int[] buffer;

    /**
     * Creates a new circular buffer with a given size;
     * @param size The size of the buffer.
     * @throws IllegalArgumentException If the size is smaller than 1.
     */
    public CircularBuffer(int size) {
        if(size<1){
            throw new IllegalArgumentException("Size should be > 0");
        }
        buffer = new int[size];
        //throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Adds an element to the buffer.
     * @param i The element to add.
     * @throws IllegalStateException If the buffer is full.
     */
    public void put(int i) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Returns and removes the first element in the buffer.
     * @return The first element in the buffer.
     * @throws NoSuchElementException If the buffer is empty.
     */
    public int take() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * @return The current number of elements in the queue.
     */
    public int size() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * @return The maximum number of elements in the queue.
     */
    public int maxSize() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
