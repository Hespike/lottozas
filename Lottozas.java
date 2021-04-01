public class Lottozas {

    static int lotto(int[] tipp, int[] kisorsolt) {
        int talalat = 0;
        for (int i = 0; i < tipp.length; i++) {
            for (int j = 0; j < kisorsolt.length; j++) {
                if (tipp[i] == kisorsolt[j]) {
                    talalat++;
                    break;
                }
            }
        }

        return talalat;
    }

}
