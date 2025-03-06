import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        var option = -1;


        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer água");
            System.out.println("3 - Abastecer shampoo");
            System.out.println("4 - Verificar Água da maquina");
            System.out.println("5 - Verificar Shampoo da maquina");
            System.out.println("6 - Verifica se tem pet na maquina");
            System.out.println("7 - Colocar Pet na maquina");
            System.out.println("8 - Retirar Pet da maquina");
            System.out.println("9 - Limpar maquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> System.out.println(petMachine.hasPet() ? "Tem pet na máquina" : "Não tem pet na máquina");
                case 7 -> setPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }

        } while (option != 0);
    }


    private static void setWater() {
        System.out.println("Coloque a quantidade de agua que deseja abastecer");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Coloque a quantidade de Shampoo que deseja abastecer");
        petMachine.addShampoo();
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A Maquina esta com " + amount + "Litros de Shampoo");
    }

    private static void verifyWater() {
        var amount = petMachine.getShampoo();
        System.out.println("A Maquina esta com " + amount + "Litros de Water");
    }

    public static void setPetInMachine() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Digite o nome do pet");
            name = scanner.nextLine();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("Pet " + pet.getName() + " adicionado na máquina");
    }
}