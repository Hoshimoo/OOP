public class Pigeous extends Bird{
    public Pigeous(){
        super("", 0);
    }
    public Pigeous(String name, int age){
        super(name, age);
    }
    public void eat(Food f){
        setPower(this.getPower() + (2 * f.getPower()));
    }
    public void fly(){
        System.out.println(this.getName() + "fly fly ....");
    }
    public void wingAttack(Animal a){
        a.setPower(a.getPower() -5 );
    }
    public void wingAttack(Animal a, int times){
        for (int i=0; i < times; i++){
            a.setPower(this.getPower() + (a.getPower() - 5));
        }
    }
}
