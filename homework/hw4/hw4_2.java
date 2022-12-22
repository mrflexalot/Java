// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

package homework.hw4;

import java.util.*;

public class hw4_2
{
	class Node
	{
		public int data;
		public Node next;
	}

	private Node first;

	public hw4_2()
	{
		first = null;
	}

	public void insertFirst(int x)
	{
		Node n = new Node();
		n.data = x;
		n.next = first;
		first = n;
	}

	public void enqueue(int x)
	{
		if (first == null)
		{
			insertFirst(x);
		}
		else
		{
			Node n = new Node();
			n.data = x;
			Node temp = first;
			while (temp.next != null)
				temp = temp.next;
			n.next = temp.next;
			temp.next = n;
		}
	}

	public int dequeue()
	{
		if (first == null)
		{
			throw new NoSuchElementException();
		}
		else
		{
			int ret = first.data;
			first = first.next;
			return ret;
		}
	}

	public int first()
	{
		if (first == null)
		{
			throw new NoSuchElementException();
		}
		else
		{
			return first.data;
		}
	}

	public static void main (String[] args)
	{
		hw4_2 queue = new hw4_2();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);

		System.out.print("First peek: " + queue.first());

		System.out.print("\nFirst dequeue: " + queue.dequeue() + "\nSecond dequeue: " + queue.dequeue() + "\nThird dequeue: " + queue.dequeue());
	}
}