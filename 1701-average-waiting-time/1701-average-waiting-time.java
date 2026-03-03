class Solution {
    public double averageWaitingTime(int[][] customers) {
        long currentTime = 0;   
        long totalWait = 0;    
        
        for (int i = 0; i < customers.length; i++) {
            int arrival = customers[i][0];
            int cookTime = customers[i][1];
         
            if (currentTime < arrival) {
                currentTime = arrival;
            }
         
            currentTime += cookTime;
            
            totalWait += (currentTime - arrival);
        }
        
        return (double) totalWait / customers.length;
    }
}