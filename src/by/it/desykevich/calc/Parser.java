package by.it.desykevich.calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Parser {
    Var calc(String expression){

        Pattern p=Pattern.compile (Patterns.OPERATION);
        Matcher m=p.matcher(expression);
        if (m.find()) {
            String[] strOp=expression.split(Patterns.OPERATION);
            String operation=m.group();
            Var two=Var.createVar(strOp[1]);
//            if (operation.equals("=") && strOp[0].matches(Patterns.VARNAME))
//                return  Var.saveVar (strOp [0],two);

            Var one= Var.createVar(strOp[0]);


            switch (operation) {
                case "+":return one.add(two);
                case "-":return one.sub(two);
                case "*":return one.mul(two);
                case "/":return one.div(two);
            }
        }
        return null;
    }
}
