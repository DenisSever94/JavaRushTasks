package com.javarush.task.pro.task05.task0517;
import java.util.Arrays;
public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    public static void main(String[] args) {
/*
      в if  мы провеяем массив на четность, если он не четный то есть условие в if истинно то
      дальше мы берем копируем из массива array в result [0] ноль - это от какого индекса начнет заполняься маасив.
      дальше в методе Arrays.copyOfRange мы прописывает из какого массива  array мы будем копировать значения , после
      от какого индекса массива мы начнем копировать, после мы делим массив на два и прибовляем +1 для того,
      чтоб наш массив заполнился большей частью, так как в условии.
      Во второй строчке кода мы снова прибавляем + 1 для того, чтоб заполнить меньшую часть массива, то есть мы
      поделии массив на 2 и прибавили еще + 1 для того, чтоб он начал заполнять не от середины , а от следующей ячейки.
       заолняем вторую половину массива от середины массива и до конца.
 */
        if (array.length % 2 != 0) {
           result[0] = Arrays.copyOfRange(array, 0,array.length / 2 + 1);
           result[1] = Arrays.copyOfRange(array, array.length / 2 + 1, array.length);
        } else {
            /*
            К этой части кода мы мереходим если массив четный и первое условие не выполнилось,
            тут похожая ситуация мы берем массив от 0 и до середины массива заполняем его и от
            половины до конца также заполняем его.
             */
            result[0] = Arrays.copyOfRange(array, 0,array.length / 2 );
            result[1] = Arrays.copyOfRange(array, array.length / 2, array.length);
        }
        System.out.println(Arrays.deepToString(result));
    }
}
