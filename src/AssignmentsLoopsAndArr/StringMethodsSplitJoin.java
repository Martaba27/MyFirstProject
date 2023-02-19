package AssignmentsLoopsAndArr;

import java.util.Arrays;

public class StringMethodsSplitJoin {

    public static void main(String[] args) {

        // String str ="Every vote must be counted. If you voted using a mail-in or absentee ballot";

        //String [] words=str.split("e");

        // System.out.println(Arrays.toString(words));

        //  String str = "We love Java";
        //  String [] words = str.split(" ");
        //  System.out.println(Arrays.toString(words));

        // String strReversedWords="";

        //for(int i = words.length-1; i>=0; i--) {

        //   strReversedWords += words[i] + "  ";

        //   }
        //  System.out.println(strReversedWords);

        String str = "election is over";
        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {

            String each = words[i];

            char up = Character.toUpperCase(each.charAt(0));

            words[i] = each.replaceFirst("" + each.charAt(0), "" + up);
        }
            System.out.println(Arrays.toString(words));

            String rebuilt = String.join("-",words);

            System.out.println(rebuilt);

        }

    }

