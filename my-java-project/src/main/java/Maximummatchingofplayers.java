import java.util.Arrays;
public class Maximummatchingofplayers {
    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int player=0;
        int trainer=0;

        while(trainer<trainers.length && player<players.length){
            if(players[player]<=trainers[trainer]){
                player++;
            }
            trainer++;
        }  
        return player;
    }
    public static void main(String[] args) {
        int[] players ={4,7,9};
        int[] trainers={8,2,5,8};
        System.out.println(matchPlayersAndTrainers(players, trainers));
     
    }
    
}
