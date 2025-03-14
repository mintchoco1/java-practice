package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();
        
        //자식 변수가 자식 인스턴스를 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();//child는 상속 받았으니 사용 가능
        child.childMethod();//자기 자신거라 가능

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        //부모 타입은 자식을 탐조할 수 있다
        System.out.println("Child -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        
        //Child child2 = new Parent();  자식은 부모를 담을 수 없다

        //자식의 기능은 호출할 수 없다
        //poly.childMethod();
        
    }
}
