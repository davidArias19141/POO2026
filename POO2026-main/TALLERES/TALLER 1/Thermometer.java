public class Thermometer {
    private double Temperature = 0.0;
    
    public double getTemperature(){
        return Temperature;
    }
    public boolean setTemperature(double NewTemperature){
        if(NewTemperature >= -50 && NewTemperature <= 100){
            Temperature = NewTemperature;
            return true;
        } else {
            return false;
        }
    }

}