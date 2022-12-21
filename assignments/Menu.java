package assignments;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Menu extends MenuItem {

	private static final int QueueOperation = 0;
	private List<MenuItem> items = new ArrayList<>();
	private static boolean isLevelOne = true;

	// TODO: create objects of Stack, Queue, Array

	public Menu(int order, String name) {
		super(order, name);
		addMenuItem(new MenuItem(0, "Back"));
	}

	public Menu(String title) {
		super(0, title);	
	}

	public void addMenuItem(MenuItem mi) {
		mi.setParent(this);
		items.add(mi);
	}

	public List<MenuItem> getMenuItems() {
		return items;
	}

	public void display() {
		if (isLevelOne) {
			isLevelOne = false;
			items.forEach(item -> item.display());
			isLevelOne = true;
			System.out.println("Enter your choice:");
			int choice = new Scanner(System.in).nextInt();

			if (choice == 0) {
				back();
			} else {
				MenuItem mi = getMenuItems().stream().filter(menuItem -> menuItem.getOrder() == choice).findFirst()
						.orElse(null);
				if (mi == null) {
					System.err.println("Invalid choice");
					display();
				} else if (mi instanceof Menu) {
					mi.display();
				} else {
					String operationName = mi.getName();
					String dataStructureName = mi.getParent().getName();

					switch (dataStructureName) {
						case "Stack":
							callStackOperation(operationName);
	
						case "Queue":
							callQueueOperation(operationName);
							
						case "Array":
							callArrayOperation(operationName);
							
						case "Linked":
							callLinkedOperation(operationName);
					}
					mi.display();
				}

			}
		} else {
			super.display();
		}
	}

	private void callStackOperation(String Stackoperation) {
		switch (Stackoperation) {
		case "push":
			System.out.println("Enter data:");
			int data = new Scanner(System.in).nextInt();
			Application.stack.push(data);
			display();
			break;
			
		case "pop":
			System.out.println("pop element:");
			int data2 = new Scanner(System.in).nextInt();
			Application.stack.pop();
			display();
			break;
			
		case "peek":
			System.out.println("peek element:");
			int data3 = new Scanner(System.in).nextInt();
			Application.stack.peek();
			display();
			break;
			
		case "show":
			System.out.println("show element:");
			int data4 = new Scanner(System.in).nextInt();
			Stack.show();
			display();
			break;
		}
	}
	private void callQueueOperation(String Queueoperation) {
		switch (Queueoperation) {
		case "push":
			System.out.println("Enter data:");
			int data1 = new Scanner(System.in).nextInt();
			Application.queue.push(data1);
			display();
			break;
			
		case "remove":
			System.out.println("Enter data:");
			int qdata2 = new Scanner(System.in).nextInt();
			Application.queue.remove();
			display();
			break;
			
		case "queueDisplay":
			System.out.println("Enter data:");
			int qdata3 = new Scanner(System.in).nextInt();
			Application.queue.queueDisplay();
			display();
			break;

	        }
		}
	private void callArrayOperation(String Arrayoperation) {
		switch (Arrayoperation) {
		case "add":
			System.out.println("Enter data:");
			int data1 = new Scanner(System.in).nextInt();
			Application.array.add(data1);
			display();
			break;
			
		case "resize":
			System.out.println("Enter data:");
			int data2 = new Scanner(System.in).nextInt();
			Application.array.resize(data2);
			display();
			break;
			
		case " display":
			System.out.println("Enter data:");
			int data = new Scanner(System.in).nextInt();
			Application.array.display();
			display();
			break;
		}
	}
	private void callLinkedOperation(String Linkedoperation) {
		switch (Linkedoperation) {
		case "Insert at Beginning":
			System.out.println("Enter data:");
			int data1 = new Scanner(System.in).nextInt();
		    Application.linked.insertAtBeginning(data1);
			display();
			break;
			
		case "insertAtEnd":
			System.out.println("Enter data:");
			int data2 = new Scanner(System.in).nextInt();
		    Application.linked.insertAtEnd(data2);
			display();
			break;
			
		case "deleteNode":
			System.out.println("Enter data:");
			int data3 = new Scanner(System.in).nextInt();
			Application.linked.deleteNode(data3);
		    display();
			break;
			
		case "search":
			System.out.println("Enter data:");
			int data4 = new Scanner(System.in).nextInt();
			Application.linked.search(null, data4);
		    display();
			break;
		}
			}
	
	public void back() {
		if (getParent() != null) {
			getParent().display();

		} else {
			System.exit(0);
		}
		System.out.println();
	}
	}
	