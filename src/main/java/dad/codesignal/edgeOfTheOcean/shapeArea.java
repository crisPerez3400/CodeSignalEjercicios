package dad.codesignal.edgeOfTheOcean;

public class shapeArea {

    public int solution(int n) {
        if (n <= 0) {
            return 0;
        }
        return n * n + (n - 1) * (n -1);
    }

}
