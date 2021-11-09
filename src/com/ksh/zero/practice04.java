package com.ksh.zero;

public class practice04 {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";

	        for(int a=0; a< participant.length;a++)
	        {
	            boolean complete = false;
	            for (int b=0; b< completion.length;b++)
	            {
	                if (participant[a] == completion[b])
	                {
	                    complete = true;
	                    break;
	                }
	            }
	            if(!complete)
	                return answer = participant[a];
	        }

	        return answer;
	    }
	
}
