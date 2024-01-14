package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Climbing the Leader board is the algorithm that gives you rank list
        // and player ranks and expect you return player's ranks positions in the leader board.
        //Rule1: ranks list will be in descending order.
        //Rule2: player list will be in ascending order.
        //At least 1 item will be in both lists.

        //Initialization and sample dataset prep
        List<Integer> ranks = Arrays.asList(100,100,90,80,70,60);
        List<Integer> player = Arrays.asList(5,65,120);
        //Expected output [6,5,1]

        List<Integer> result = rankedList(ranks,player);

        System.out.println(result);
    }

    public static List<Integer> rankedList(List<Integer> ranks, List<Integer> player){

        List<Integer> result = new ArrayList<>();
        result.add(1);

        return result;
    }
}