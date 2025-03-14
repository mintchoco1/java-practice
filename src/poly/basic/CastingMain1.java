package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 탐조
        Parent poly = new Child();
        //자식의 기능은 호출할 수 없다
        //poly는 Parent 타입의 참조 변수
        //이 참조 변수는 Child 인스턴스를 참조하는 중
        //하지만 변수의 타입이 Parent 이므로 poly를 통해 접근할 수 있는 멤버는 Parent 클래스로 제한됨
        //poly.childMethod();
        
        //다운 캐스팅(부모 타입 -> 자식 타입)
        //poly를 강제로 Child 로 바꿔서 대입
        Child child = (Child)poly;//x001 이라는 참조 값이 들어있을 거고 그걸 child에 넣는다
        child.childMethod();
    }
}
