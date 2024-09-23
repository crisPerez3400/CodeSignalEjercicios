package dad.codesignal.edgeOfTheOcean;

public class MakeArrayConsecutive2 {
    public int solution(int[] statues) {

        int maximo = statues[0];
        int min = statues[0];
        int cantidad =  statues.length;
        for (int j : statues) {
            if (j > maximo) {
                maximo = j;

            } if (j < min) {
                min = j;

            }
        }
        int resultado = maximo - min + 1 - cantidad;

        return resultado;

    }
}
