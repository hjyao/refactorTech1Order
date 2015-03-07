package com.twu.refactoring;

import java.util.List;

public class Order {
    private final double duty;
    String name;
    String address;
    List<Item> items;

    public Order(String name, String address, double duty) {
        this.name = name;
        this.address = address;
        this.duty = duty;
    }

    public void add(List<Item> items) {
        this.items = items;
    }

    public String printReceipt() {
        StringBuilder output = new StringBuilder();
        output.append("======Printing Orders======\n");
        output.append(name);
        output.append(address);

        double totalPriceWithoutTax = 0d;
        for (Item item : items) {
            output.append(item.toDisplay());
            totalPriceWithoutTax += item.totalAmount();
        }

        double totalDuty = totalPriceWithoutTax * duty;
        output.append("Sales Tax").append('\t').append(totalDuty);
        output.append("Total Amount").append('\t').append(totalPriceWithoutTax + totalDuty);
        return output.toString();
    }

}
