import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Problem8_TournamentWinner {

    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        Map<String, Integer> record = new HashMap<String, Integer>();
        int nb_competitions = results.size();
        String winner = "";
        int maxScore = 0;
        for (int i = 0; i < nb_competitions; i++) {
            ArrayList<String> competition = competitions.get(i);
            String team1 = competition.get(0);
            String team2 = competition.get(1);
            String currentWinner = "";
            if (results.get(i) == 1) {
                currentWinner = team1;
            } else {
                currentWinner = team2;
            }
            int currentScore = 0;
            if (record.containsKey(currentWinner)) {
                currentScore = record.get(currentWinner);
            }

            record.put(currentWinner, currentScore + 1);
            if (currentScore + 1 > maxScore) {
                winner = currentWinner;
                maxScore = currentScore + 1;
            }
        }


        return winner;
    }
}

