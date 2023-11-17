package com.devthalisson.desafio1;

import com.devthalisson.desafio1.entities.Order;
import com.devthalisson.desafio1.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Scanner;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {
    Scanner scan = new Scanner(System.in);

    private OrderService orderService;

    public Desafio1Application(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Desafio1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.print("Digite o codigo: ");
        Integer code = scan.nextInt();

        System.out.print("Digite o valor básico do pedido: ");
        double basic = scan.nextDouble();

        System.out.print("Digite o valor do desconto: ");
        double discount = scan.nextDouble();

        Order order = new Order(code, basic, discount);

        System.out.println("Pedido código: " + code);
        System.out.printf("Valor total: %.2f%n", orderService.total(order));
    }
}
