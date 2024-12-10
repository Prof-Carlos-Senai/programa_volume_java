public class Cone {
    public static double calcularVolume(double raio, double altura){
        double volume = 0.0;
        volume = (Math.PI * raio * raio * altura) / 3.0;
        return volume;
    }
}
