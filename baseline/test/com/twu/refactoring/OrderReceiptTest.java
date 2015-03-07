package com.twu.refactoring;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class OrderReceiptTest {
    @Test
    public void shouldPrintCustomerInformationOnOrder() {
        Order order = new Order("Mr X", "Chicago, 60601", .10);
        order.add(new ArrayList<Item>());

        String output = order.printReceipt();

        assertThat(output, containsString("Mr X"));
        assertThat(output, containsString("Chicago, 60601"));
    }

    @Test
    public void shouldPrintLineItemAndSalesTaxInformation() {
        ArrayList<Item> lineItems = new ArrayList<Item>() {{
            add(new Item("milk", 10.0, 2));
            add(new Item("biscuits", 5.0, 5));
            add(new Item("chocolate", 20.0, 1));
        }};
        Order order = new Order(null, null, .10);
        order.add(lineItems);

        String output = order.printReceipt();

        assertThat(output, containsString("milk\t10.0\t2\t20.0\n"));
        assertThat(output, containsString("biscuits\t5.0\t5\t25.0\n"));
        assertThat(output, containsString("chocolate\t20.0\t1\t20.0\n"));
        assertThat(output, containsString("Sales Tax\t6.5"));
        assertThat(output, containsString("Total Amount\t71.5"));
    }

}
