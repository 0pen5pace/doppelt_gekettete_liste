package ch.ffhs.dua.pva.list;

import java.util.Iterator;
import java.util.List;
// http://www.sanfoundry.com/java-program-implement-circular-singly-linked-list/

public class LinkedList<E> extends ListBasic<E> implements List<E>
{
    
    public static void main(String [] args) {
        Sy
    }

    
    @Override
    public int size()
    {
        // TODO
    	return -1;
    }

    @Override
    public boolean isEmpty()
    {
        // TODO
    	return false;
    }
    
    @Override
    public E get(int index)
    {
        // TODO
    	return null;
    }


    @Override
    public E set(int index, E element)
    {
        // TODO
        return null;
    }
    
    
    @Override
    public boolean add(E element)
    {
        // TODO
        return true;
    }

    @Override
    public void add(int index, E element)
    {
        //TODO     
    }

    
    public boolean contains(Object o)
    {
        // TODO
    	return false;
    }

    @Override
    public E remove(int index)
    {
        // TODO
        return null;
    }
    
    @Override
    public boolean remove(Object o)
    {
        // TODO
    	return false;
    }

    @Override
    public void clear()
    {
        // TODO
    }

    @Override
    public Iterator<E> iterator()
    {
        return new LinkedListIterator();
    }
    
///////////////////////////////////////////////////
    
   

    private static class Node<E>
    {
        E element;
        Node<E> next;
        Node<E> prev;
        
        public Node(<E> data){
            next = null;
            prev = null;
            element = data;
        }
    }
    
    private class LinkedListIterator implements Iterator<E>
    {
       
        @Override
        public boolean hasNext()
        {
            // TODO
        	return false;
        }

        @Override
        public E next()
        {
            // TODO
            return null;
        }
        
        @Override
        public void remove()
        {
           // TODO
        }
    }
    

}
