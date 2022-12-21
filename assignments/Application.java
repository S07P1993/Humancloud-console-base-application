package assignments;


public class Application {
	
	public static final Stack stack = new Stack();
	public static final Queue queue = new Queue(0);
	public static final Array array = new Array();
	public static final Linked linked = new Linked();
	
	public static void main(String args[]) {

		Menu mainMenu = new Menu("Data Structures");
		Menu StackMenu = new Menu(1, "Stack");
		Menu QueueMenu = new Menu(2, "Queue");
		Menu ArrayMenu = new Menu(3, "Array");
		Menu LinkedMenu = new Menu(4, "Linked");

		mainMenu.addMenuItem(mainMenu);
		mainMenu.addMenuItem(StackMenu);
		mainMenu.addMenuItem(QueueMenu);
	 	mainMenu.addMenuItem(ArrayMenu);
		mainMenu.addMenuItem(LinkedMenu);

		StackMenu.addMenuItem(new MenuItem(1, "push"));
		StackMenu.addMenuItem(new MenuItem(2, "pop"));
		StackMenu.addMenuItem(new MenuItem(3, "peek"));
		StackMenu.addMenuItem(new MenuItem(4, "show"));

		QueueMenu.addMenuItem(new MenuItem(1, "add"));
		QueueMenu.addMenuItem(new MenuItem(2, "remove"));
		QueueMenu.addMenuItem(new MenuItem(3, "queueDisplay"));

		ArrayMenu.addMenuItem(new MenuItem(1, "add"));
		ArrayMenu.addMenuItem(new MenuItem(2, "resize"));
		ArrayMenu.addMenuItem(new MenuItem(3, "display()"));

		LinkedMenu.addMenuItem(new MenuItem(1, "Insert at Beginning"));
		LinkedMenu.addMenuItem(new MenuItem(2, "Insert at the end"));
		LinkedMenu.addMenuItem(new MenuItem(3, "delete Node"));
		LinkedMenu.addMenuItem(new MenuItem(4, "search"));
		
		
		mainMenu.display();

}
}