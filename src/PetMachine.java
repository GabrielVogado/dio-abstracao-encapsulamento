public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;


    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("No pet to wash");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;

        pet.setClean(true);
        System.out.println("Your pet" + pet.getName() + "is clean now");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("Capacidade de Água esta no MAXIMO");
            return;
        }
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("Capacidade de Shampoo esta no MAXIMO");
            return;
        }
        shampoo += 2;
    }

    public void setPet(Pet pet) {

        if (!this.clean) {
            System.out.println("A máquina não está limpa, para adicionar um pet, limpe a máquina");
            return;
        }

        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " já está na máquina");
            return;
        }

        this.pet = pet;
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi removido da máquina");
        this.pet = null;

    }

    public void cleanMachine() {
        this.clean = true;
        System.out.println("Máquina limpa");
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("Máquina lavada");
    }
}
