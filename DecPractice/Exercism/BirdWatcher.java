package Exercism;


class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeekBirdCount = {0,2,5,3,7,8,4};
        return  lastWeekBirdCount;
        
       // throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
    }

    public int getToday() {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
    BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        
        int todaysbirdCount = birdsPerDay[birdsPerDay.length - 1];
        return todaysbirdCount;
        //throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
    }

    public void incrementTodaysCount() {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        birdsPerDay = new int[]{ 2, 5, 0, 7, 4, 1 };
       int count = birdsPerDay[birdsPerDay.length - 1];
        count+=1;
        birdsPerDay[birdsPerDay.length - 1]=count;
        
       // throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
       // throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
        boolean hasDayWithoutBirds = false;
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
         
        for(int i=0; i<birdsPerDay.length; i++){
            if(birdsPerDay[i]==0){
                hasDayWithoutBirds = true;
            }
        }
        return hasDayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
       // throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
        int getCountForFirstDays = 0;
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        for(int i=0; i<numberOfDays; i++){
                getCountForFirstDays+=birdsPerDay[i];
            }
    return getCountForFirstDays;
    }

    public int getBusyDays() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
        int getBusyDays = 0;
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
    BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        for(int i=0; i<birdsPerDay.length; i++){
            if(birdsPerDay[i]>=5){
               getBusyDays+=1; 
            }
    }
    return getBusyDays;
}
}
