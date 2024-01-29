package basics;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
public class CustomRandomAccessList<E> extends AbstractList<E> {//implements RandomAccess {
    private Object[] elements;
    private int size;
    public CustomRandomAccessList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        this.elements = new Object[initialCapacity];
    }
    @Override
    public E get(int index) {
    	if(this instanceof RandomAccess) {
		        if (index < 0 || index >= size) {
		            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		        }
	       return (E) elements[index];
    	}else {
    		throw new UnsupportedOperationException("Random access is not supported");
    	}
    }
    @Override
    public int size() {
        return size;
    }
    public boolean add(E element) {
        ensureCapacity(size + 1);
        elements[size++] = element;
        return true;
    }
    private void ensureCapacity(int minCapacity) {
        if (minCapacity - elements.length > 0) {
            int newCapacity = elements.length * 2;
            if (newCapacity - minCapacity < 0) {
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
    public static void main(String[] args) {
        CustomRandomAccessList<String> customList = new CustomRandomAccessList<>(10);
        customList.add("Apple");
        customList.add("Banana");
        customList.add("Cherry");
        System.out.println("Fruit at index 1: " + customList.get(1));
    }
}







