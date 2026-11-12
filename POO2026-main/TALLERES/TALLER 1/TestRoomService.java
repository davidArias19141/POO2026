public class TestRoomService {
    public static void main(String[] args) {
        RoomService reservation1 = new RoomService();
        // proof1
        if (reservation1.setGuest("Esteban") == true) {
            System.out.println("nombre Inquilino registrado con exito");
        } else {
            System.out.println("nombre Inquilino no registrado");
        }
        // numero de habitacion
        reservation1.getRoomNumber();
        // numero de noches
        if (reservation1.setNumberOfNights(2) == true) {
            System.out.println("numero de noches aceptadas");
        } else {
            System.out.println("numero de noches no aceptada");
        }
        // precio por persona
        if (reservation1.setPricePerNight(50000) == true) {
            System.out.println("precio valido");
        } else {
            System.out.println("precio invalido");
        }
        // proof 2
        if (reservation1.setGuest("") == true) {
            System.out.println("nombre Inquilino registrado con exito");
        } else {
            System.out.println("nombre Inquilino no registrado");
        }
        // numero de habitacion
        reservation1.getRoomNumber();
        // numero de noches
        if (reservation1.setNumberOfNights(2) == true) {
            System.out.println("numero de noches aceptadas");
        } else {
            System.out.println("numero de noches no aceptada");
        }
        // precio por persona
        if (reservation1.setPricePerNight(50000) == true) {
            System.out.println("precio valido");
        } else {
            System.out.println("precio invalido");
        }
        // proof3
        if (reservation1.setGuest("Esteban") == true) {
            System.out.println("nombre Inquilino registrado con exito");
        } else {
            System.out.println("nombre Inquilino no registrado");
        }
        // numero de habitacion
        reservation1.getRoomNumber();
        // numero de noches
        if (reservation1.setNumberOfNights(-2) == true) {
            System.out.println("numero de noches aceptadas");
        } else {
            System.out.println("numero de noches no aceptada");
        }
        // precio por persona
        if (reservation1.setPricePerNight(50000) == true) {
            System.out.println("precio valido");
        } else {
            System.out.println("precio invalido");
        }
        // proof3
        if (reservation1.setGuest("Esteban") == true) {
            System.out.println("nombre Inquilino registrado con exito");
        } else {
            System.out.println("nombre Inquilino no registrado");
        }
        // numero de habitacion
        reservation1.getRoomNumber();
        // numero de noches
        if (reservation1.setNumberOfNights(2) == true) {
            System.out.println("numero de noches aceptadas");
        } else {
            System.out.println("numero de noches no aceptada");
        }
        // precio por persona
        if (reservation1.setPricePerNight(-50000) == true) {
            System.out.println("precio valido");
        } else {
            System.out.println("precio invalido");
        }
        // proof4
        if (reservation1.setGuest("") == true) {
            System.out.println("nombre Inquilino registrado con exito");
        } else {
            System.out.println("nombre Inquilino no registrado");
        }
        // numero de habitacion
        reservation1.getRoomNumber();
        // numero de noches
        if (reservation1.setNumberOfNights(-2) == true) {
            System.out.println("numero de noches aceptadas");
        } else {
            System.out.println("numero de noches no aceptada");
        }
        // precio por persona
        if (reservation1.setPricePerNight(-50000) == true) {
            System.out.println("precio valido");
        } else {
            System.out.println("precio invalido");
        }
    }
}
