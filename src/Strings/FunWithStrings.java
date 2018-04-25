package Strings;

import classandobject.Invoice;
import utils.StrUtils;

import java.util.SortedMap;

public class FunWithStrings {

    public static void main(String[] args) {
        Invoice invoice = new Invoice(null, 0, null, 0);
        invoice .toString();

        String text = "a" + "b";
        String text2 = "a".concat("b");

        if(text.equals(text2)) {
            System.out.println("equals");
        }    else {
            System.out.println("not");
        }

        System.out.println(text.toUpperCase());

        String s = "a,b,c,d,e";
        String[] strings = s.split(",");

        System.out.println(strings[2]);

        String result = "";
        for(String str : strings) {
            result = result + str + ", ";
        }
        System.out.println(StrUtils.removeLastSeparator(result, ","));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("a");
        }
        System.out.println(sb.toString());

//        String res = "";
//        for (int i = 0; i < 1000000; i++) {
//            res += "a";
//        }
//
//        System.out.println(res);
    }
}
