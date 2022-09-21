import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Array {
    int[] massiveValue;
    int[] massiveWeigth;

    public Array(int[] massiveValue, int[] massiveWeigth){
        this.massiveWeigth = massiveWeigth;
        this.massiveValue = massiveValue;
    }

    public int returnValue(Array massive){
        ArrayList<Integer> massiveChoice = new ArrayList<Integer>(); // создание массива типа ArrayList

        for (int j=0; j<massive.massiveWeigth.length; j++){
            for (int k=0; k<massive.massiveWeigth[j]; k++){
                massiveChoice.add(massive.massiveValue[j]);
            }
        }
        // создание массива, который включает в себя такое количество значений, вес которых они имеют
        // пример: массив со значениями [1, 2, 3] и массив весов [2, 4, 6] будет передан в третий массив (massiveChoice) типа [1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3]

        Random generator =  new Random();
        int randomIndex = generator.nextInt(massiveChoice.size());
        return massiveChoice.get(randomIndex); // возвращает случайное число из третьего массива massiveChoice с той вероятностью, которую задают веса

    }
}
