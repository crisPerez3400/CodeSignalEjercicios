package dad.codesignal.edgeOfTheOcean;

public class adjacentElementsProduct {
    public int solution(int[] inputArray) {
        int resultadoFinal = inputArray[0] * inputArray[1];

        for (int i = 0; i < inputArray.length - 1; i++){
            int j = i + 1;

            int resultado = inputArray[i] * inputArray[j];

            if (resultado > resultadoFinal) {
                resultadoFinal = resultado;
            }
        } return resultadoFinal;
    }
}
