package Ex12_PetBathSystemController;

public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeAShower() {
        if (pet == null) {
            System.out.println("Waiting for pet.");
            return;
        }
        if (water < 10 || shampoo < 2) {
            System.out.println("Not enough water or shampoo.");
            return;
        }

        water -= 10;
        shampoo -= 2;
        pet.setClean(true);
        clean = false;

        System.out.println("The pet " + pet.getName() + " is clean.");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("The machine is full of water.");
            return;
        }
        water = 30;
        System.out.println("Water tank filled.");
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("The machine is full of shampoo.");
            return;
        }
        shampoo = 10;
        System.out.println("Shampoo tank filled.");
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!clean) {
            System.out.println("The machine is dirty. Clean it first.");
            return;
        }
        if (hasPet()) {
            System.out.println("There is already a pet in the machine.");
            return;
        }
        this.pet = pet;
        System.out.println("Pet placed in the machine.");
    }

    public void removePet() {
        if (pet == null) {
            System.out.println("There is no pet in the machine.");
            return;
        }
        System.out.println("The pet " + pet.getName() + " was removed.");
        clean = pet.isClean();
        pet = null;
    }

    public void washMachine() {
        if (water < 3 || shampoo < 1) {
            System.out.println("Not enough resources to clean the machine.");
            return;
        }
        water -= 3;
        shampoo -= 1;
        clean = true;
        System.out.println("The machine is clean.");
    }

}