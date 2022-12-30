package classwork18;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class MyLinkedList implements List {
	
	private MyNode firstNode; 
	private int currentIndex = 0;
	
	
	@Override
	public boolean add(Object e) {
		if(isEmpty()) {
			firstNode = new MyNode(e);
		} else {
			MyNode tempNode = firstNode;
			while(tempNode.getNextObject() != null) {
				tempNode = tempNode.getNextObject();
			}
			MyNode nextNode = new MyNode(e);
			tempNode.setNextObject(nextNode);
		}
		currentIndex++;
		return true;
	}
	
	@Override
	public int size() {
		return currentIndex;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(MyLinkedList.class.getSimpleName() + " [ ");
		MyNode tempNode = firstNode;
		while(tempNode.getNextObject() != null) {
			sb.append(tempNode.getValue());
			sb.append(",");
			tempNode = tempNode.getNextObject();
			
		}
		sb.append(tempNode.getValue());
		sb.append(",");
		sb.deleteCharAt(sb.length()-1);
		sb.append(" ]");
		return sb.toString();
	}

	@Override
	public boolean isEmpty() {
		return firstNode == null ? true : false;
	}

	@Override
	public Object get(int index) {
		MyNode tempNode = firstNode;
		for (int i = 0; i < Objects.checkIndex(index, size()); i++) {
			tempNode = tempNode.getNextObject();
		}
		return tempNode.getValue();
	}
	
	@Override
	public void add(int index, Object element) {
		MyNode tempNode = firstNode;
		if(index > 0) {
			for (int i = 0; i < Objects.checkIndex(index - 1, size()); i++) {
				tempNode = tempNode.getNextObject();
			}
			MyNode nextNode = new MyNode(element);
			nextNode.setNextObject(tempNode.getNextObject());
			tempNode.setNextObject(nextNode);
		} else {
			MyNode nextNode = new MyNode(element);
			nextNode.setNextObject(tempNode);
			firstNode = nextNode;
		}
		
	}
	
	
	

}
