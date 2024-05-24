package com.javarush.task.task13.task1309;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface CanMove {
        default Double speed() {

            return speed();
        }

        Double speed(CanFly fly);
    }

    interface CanFly extends CanMove {
        @Override
        default Double speed(CanFly fly) {
            return this.speed();
        }
    }


}