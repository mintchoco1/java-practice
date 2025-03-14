package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("Parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }
    private static void call(Parent parent) {
        parent.parentMethod();
        //만약에 넘어온 parent가 인스턴스가 Child로부터 넘어온거면
        if(parent instanceof Child){
            System.out.println("Child 인스턴스 맞음");
            //다운 캐스팅 (부모 타입 -> 자식 타입)
            Child child = (Child) parent;
            child.childMethod();
        }else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
