public class Owner {
    protected final String name;
    protected Animal animal;
    
    public Owner(){
        this("", null);
    }
    public Owner(String name){
        this.name = name;
        this.animal = null;
    }
    public Owner(Animal animal){
        this.name = "";
        this.animal = animal;
    }
    public Owner(String name, Animal animal){
        this.name = name;
        this.animal = animal;
    }
    public String getName(){
        return this.getName();
    }
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    public Animal getAnimal(){
        return this.getAnimal();
    }
    public void feedfood(Food F){
        animal.setPower(animal.getPower() + F.getPower());
    }
    public String toString(){
         return "Owner : name = "+this.name+", Animal : name = "+animal.getName()+", power = "+animal.getPower()+", age = "+animal.getAge();
    
    }
    public void protectOwnerFrom(Animal a){
        if (animal instanceof Dog) {
            ((Dog) animal).kick(a);
        }
        else {
            ((Pigeous) animal).wingAttack(a);
        }
    }
}
