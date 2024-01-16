package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Climbing the Leader board is the algorithm that gives you rank list
        // and player ranks and expect you return player's ranks positions in the leader board.
        //Rule1: ranks list will be in descending order.
        //Rule2: player list will be in ascending order.
        //At least 1 item will be in both lists.

        //Initialization and sample dataset prep
        List<Integer> ranks = Arrays.asList(100,100,50,40,40,20,10);
        List<Integer> player = Arrays.asList(5,25,50,120);

        System.out.println(rankedList(ranks,player));
        //Expected output [6, 4, 2, 1]
    }

    public static List<Integer> rankedList(List<Integer> ranks, List<Integer> player){

        // Convert to Unique List
        Set<Integer>  uniqueList = new LinkedHashSet<>(ranks);
        List<Integer> ranksNew = new ArrayList<>(uniqueList);
        List<Integer> result = new ArrayList<>();

        for(int i=0;i<player.size();i++){
            if(uniqueList.contains(player.get(i))==false){
                ranksNew.add(player.get(i));
                Collections.sort(ranksNew,Collections.reverseOrder());
                result.add(ranksNew.indexOf(player.get(i))+1);
                //System.out.println(player.get(i)+ " - "+ (ranksNew.indexOf(player.get(i))+1));
                // System.out.println(ranksNew);
            }else{
                result.add(ranksNew.indexOf(player.get(i))+1);
                //System.out.println(player.get(i)+ " - "+ (ranksNew.indexOf(player.get(i))+1));
                //System.out.println(ranksNew);
            }
        }

        return result;
    }
}

