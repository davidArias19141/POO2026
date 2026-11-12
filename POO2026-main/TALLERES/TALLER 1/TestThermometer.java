public class TestThermometer {
    
    public static void main(String[] args) {

    Thermometer Temperature = new Thermometer();

        if(Temperature.setTemperature(-100)){
            System.out.println("This temperature is into the correct range");
        } else{ 
            System.out.println("This temperature is out of the correct range");
        }
        if(Temperature.setTemperature(50)){
            System.out.println("This temperature is into the correct range");
        } else{ 
            System.out.println("This temperature is out of the correct range");
        }
        if(Temperature.setTemperature(200)){
            System.out.println("This temperature is into the correct range");
        } else{ 
            System.out.println("This temperature is out of the correct range");
        }
    }
}