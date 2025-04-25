import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Engin motor = null;
        Driver driver = null;
        Car car = null;


        Scanner scan = new Scanner(System.in);
        int a=1,option=0;

        while(a != 0){
            System.out.println("1. criar novo carro");
            System.out.println("2. mudar condutor");
            System.out.println("3. modificar motor");
            System.out.println("4. modificar o carro");
            System.out.println("5. expecificações do carro");
            System.out.println("0. sair");
            a = scan.nextInt();

            if(a == 1)
            {
                System.out.println("o carro tera um condutor?");
                System.out.println("1. sim");
                System.out.println("2. nao");

                option = scan.nextInt();
                scan.nextLine();
                System.out.println("digite a marca: ");
                String marca = scan.nextLine();

                System.out.println("digite a modelo: ");
                String mod  = scan.nextLine();

                System.out.println("digite a placa: ");
                Integer placa = scan.nextInt();
                scan.nextLine();
                System.out.println("digite o tipo do motor: ");
                String tipe = scan.nextLine();

                System.out.println("digite a potencia do motor: ");
                Integer pot = scan.nextInt();
                scan.nextLine();
                motor = new Engin(tipe,pot);
                if(option == 1){
                    System.out.println("digite o nome do condutor: ");
                    String name = scan.nextLine();

                    System.out.println("digite a cnh do condutor: ");
                    Integer cnh = scan.nextInt();
                    scan.nextLine();

                    driver = new Driver(name, cnh);
                    car = new Car(marca, mod, placa, motor, driver);
                    System.out.println(car.toString());
                }
                else{
                    car = new Car(marca,mod,placa,motor);
                }
            }
            else if(a == 2)
            {
                System.out.println("nome do condutor?");
                String name = scan.nextLine();
                System.out.println("digite a cnh do condutor: ");
                Integer cnh = scan.nextInt();
                scan.nextLine();
                driver = new Driver(name, cnh);
                car.setDirigidor(driver);
            }
            else if(a == 3)
            {
                System.out.println("tipo do motor: ");
                String tipe = scan.nextLine();

                System.out.println("potencia do motor: ");
                Integer pot = scan.nextInt();
                scan.nextLine();
                motor = new Engin(tipe,pot);
                car.setMotor(motor);
            }
            else if(a == 4)
            {
                System.out.println("oque gostaria de alterar?");
                System.out.println("1. marca");
                System.out.println("2. modelo");
                System.out.println("3. placa");
                int b = scan.nextInt();
                switch (b) {
                    case 1:
                    System.out.println("digite a nova marca : ");
                    String marca = scan.nextLine();
                    car.setMarca(marca);
                        break;
                        case 2:
                        System.out.println("digite o novo modelo : ");
                    String mod = scan.nextLine();
                    car.setModelo(mod);
                        break;
                        case 3:
                    System.out.println("digite a nova placa : ");
                    Integer placa = scan.nextInt();
                    scan.nextLine();
                    car.setPlaca(placa);
                        break;
                    default:
                        break;
                }
            }
            if(a == 5){
                if(car != null){
                    System.out.println(car.toString());
                }
            }
        }
        scan.close();
    }
}
