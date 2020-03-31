public class TriangleClassifier {
    public String classifier(Triangle triangle) {
        if (isTriangle(triangle)) {
            if (isEquilateralTriangle(triangle)) {
                return "This is Equilateral Triangle";
            } else if (isIsoscelesTriangle(triangle)) {
                return "This is Isosceles Triangle";
            } else if (isRightTriangle(triangle)) {
                return "This is Right Triangle";
            } else {
                return "This is Triangle";
            }
        } else return "This is not Triangle";
    }

    private boolean isRightTriangle(Triangle triangle) {
        return Math.pow(triangle.getSide1(), 2) + Math.pow(triangle.getSide2(), 2) == Math.pow(triangle.getSide3(), 2) || Math.pow(triangle.getSide1(), 2) + Math.pow(triangle.getSide3(), 2) == Math.pow(triangle.getSide2(), 2) || Math.pow(triangle.getSide2(), 2) + Math.pow(triangle.getSide3(), 2) == Math.pow(triangle.getSide1(), 2);
    }

    private boolean isTriangle(Triangle triangle) {
        return triangle.getSide1() + triangle.getSide2() > triangle.getSide3() && triangle.getSide1() + triangle.getSide3() > triangle.getSide2() && triangle.getSide2() + triangle.getSide3() > triangle.getSide1();
    }

    private boolean isIsoscelesTriangle(Triangle triangle) {
        return triangle.getSide1() == triangle.getSide2() || triangle.getSide1() == triangle.getSide3() || triangle.getSide2() == triangle.getSide3();
    }

    private boolean isEquilateralTriangle(Triangle triangle) {
        return triangle.getSide1() == triangle.getSide2() && triangle.getSide2() == triangle.getSide3();
    }
}
