package uia.com.compras;

import java.io.IOException;

public class MainProy {

    public static void main(String[] args) throws IOException {

        System.out.println("Hola Usuario de Compras");

        GestorCompras miGestor = new GestorCompras();
        Proveedor miProveedor = new Proveedor();

        miGestor.print();
        miProveedor.print();
    }
}
