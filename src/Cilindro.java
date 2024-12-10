public class Cilindro {
    public static double calcularVolume(double raio, double altura){
        double volume = 0.0;
        volume = Math.PI * raio * raio * altura;
        return volume;
    }
}
