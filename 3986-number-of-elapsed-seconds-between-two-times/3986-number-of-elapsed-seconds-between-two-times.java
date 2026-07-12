class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int end = check(endTime);
        int start = check(startTime);
        return end-start;
    }
    static int check(String time)
    {
        int totalsum = 0;
        int flag = 0;
        int tr = 0;
        int hour = 0;
        for(int i = 0; i<time.length(); i++)
            {
                char ch = time.charAt(i);
                if(ch ==':') continue;
                if(flag==0)
                {
                    tr ++;
                    int digit = time.charAt(i) - '0';
                    hour = hour*10+digit;
                    
                }
                if(flag == 0 && tr==2)
                {
                    flag++;
                    totalsum = totalsum + hour*3600;
                    tr = 0;
                    hour=0;
                    continue;
                }
                if(flag == 1)
                {
                    tr++;
                    int digit1 = time.charAt(i) - '0';
                    hour = hour*10+digit1;
                    
                }
                if(tr==2 && flag == 1)
                {
                    flag++;
                    totalsum = totalsum + hour*60;
                    tr = 0;
                    hour = 0;
                    continue;
                    
                }
                if(flag ==2)
                {
                    tr ++;
                    int digit2 = time.charAt(i) - '0';
                    hour = hour*10 + digit2;
                }
                if(flag == 2 && tr == 2)
                {
                    flag ++;
                    totalsum = totalsum + hour;
                }
                
                
            }
        return totalsum;
        
    }
}