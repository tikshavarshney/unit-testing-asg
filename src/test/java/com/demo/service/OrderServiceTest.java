package com.demo.service;

public class OrderServiceTest
{
    Order o1 = new Order(4, "Burger", 100);

    OrderService orderService = new OrderService();

    @Test
    public void testPlaceOrder_ReturnVoid_TypeTrue()
    {
        orderService.placeOrder(o1);
        if(orderService.isCustomerNotified())
        {
            assertTrue("Customer Set Notified and Order Placed", orderService.placeOrder(o, "Order 1 Object"));
        }
    }

    @Test
    public void testPlaceOrder_ReturnTrue()
    {
        if(o.setCustomerNotified(true))
        {
            assertTrue("Customer Set Notified and Order Placed", orderService.placeOrder(o, "Order 2 Object"));
        }
    }

    @Test
    public void testPlaceOrder_ReturnFalse()
    {
        if(o.setCustomerNotified(false))
        {
            assertFalse("Customer Not Set Notified but Order Placed", orderService.placeOrder(o, "Order 3 Object"));
        }
    }

}