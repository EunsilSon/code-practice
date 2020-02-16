public class Operators_Q4 {
    public static void main(String[] args) {
        /*
        가로, 세로, 높이를 입력받아 직육면체의 밑면의 넓이, 부피, 겉넓이를 구하는 프로그램을 작성하라.
         */
        int height = 10;
        int width = 2;
        int length = 3;

        int area = (width * length);
        int side = ((width * height * 2) + (length * height * 2));

        System.out.println("직육면체의 밑면의 넓이: " + area);
        System.out.println("직육면체의 부피: " + (area * height));
        System.out.println("직육면체의 겉넓이: " + (area * 2 + side));

    }
}

