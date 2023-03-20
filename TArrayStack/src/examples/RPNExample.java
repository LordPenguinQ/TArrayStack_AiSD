package examples;

import lib.tools.RPNGenerator;

public class RPNExample {
    public static void run() {
        RPNGenerator rpnGenerator = new RPNGenerator(256);

        try{
            //var out = rpnGenerator.generator("( 5 + 4 ) * 3 + ( 13 % 5 ) * ( 7 / 3 ) - 13");
            var out = rpnGenerator.loadFromFile("expression.txt");
            System.out.println(out);
        }catch(Exception e){
            System.out.println(e.toString());
        }

    }
}
