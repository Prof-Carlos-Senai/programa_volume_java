import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = 0.0, altura = 0.0;
        double volume = 0.0;
        int opcao = 0;

        do{
            System.out.println(" ---------------------------------------------------");
            System.out.println(" Programa: Calcular volume de figura geométricas    ");
            System.out.println(" ---------------------------------------------------");
            System.out.println("    1 - Volume do Cilindro");
            System.out.println("    2 - Volume do Cone");
            System.out.println("    0 - Sair");
            System.out.println("\n\n");
            System.out.println(" Escolha sua opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(" Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.println(" Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Cilindro.calcularVolume(raio, altura);

                    System.out.printf(" O Volume do Cilindro é: %.2f \n\n\n",volume);

                    break;
                case 2:
                    System.out.println(" Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.println(" Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Cone.calcularVolume(raio, altura);

                    System.out.printf(" O Volume do Cone é: %.2f \n\n\n",volume);
                    break;
                case 0:
                    System.out.println(" Sair");
                    break;
                default:
                    System.out.println(" Opção Inválida! ");
                    break;
            }

        }while (opcao != 0);

        sc.close();
    }
}
