package com.example.NumberPickerTexasLotto;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class NumberPickerTexasLottoApplication {

    public static void main(String[] args) {

        int[] MOST_FREQUENT_NUMBER_POOL = {4, 5, 7, 8, 9, 12, 14, 15, 16, 17, 18, 19, 21, 22, 24, 25, 26, 27, 31, 34, 35,
                                    37, 38, 42, 44, 49, 52};

        displayNumbersTitle(MOST_FREQUENT_NUMBER_POOL);

        int i = 0;
		Set<Integer> mySet = new HashSet<>();
		while (i < 10) {
            while (mySet.size() < 6) {
                // I don't like most comments. The ones I do like describe why code is there not what its doing
				pickNextLottoNumber(MOST_FREQUENT_NUMBER_POOL, mySet);
			}
            System.out.println(mySet);

            mySet.clear();
            i++;
        }

    }

    private static void displayNumbersTitle(int[] MOST_FREQUENT_NUMBER_POOL) {
        System.out.print("Your pool of frequent numbers is this long: " +
                MOST_FREQUENT_NUMBER_POOL.length +
                "\n\n Texas Lotto \n Here are your numbers: \n");
    }

    private static void pickNextLottoNumber(int[] pickPool, Set<Integer> mySet) {
		int randomNum = ThreadLocalRandom.current().nextInt(0, pickPool.length);
		mySet.add(pickPool[randomNum]);
	}


}
