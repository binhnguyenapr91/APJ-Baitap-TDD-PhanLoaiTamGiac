import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("Test Equilateral Triangle")
    void classifierEquilateralTriangle() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 2;
        Triangle triangle = new Triangle(side1,side2,side3);
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifier(triangle);
        String expected = "This is Equilateral Triangle";
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test Isosceles Triangle")
    void classifierIsoscelesTriangle() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 3;
        Triangle triangle = new Triangle(side1,side2,side3);
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifier(triangle);
        String expected = "This is Isosceles Triangle";
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test Right Triangle")
    void classifierRightTriangle() {
        double side1 = 5;
        double side2 = 12;
        double side3 = 13;
        Triangle triangle = new Triangle(side1,side2,side3);
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifier(triangle);
        String expected = "This is Right Triangle";
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test Is Triangle")
    void classifierIsTriangle() {
        double side1 = 5;
        double side2 = 6;
        double side3 = 7;
        Triangle triangle = new Triangle(side1,side2,side3);
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifier(triangle);
        String expected = "This is Triangle";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test Is NOT Triangle")
    void classifierIsNotTriangle1() {
        double side1 = 8;
        double side2 = 2;
        double side3 = 3;
        Triangle triangle = new Triangle(side1,side2,side3);
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifier(triangle);
        String expected = "This is not Triangle";
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test Is NOT Triangle")
    void classifierIsNotTriangle2() {
        double side1 = -1;
        double side2 = 2;
        double side3 = 1;
        Triangle triangle = new Triangle(side1,side2,side3);
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifier(triangle);
        String expected = "This is not Triangle";
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test Is NOT Triangle")
    void classifierIsNotTriangle3() {
        double side1 = 0;
        double side2 = 1;
        double side3 = 1;
        Triangle triangle = new Triangle(side1,side2,side3);
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifier(triangle);
        String expected = "This is not Triangle";
        assertEquals(expected,result);
    }


}