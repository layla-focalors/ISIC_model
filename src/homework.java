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
        System.out.println("feed banana!");
    }
//    문제점 : 악어, 사슴, 토끼, 곰, 다람쥐, 말 등의 동물들이 늘어나면 그때마다
//    feed 메서드로 추가되는 동물에 맞게 오버로딩 시켜야 함
}
public class homework {
    public static void main(String[] args){
        System.out.println("Hello Layla-focalors");
    }
}