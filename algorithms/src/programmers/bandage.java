package programmers;

import java.util.HashMap;

class bandage {
    public static void main(String[] agrs) {
        int [] bandage = {3, 10, 1};
        int health = 100;
        int[][] attacks = {{1, 5}, {3, 5}};

        solution(bandage, health, attacks);
    }

    public static int solution(int[] bandage, int health, int[][] attacks) {
        int lastAttackTime = attacks[attacks.length - 1][0];
        int continuousAttackTime = -1;
        int maxHealth = health;

        HashMap<Integer, Integer> attackHm = new HashMap<>();
        for (int i = 0; i < attacks.length; i++) {
            attackHm.put(attacks[i][0], attacks[i][1]);
        }

        for (int time = 0; time <= lastAttackTime; time++) {
            if (health <= 0) {
                health = -1;
                break;
            }

            //붕대 지속시간
            continuousAttackTime++;

            //공격 맞을 시
            if (attackHm.containsKey(time)) {
                health -= attackHm.get(time);
                continuousAttackTime = 0;
            } else {
                //붕대감기 성공
                health = Math.min(health + bandage[1], maxHealth);

                if (continuousAttackTime == bandage[0]) {
                    continuousAttackTime = 0;
                    health += bandage[2];
                    if (health > maxHealth) health = maxHealth;
                }
            }

            System.out.println(time + " ::: " + health);
        }

        System.out.println(health);

        return health <= 0 ? -1 : health;
    }
}
