//see Task file first

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        int groupSize = 364;
        int simulationCount = 1;

        if (groupSize < 2 || groupSize > 365) {
            System.out.println("Error: Group Size must be in the range 2-365.");
            return;
        }
        if (!(simulationCount >= 1 && simulationCount <= 100000)) {
            System.out.println("Error: Simulation Count must be in the range 1-100000.");
            return;
        }

        double percent = calculate(groupSize, simulationCount);

        // report results
        System.out.println("For a group of " + groupSize + " people, the percentage "
                + " of times that two people share the same birthday is "
                + String.format("%.2f%% of the time.", percent));



    }

    public static double calculate(int size, int count) {
        List<Integer> participantsList = new ArrayList<>();
        int simulationsPassed = 0;

        for(int i = 0 ; i < count ; i++){
            participantsList.clear();
            Random random = new Random(i);
            participantsList.add(random.nextInt(365));
            for(int j = 1 ; j < size ; j++ ){
                int randomNumber = random.nextInt(365);
                if(participantsList.contains(randomNumber)){
                    simulationsPassed++;
                    j = size; // exit the current loop
                }else{
                    participantsList.add(randomNumber);
                }
            }
        }
        System.out.println("The number of simulation passed is : "  + simulationsPassed);
        return (double)simulationsPassed * 100.00 / (double)count  ;
    }
}
