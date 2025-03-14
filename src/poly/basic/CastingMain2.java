package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 탐조
        Parent poly  = new Child();
        //자식의 기능은 호출할 수 없다
        //poly.childMethod();
        
        //다운 캐스팅(부모 타입 -> 자식 타입)
        //poly를 강제로 Child 로 바꿔서 대입
        /*
        Child child = (Child)poly;//x001 이라는 참조 값이 들어있을 거고 그걸 child에 넣는다
        child.childMethod();
         */

        //일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운 캐스팅
        //연산자 우선 순위가 poly.childMethod()
        //이렇게 하면 번거롭지 않음
        ((Child) poly).childMethod();
    }
}
