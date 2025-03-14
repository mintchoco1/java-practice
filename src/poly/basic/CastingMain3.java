package poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {

        Child child = new Child();
        //다른 타입에 들어갈 때는 무조건 캐스팅을 해줘야함
        Parent parent1 = (Parent) child; //업 캐스팅은 생략 가능
        Parent parent2 = child;//업 캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
