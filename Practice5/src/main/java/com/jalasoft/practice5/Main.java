package com.jalasoft.practice5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Pedido> pedidos = new ArrayList<>();

        pedidos.add(new Pedido("ped1", TipoPedido.NORMAL, "Juan Pérez", "2020-05-05"));
        pedidos.add(new Pedido("ped2", TipoPedido.PROGRAMADO, "María Guamán", "2020-05-03"));
        pedidos.add(new Pedido("ped3", TipoPedido.NORMAL, "Juan Pérez", "2020-05-10"));

        List<Detalle> detalles = new ArrayList<>();

        detalles.add(new Detalle("cod1", "cocina", 2, 1000, 10, 1990, "ped1"));
        detalles.add(new Detalle("cod2", "lavadora", 1, 2500, 0, 2500, "ped1"));
        detalles.add(new Detalle("cod3", "plancha", 5, 300, 50, 1450, "ped1"));
        detalles.add(new Detalle("cod4", "mesa", 2, 700, 30, 1370, "ped2"));
        detalles.add(new Detalle("cod5", "muebles", 1, 3500, 0, 3500, "ped2"));
        detalles.add(new Detalle("cod6", "cómoda", 3, 800, 100, 2300, "ped2"));
        detalles.add(new Detalle("cod7", "camisa", 10, 100, 100, 900, "ped3"));
        detalles.add(new Detalle("cod8", "polera", 20, 80, 0, 1600, "ped3"));
        detalles.add(new Detalle("cod9", "zapatos", 8, 400, 200, 3000, "ped3"));

        System.out.println("----Select cliente from Pedido----");
        pedidos.stream().map(Pedido::getCliente).forEach(System.out::println);

        System.out.println("----Select cliente from Pedido where tipoPedido = \"normal\"----");
        pedidos.stream()
                .filter(pedido -> pedido.getTipoPedido() == TipoPedido.NORMAL)
                .map(Pedido::getCliente)
                .forEach(System.out::println);

        System.out.println("----Select codPedido from Pedido where fecha = \"2020-05-05\"----");
        pedidos.stream()
                .filter(pedido -> pedido.getFecha().equals("2020-05-05"))
                .map(Pedido::getCodPedido)
                .forEach(System.out::println);

        System.out.println("----Select producto from Detalle,Pedido where Pedido.codPedido = Detalle.codPedido and Pedido.codPedido = \"ped1\"----");
        Stream<Pedido> pedido1 = pedidos.stream().filter(pedido -> pedido.getCodPedido().equals("ped1"));
        detalles.stream().filter(detalle -> detalle.getCodPedido() == pedido1.map(Pedido::getCodPedido));


    }
}
