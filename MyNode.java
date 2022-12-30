package classwork18;

public class MyNode {
	private MyNode nextObject; // link
	private Object value; // object
	
	public MyNode getNextObject() {
		return nextObject;
	}
	public void setNextObject(MyNode nextObject) {
		this.nextObject = nextObject;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "MyNode [nextObject=" + nextObject + ", value=" + value + "]";
	}
	public MyNode(MyNode nextObject, Object value) {
		super();
		this.nextObject = nextObject;
		this.value = value;
	}
	public MyNode(Object value) {
		this.value = value;
	}
	
	
}
