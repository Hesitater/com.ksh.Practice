package com.ksh.zero;

import java.util.Arrays;

public class practice05 {
			public static void main(String[] args) {
				String[] arr = { new String("leo"), new String("kiki"), new String("eden") };
				String[] arr2 = { "eden", "kiki" };
				System.out.println(solution(arr, arr2));
			}

			static public String solution(String[] participant, String[] completion) {
				String answer = "";
				Arrays.sort(participant);
				Arrays.sort(completion);
				boolean last = true;
				for (int i = 0; i < completion.length; i++) {
					if (participant[i].equals(completion[i])) { //  이방법,,,?
						answer = participant[i];
						last = false;
					}
					if (last == true)
						answer = participant[i + 1];
				}
				return answer;
			}
		}


