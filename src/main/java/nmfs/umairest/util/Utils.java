package nmfs.umairest.util;

import java.util.Random;

/**
 * Created by c0259896 on 21/09/2019.
 */
public class Utils {

    static Random rand = new Random();

    // Obtain a number between [0 - 49].

    public static String generateRandonNumber(int length){
        String retVal="";
        for(int i=0;i<length;i++){
            int digit = rand.nextInt(10);
            retVal=retVal+String.valueOf(digit);
        }

        return retVal;
    }
}
