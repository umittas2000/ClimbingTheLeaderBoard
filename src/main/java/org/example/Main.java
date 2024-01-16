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

        int counter=0;
        boolean flag=false;
        List<Integer> result = new ArrayList<>();
        List<Integer> ranksNew = new ArrayList<>(ranks);

        for(int i=0;i<player.size();i++)
        {
            int num=player.get(i);
            int prevNum=-1;
            for(int k=0;k<ranks.size();k++){
                int rankNum = ranks.get(k);
                if(k>0){
                    prevNum=ranks.get(k-1);
                }

                if(prevNum!=ranks.get(k)){
                    counter++;
                }

                if(player.get(i)>=ranksNew.get(k)){
                    result.add(counter);
                    ranksNew.add(k,player.get(i));
                    flag=true;
                    break;
                }
            }

            if(flag==false){
                counter++;
                ranksNew.add(player.get(i));
                result.add(counter);
            }

            counter=0;
            flag=false;
        }
        return result;
    }
}

