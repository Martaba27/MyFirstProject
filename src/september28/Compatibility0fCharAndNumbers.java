package september28;

public class Compatibility0fCharAndNumbers {

  public static void main(String[] args) {


    // byte->short->int->long->float->double

    char ch = 'a';

// byte b = ch;
//short sh = ch;
    int i = ch;

    System.out.println(i);
    System.out.println((char) 67);
    System.out.println((int)'$');

    int i2 = '%';

    System.out.println(i2);
    System.out.println('a' +'b' );

    char ch4 = '1' + '2';
    System.out.println(ch4);

    System.out.println('a'+'b'+'c');
    System.out.println(""+'a'+'b'+'c'); // "" + String





  }



}
