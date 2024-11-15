package gamepackage;

import java.util.Scanner;

public class Player {
	private String name;
	
	public Player() {
	}
	
	public void promptName() {
		System.out.print("ENTER YOUR NAME: ");
		Scanner sc = new Scanner(System.in);
		setName(sc.next());
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}