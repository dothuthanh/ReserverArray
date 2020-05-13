package app;

import java.util.Stack;

public class Reveser {
        public static void main(String[] args) {
            Stack<String> wStack = new Stack<>();
            String str = "code gym ham nghi";
            String oput = "";
            String[] words = str.split("\\s");
            for (String string : words){
                wStack.push(string);
            }

            int i=0;
            while(wStack.size() != 0){
                oput+= wStack.pop();
                i++;
            }
            System.out.println(oput);

//        int i=0;
//        while(wStack.size() != 0){
//            words[i] = wStack.pop();
//            i++;
//        }
//        System.out.println(Arrays.toString(words));
        }
    }
