package com.andrei;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//for this implementation each bucket will be an array list
public class Main {

    public static void main(String[] args) {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(intArray);

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void bucketSort(int[] input){

        List<Integer>[] buckets = new List[10];

        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<Integer>();
        }

        // scattering phase: distribute the items into buckets based on their hashed values
        for(int i = 0; i < input.length; i++){

            //for 54 = bucket[5].add(54)
            buckets[hash(input[i])].add(input[i]);
        }

        // sort phase: sort each bucket
        // insertion sort is usually used to sort the buckets but hire for simplicity  I use java collection sort.

        for(List bucket: buckets){
            Collections.sort(bucket);
        }

        //gathering phase: merge the buckets
        int j = 0;
        for(int i = 0; i< buckets.length; i++){
            for(int value: buckets[i]){
                input[j++] = value;
            }
        }

    }

    //In bucket sort algorithm the values in bucket X must be greater than the values in bucket X-1 and less than X+1.
    // The hash function must meet this requirement.
    private static int hash(int value){

        return value /(int) 10;
    }
}
