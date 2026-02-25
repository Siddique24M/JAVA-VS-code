public class Teemo_attack {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        
        if (timeSeries.length == 0) return 0;
        
        int totalTime = 0;
        
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int gap = timeSeries[i + 1] - timeSeries[i];
            totalTime += Math.min(gap, duration);
        }
        
        // Add poison duration for last attack
        totalTime += duration;
        
        return totalTime;
    }
    public static void main(String[] args) {
        int[] timeSeries = {1, 2};
        int duration = 2;
        System.out.println(findPoisonedDuration(timeSeries, duration));
    }
}

