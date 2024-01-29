package ru.geekbrains.oop.lesson7.builder;

public class Program {

    public static void main(String[] args) {

        String s = new StringBuffer()
                .append("AAAAA")
                .append("BBBB")
                .toString();


        Order oder1 = new OrderBuilder()
                .setClientName("Client #1")
                .setPrice(200.5)
                .setQnt(4)
                .setProductId(334411)
                .setSign(true)
                .build();

        Order oder2 = new OrderBuilder()
                .setClientName("Client #1")
                .setQnt(1)
                .setPrice(200)
                .setProductId(1222)
                .build();

    }

}
