package HRPSapplication;

import java.util.Scanner;

public class RoomService {
	private String name;
	private int price;
	
	public RoomService() {}
	
	public RoomService(String _name, int _price) {
		name = _name;
		price = _price;
	}
	
	public void updateService() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Select the attribute to update: ");
		System.out.println("1: Room service name");
		System.out.println("2: Room service price");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the new room service name: ");
			String newName = sc.nextLine();
			this.setName(newName);
			System.out.println("Service name updated!");
			break;
		case 2:
			System.out.println("Enter the new room service price: ");
			int newPrice = sc.nextInt();
			this.setPrice(newPrice);
			System.out.println("Service price updated!");
			break;
		default:
			System.out.println("Invalid option!");
			break;
		}
		sc.close();
	}
	
	public String getName() {return name;}
	
	public int getPrice() {return price;}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setPrice(int newPrice) {
		price = newPrice;
	}
}