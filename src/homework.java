class Animal {
    String name;
    void setName(String name){
        this.name = name;
    }
}
class Tiger extends Animal {

}
class Lion extends Animal {

}

class ZooKeeper {
    void feed(Tiger tiger){
        System.out.println("feed apple!");
    }
    void feed(Lion lion){
        System.out.println("feed ");
    }
}
public class homework {
    public static void main(String[] args){
        System.out.println("Hello Layla-focalors");
    }
}