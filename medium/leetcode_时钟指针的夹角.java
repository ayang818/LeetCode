class Solution {
    public double angleClock(int hour, int minutes) {
        double first = ((double) minutes/60.0)*360;
        double second = ((double) hour/12.0)*360+((double) minutes/60.0)*30;
        double temp = Math.abs(first-second);
        if (temp > 180) {
            return 360-temp;
        }
        return temp;
    }
}