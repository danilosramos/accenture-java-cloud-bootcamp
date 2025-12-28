package Ex12_PetBathSystemController;

public class PetMachine {

    private boolean clean;

    private int water;

    private int shampoo;

    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Waiting for pet");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("The pet " + pet.getName() + " is clear");

    }

    public void addWater() {
        if (water == 30) {
            System.out.println("The machine is full of water");
            return;
        }
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("The machine is full of shampoo");
            return;
        }
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("The machine is dirty, needs to be cleaned before bringing the pet in.");
            return;
        }

        if (hasPet()){
            System.out.println("The pet " + this.pet.getName() + " is in the machine in this moment.");
            return;
        }

        this.pet = pet;
    }

    public viod removePet(){
        this.clean = this.pet.isClean();
        System.out.println("The pet" + this.pet.getName() + "is clean.");
        this.pet = null;

    }

    public void washMachine(){
        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;
        System.out.println("The machine is clean.");
    }
}