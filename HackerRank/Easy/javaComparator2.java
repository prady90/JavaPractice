package HackerRank.Easy;
import java.util.*;

// Write your Checker class here
class Checker implements Comparator<Player>{
    
   
    @Override
    public int compare(Player a, Player b){
            if(Integer.compare(b.score, a.score)>0){
                return Integer.compare(b.score, a.score);
            }
             else if(Integer.compare(b.score, a.score )==0){
                    return  a.name.compareTo(b.name);
            }else{
                return -1;
            }
        }

// alternative approach
    public int compare1(Player a, Player b){
/*
 * Returning p2.score - p1.score sorts the Players in descending order according to their scores. 
 * The exact value that the compare function returns is not important. It just has to return 0 if scores are equal, 
 * a negative number if p1 should be placed before p2 when sorting, and a positive number if p2 should be placed before p1 when sorting.
 */
        if(a.score==b.score){
            return a.name.compareTo(b.name);
        }else{
            return b.score-a.score;
        }
    }    
        
    }
    
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class javaComparator2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}