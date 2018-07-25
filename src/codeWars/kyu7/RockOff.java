package codeWars.kyu7;

public class RockOff {
    public static String solveRockOff(final int[] alice, final int[] bob) {
        int aliceCount = 0;
        int bobCount = 0;
        String s = "";

        for (int i = 0; i < alice.length; i++) {
            if (alice[i] > bob[i]) {
                aliceCount++;
            } else if (alice[i] < bob[i]) bobCount++;
        }
        if (aliceCount == bobCount) s = aliceCount + ", " + bobCount +": that looks like a \"draw\"! Rock on!";
        if (aliceCount > bobCount) s = aliceCount + ", " + bobCount + ": Alice made \"Kurt\" proud!";
        if (aliceCount < bobCount) s = aliceCount + ", " + bobCount + ": Bob made \"Jeff\" proud!";

        return s;
    }
}
