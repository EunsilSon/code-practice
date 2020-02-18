/*
다음 main 메소드와 함께 동작하는 Accumulator 클래스를 정의하자, 그리고 Accumulator 클래스에 main 메소드도 넣어서 컴파일 및 실행을 하자.
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            Accumulator.add(i);    // 인자로 전달되는 값을 모두 누적
        Accumulator.showResult();    // 최종 누적 결과를 출력
    }

    실행 결과로, 즉 showResult 메소드를 호출 결과로 다음과 같은 수준의 출력을 보이면 된다.
    sum = 45
 */

class Accumulator {
    static int result = 0;    // 해당 클래스에 속해있는 모든 인스턴스가 공유하는 클래스 변수

    public int add(int n) {    // 인자로 전달되는 값을 모두 누적
        return result += n;
    }

    void showResult() {    // 최종 누적 결과를 출력
        System.out.println("sum = " + result);
    }
}

class Accumulator_2 {
    public static void main(String[] args) {
        Accumulator accumulator = new Accumulator();    // 인스턴스 생성

        for (int i = 0; i < 10; i++)
            accumulator.add(i);    // 메소드 호출 + 인자 전달
        accumulator.showResult();    // 메소드 호출
    }
}
