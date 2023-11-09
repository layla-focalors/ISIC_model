interface AnimalI {
    public abstract String getFeedString();
}
class Animal {
    String name;
    String feed_name;
    Animal(String name, String feed_name){
        this.name = name;
        this.feed_name = feed_name;
    }
    void setName(String name){
        this.name = name;
    }
}
class Tiger extends Animal implements AnimalI{
    Tiger(String name, String feed_name){
        super(name, feed_name);
    }
    public String getFeedString(){
        return this.feed_name;
    }
}
class Lion extends Animal implements AnimalI{
    Lion(String name, String feed_name){
        super(name, feed_name);
    }
    public String getFeedString(){
        return this.feed_name;
    }
}

class ZooKeeper {
    void feed(AnimalI ai){
        System.out.println("feed "+ai.getFeedString()+"!!!");
    }
//    문제점 : 악어, 사슴, 토끼, 곰, 다람쥐, 말 등의 동물들이 늘어나면 그때마다
//    feed 메서드로 추가되는 동물에 맞게 오버로딩 시켜야 함
}
public class homework {
    public static void main(String[] args){
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger("드렁큰호랭이", "사슴 고기");
        Lion lion = new Lion("겁쟁이사자", "물고기");

        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }
}