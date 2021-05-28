import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] game = {0,0,0,1,1,1};
        int leap = 4;

        System.out.println(canWin(leap, game, 0));

    }

    // 0 1 0 1 0 1
    // 0 1 2 3 4 5
    private static boolean canWin(int leap, int[] game, int i) {

        if(i<0 || game[i]==1) return false;

        if(i+leap>=game.length || i+1>= game.length || leap>game.length) return true;

        game[i]=1;

        return canWin(leap, game, i+leap) ||
                canWin(leap, game, i+1) ||
                canWin(leap, game, i+-1) ;
    }

}
