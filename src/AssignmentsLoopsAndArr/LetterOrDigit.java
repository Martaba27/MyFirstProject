package AssignmentsLoopsAndArr;

public class LetterOrDigit {

    public static void main(String[] args) {

        String str ="13fh4ds6k5788jh09607jgm9sdy444789";

        String onlyNums="";

        for(int j=0;j<str.length(); j++){

            if(Character.isLetter(str.charAt(j))){

                onlyNums+=str.charAt(j);


            }
        }

        System.out.println(onlyNums);

        System.out.println(Character.isUpperCase('@'));
        System.out.println(Character.isUpperCase('o'));
        System.out.println(Character.isLowerCase('g'));
        System.out.println(Character.isLowerCase('f'));


        char a = Character.toUpperCase('a');
        char b = Character.toUpperCase('b');


        System.out.println(a);
        System.out.println(b);


        String s ="hello world";

        String AllUpper ="";
        for(int j =0; j< s.length(); j++) {

            if (Character.isUpperCase(s.charAt(j))) ;

            AllUpper += s.charAt(j);
        }

            System.out.println(AllUpper);


        }
    }

