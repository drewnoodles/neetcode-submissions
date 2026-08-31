class Solution {
    public int countSeniors(String[] details) {
        int sen = 0;
        for (String d : details) {
            if (Integer.parseInt(d.substring(11,13)) > 60) {
                sen++;
            }
        }
        return sen;
    
        
    }
}