package com.twu.refactoring;

public class Item {
	private String description;
	private double price;
	private int quantity;

	public Item(String description, double price, int quantity) {
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

    double totalAmount() {
        return price * quantity;
    }

    public String toDisplay() {
        StringBuilder output = new StringBuilder();
        output.append(description);
        output.append('\t');
        output.append(price);
        output.append('\t');
        output.append(quantity);
        output.append('\t');
        output.append(totalAmount());
        output.append('\n');
        return output.toString();
    }
}