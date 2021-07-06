package java_web.branches_ex;

import java.util.Arrays;

public class MyList<E> {
    int size =0 ;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    public void add(int index, E element)
    {
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size );
        }

        if(size == elements.length){
            ensureCapacity(size + 5);
        }

        for (int i = size; i > index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        size++;
    }
    public E remove(int index)
    {
        E result = (E) elements[index];
        for(int i = index; i < size-1; i++){
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return result;
    }
    public int size()
    {
        return this.size;
    }
    public E clone() throws CloneNotSupportedException {
        return (E) super.clone();
    }
    public boolean contains(E o)
    {
        for (int i = 0; i < size; i++){
            if (o == elements[i]){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o)
    {
        if (contains(o)){
            for (int i = 0; i < size; i++){
                if(elements[i] == o){
                    return i;
                }
            }
        }
        return -1;
    }
    public boolean add(E e)
    {
        if(size == elements.length){
            ensureCapacity(size + 5);
        }
        elements[size++] = e;
        return true;
    }
    public void ensureCapacity(int minCapacity)
    {

        elements = Arrays.copyOf(elements, minCapacity);
    }
    public E get(int index)
    {
        if (index >= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size );
        }
        return (E) elements[index];
    }
    public void clear()
    {
        for (int i = 0; i < size; i++){
            elements[i] = null;
        }

        size = 0;
    }
    @Override
    public String toString(){
        String result = "";
        result += "Array List: [";
        for(int i = 0; i < size-1; i++){
            result += elements[i].toString() + ", ";
        }
        if(size > 0){
            result += elements[size-1].toString();
        }
        result += "]";
        return result;
    }
}
