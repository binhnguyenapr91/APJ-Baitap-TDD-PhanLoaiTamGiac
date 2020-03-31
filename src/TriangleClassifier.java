import static java.lang.Math.*;
import static java.lang.Math.pow;

public class TriangleClassifier {
    public String classifier(Triangle triangle) {
        if (triangle.getSide1() + triangle.getSide2() > triangle.getSide3() && triangle.getSide1() + triangle.getSide3() > triangle.getSide2() && triangle.getSide2() + triangle.getSide3() > triangle.getSide1()) {
            if (triangle.getSide1() == triangle.getSide2() && triangle.getSide2() == triangle.getSide3()) {
                return "This is Equilateral Triangle";
            } else if (triangle.getSide1() == triangle.getSide2() || triangle.getSide1() == triangle.getSide3() || triangle.getSide2() == triangle.getSide3()) {
                return "This is Isosceles Triangle";
            } else if (Math.pow(triangle.getSide1(), 2) + Math.pow(triangle.getSide2(), 2) == Math.pow(triangle.getSide3(), 2) || Math.pow(triangle.getSide1(), 2) + Math.pow(triangle.getSide3(), 2) == Math.pow(triangle.getSide2(), 2) || Math.pow(triangle.getSide2(), 2) + Math.pow(triangle.getSide3(), 2) == Math.pow(triangle.getSide1(), 2)) {
                return "This is Right Triangle";
            } else {
                return "This is Triangle";
            }
        } else return "This is not Triangle";
    }
}
