package week5;

import java.util.*;

class q2 {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> que = new LinkedList<Integer>();
        Queue<Integer> compare = new LinkedList<Integer>();

        int cnt = 0;
        int print = priorities[location];

        for(int i = 0; i < priorities.length; i++) {
            que.add( priorities[i] );
            if( i == location ) {
                compare.add(1);
            }else {
                compare.add( 0);
            }
        }

        int idx = priorities.length - 1;
        Arrays.sort( priorities );

        while( true ) {

            if( que.peek() == priorities[idx] ) {
                if( que.peek() == print && compare.peek() == 1 ) {
                    answer = cnt+1;
                    break;
                }

                que.poll();
                compare.poll();
                cnt++;
                idx--;
            }else {
                que.add( que.poll() );
                compare.add( compare.poll() );
            }
        }

        return answer;
    }
}