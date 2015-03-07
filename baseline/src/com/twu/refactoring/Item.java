package com.twu.refactoring;

public class Item {
	private String desc;
	private double p;
	private int qty;

	public Item(String desc, double p, int qty) {
		super();
		this.desc = desc;
		this.p = p;
		this.qty = qty;
	}

	public String getDescription() {
		return desc;
	}

	public double getPrice() {
		return p;
	}

	public int getQuantity() {
		return qty;
	}

    double totalAmount() {
        return p * qty;
    }

    public String toDisplay() {
        StringBuilder output = new StringBuilder();
        output.append(getDescription());
        output.append('\t');
        output.append(getPrice());
        output.append('\t');
        output.append(getQuantity());
        output.append('\t');
        output.append(totalAmount());
        output.append('\n');
        return output.toString();
    }
}