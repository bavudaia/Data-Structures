/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;

import linkedlist.Node;

/**
 *
 * @author bavudaia
 */
public class Stack<T> {
    private Node<T> stack;
    private int size;
    private int max_size;
    private int default_size = 10;
    public Stack()
    {
        this.max_size = this.default_size;
    }
    public Stack(int A[])
    {
        
    }
    public Stack(int size)
    {
        this.max_size = size;
    }
    
    public void push(T data)
    {
        if(size >= max_size)
        {
            return;
        }
        else if(stack == null)
        {
            stack = new Node(data);
            size++;
        }
        
        else
        {
            Node temp = new Node(data);
            temp.next = stack;
            stack = temp;
            size++;
        }
    }
    
    public T peek()
    {
        if(size == 0)
        {
            return null;
        }
        else
        {
            return stack.data;
        }
    }
    
    public T pop()
    {
        if(size == 0)
        {
            return null;
        }
        else
        {
            T top_ele = stack.data;
            stack = stack.next;
            return top_ele;
        }
        
    }
}
