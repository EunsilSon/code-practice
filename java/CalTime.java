public class CalTime {
    public static void main(String[] args) {
        double distance = 40e12;     // 별과 지구의 거리
        double light_speed = 300000;    // 빛의 속도

        double time = distance / light_speed;
        double light_year = time / (60 * 60 * 24 * 365);    // 1년에 진행하는 거리

        System.out.println("걸리는 시간은 " + light_year + " 광년입니다.");
    }
}