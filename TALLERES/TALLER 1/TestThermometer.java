public class 
TestThermometer {

    public static void main (String[] args){
        Thermometer thermometer = new Thermometer();
            System.out.println("--- Pruebas del termómetro digital ---");
            
            System.out.println("Temperatura Inicial: " + thermometer.Get_Current_Temperature() + "°C");
            System.out.println("");
        }
    }