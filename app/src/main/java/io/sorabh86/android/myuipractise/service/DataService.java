package io.sorabh86.android.myuipractise.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.sorabh86.android.myuipractise.R;

/**
 * @Author: sorabh86 <sorabh86.github.com>
 * @Date: 25-09-2023
 */
public class DataService {

    public static int[] getAnimals() {
        int[] animals = {
                R.drawable.animal_01,
                R.drawable.animal_02,
                R.drawable.animal_03,
                R.drawable.animal_04,
                R.drawable.animal_05,
                R.drawable.animal_06,
                R.drawable.animal_07,
                R.drawable.animal_08,
                R.drawable.animal_09,
                R.drawable.animal_10,
                R.drawable.animal_11,
                R.drawable.animal_12,
                R.drawable.animal_13,
                R.drawable.animal_14,
                R.drawable.animal_15,
                R.drawable.animal_16,
                R.drawable.animal_17,
                R.drawable.animal_18,
                R.drawable.animal_19,
                R.drawable.animal_20,
                R.drawable.animal_21,
                R.drawable.animal_22,
                R.drawable.animal_23,
                R.drawable.animal_24,
                R.drawable.animal_25,
                R.drawable.animal_26,
                R.drawable.animal_27,
                R.drawable.animal_28,
                R.drawable.animal_29,
                R.drawable.animal_30,
                R.drawable.animal_31,
                R.drawable.animal_32
        };
        return animals;
    }

    public static List<Map<String, Object>> getAnimalsList() {
        List<Map<String, Object>> myList = new ArrayList<>();

        Map<String, Object> myMap = new HashMap<>();
        myMap.put("name", "Bird");
        myMap.put("image", R.drawable.animal_01);

        Map<String, Object> myMap2 = new HashMap<>();
        myMap2.put("name", "Puppy");
        myMap2.put("image", R.drawable.animal_02);
        myList.add(myMap2);
        
        Map<String, Object> myMap3 = new HashMap<>();
        myMap3.put("name", "Sheep");
        myMap3.put("image", R.drawable.animal_03);
        myList.add(myMap3);
        
        Map<String, Object> myMap4 = new HashMap<>();
        myMap4.put("name", "Goat");
        myMap4.put("image", R.drawable.animal_04);
        myList.add(myMap4);
        
        Map<String, Object> myMap5 = new HashMap<>();
        myMap5.put("name", "Horse");
        myMap5.put("image", R.drawable.animal_05);
        myList.add(myMap5);
        
        Map<String, Object> myMap6 = new HashMap<>();
        myMap6.put("name", "Duck");
        myMap6.put("image", R.drawable.animal_06);
        myList.add(myMap6);
        
        Map<String, Object> myMap7 = new HashMap<>();
        myMap7.put("name", "Chicken");
        myMap7.put("image", R.drawable.animal_07);
        myList.add(myMap7);
        
        Map<String, Object> myMap8 = new HashMap<>();
        myMap8.put("name", "Dog");
        myMap8.put("image", R.drawable.animal_08);
        myList.add(myMap8);


        return myList;
    }
}
