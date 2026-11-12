public class TestProduct {
    public static void main(String[] args) {
        Product product1 = new Product();
        // case1
        if (product1.setName("Valeria") == true) {
            System.out.println("nombre aceptado con exito");
        } else {
            System.out.println("nombre no aceptado");
        }
        // price
        if (product1.setPrice(20) == true) {
            System.out.println("precio valido");
        } else {
            System.out.println("precio invalido");
        }
        // stock
        if (product1.setStock(20) == true) {
            System.out.println("stock agragdo con exito");
        } else {
            System.out.println("stock no agragado, fuera de limites");
        }
        // case 2
        if (product1.setName("") == true) {
            System.out.println("nombre aceptado con exito");
        } else {
            System.out.println("nombre no aceptado");
        }
        // price
        if (product1.setPrice(20) == true) {
            System.out.println("precio valido");
        } else {
            System.out.println("precio invalido");
        }
        // stock
        if (product1.setStock(20) == true) {
            System.out.println("stock agragdo con exito");
        } else {
            System.out.println("stock no agragado, fuera de limites");
        }
        // case3
        if (product1.setName("Valeria") == true) {
            System.out.println("nombre aceptado con exito");
        } else {
            System.out.println("nombre no aceptado");
        }
        // price
        if (product1.setPrice(-60000) == true) {
            System.out.println("precio valido");
        } else {
            System.out.println("precio invalido");
        }
        // stock
        if (product1.setStock(20) == true) {
            System.out.println("stock agragdo con exito");
        } else {
            System.out.println("stock no agragado, fuera de limites");
        }
        // case4
        if (product1.setName("Valeria") == true) {
            System.out.println("nombre aceptado con exito");
        } else {
            System.out.println("nombre no aceptado");
        }
        // price
        if (product1.setPrice(20) == true) {
            System.out.println("precio valido");
        } else {
            System.out.println("precio invalido");
        }
        // stock
        if (product1.setStock(-60) == true) {
            System.out.println("stock agragdo con exito");
        } else {
            System.out.println("stock no agragado, fuera de limites");
        }
        // case5
        if (product1.setName("") == true) {
            System.out.println("nombre aceptado con exito");
        } else {
            System.out.println("nombre no aceptado");
        }
        // price
        if (product1.setPrice(-20) == true) {
            System.out.println("precio valido");
        } else {
            System.out.println("precio invalido");
        }
        // stock
        if (product1.setStock(-70) == true) {
            System.out.println("stock agragdo con exito");
        } else {
            System.out.println("stock no agragado, fuera de limites");
        }

    }
}
