class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour==12){
            hour=0;
        } 
        double minhand = minutes*6;
        double hourhand = (hour*30)+(minutes*0.5);
        double angle = Math.abs(minhand-hourhand);
        return Math.min(angle, 360-angle);
    }

}