package muhammad.arif.martadinata.data;

public class VicePresident extends Manager{

    public VicePresident(String name) {
        super(name,null);
    }
    public void sayHello(String name) {
        System.out.println("Hello " + name + " my name is VP " + this.name);
    }
}




