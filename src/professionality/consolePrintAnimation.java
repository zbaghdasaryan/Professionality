package professionality;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class consolePrintAnimation {
    public static void printInput(String input){
        boolean directionForward = true;
        int i = 0;
        StringBuilder inputText = new StringBuilder();
        inputText.append(input.trim());
        System.out.println(inputText);
        while(true){
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(directionForward){
                if (inputText.charAt(i)>='a' && inputText.charAt(i)<='z') {
                    inputText.replace(i, i + 1, String.valueOf((char)(inputText.charAt(i) - 32)));
                    if(i>0 && inputText.charAt(i-1)>='a' && inputText.charAt(i-1)<='z') inputText.replace(i-1, i , String.valueOf((char)(inputText.charAt(i-1) -32)));
                    else if (i>0 && inputText.charAt(i-1)>='A' && inputText.charAt(i-1)<='Z') inputText.replace(i-1, i , String.valueOf((char)(inputText.charAt(i-1) +32)));
                }
                else if (inputText.charAt(i)>='A' && inputText.charAt(i)<='Z'){
                    inputText.replace(i, i + 1, String.valueOf((char)(inputText.charAt(i) + 32)));
                    if(i>0 && inputText.charAt(i-1)>='a' && inputText.charAt(i-1)<='z') inputText.replace(i-1, i, String.valueOf((char)(inputText.charAt(i-1) -32)));
                    else if (i>0 && inputText.charAt(i-1)>='A' && inputText.charAt(i-1)<='Z') inputText.replace(i-1, i, String.valueOf((char)(inputText.charAt(i-1) +32)));

                }
                else{
                    if (inputText.charAt(i - 1) != ' ') {
                        if (i > 0 && inputText.charAt(i - 1) >= 'a' && inputText.charAt(i - 1) <= 'z') inputText.replace(i - 1, i, String.valueOf((char) (inputText.charAt(i - 1) - 32)));
                        else if (i > 0 && inputText.charAt(i - 1) >= 'A' && inputText.charAt(i - 1) <= 'Z') inputText.replace(i - 1, i, String.valueOf((char) (inputText.charAt(i - 1) + 32)));
                    }
                }
                System.out.println(inputText);
                i++;
                if(i==inputText.length()){
                    directionForward = false;
                    i=inputText.length()-2;
                }
            }
            else{
                if (inputText.charAt(i)>='a' && inputText.charAt(i)<='z') {
                    inputText.replace(i, i + 1, String.valueOf((char)(inputText.charAt(i) - 32)));
                    if(i<inputText.length()-1 && inputText.charAt(i+1)>='a' && inputText.charAt(i+1)<='z')inputText.replace(i+1, i+2, String.valueOf((char)(inputText.charAt(i+1) -32)));
                    else if (i<inputText.length()-1 && inputText.charAt(i+1)>='A' && inputText.charAt(i+1)<='Z') inputText.replace(i+1, i+2, String.valueOf((char)(inputText.charAt(i+1) +32)));
                }
                else if (inputText.charAt(i)>='A' && inputText.charAt(i)<='Z'){
                    inputText.replace(i, i + 1, String.valueOf((char)(inputText.charAt(i) + 32)));
                    if(i<inputText.length()-1 && inputText.charAt(i+1)>='a' && inputText.charAt(i+1)<='z') inputText.replace(i+1, i+2, String.valueOf((char)(inputText.charAt(i+1) -32)));
                    else if (i<inputText.length()-1 && inputText.charAt(i+1)>='A' && inputText.charAt(i+1)<='Z') inputText.replace(i+1, i+2, String.valueOf((char)(inputText.charAt(i+1) +32)));
                }
                else{
                    if(inputText.charAt(i+1)!=' ') {
                        if (inputText.charAt(i + 1) >= 'a' && inputText.charAt(i + 1) <= 'z') inputText.replace(i + 1, i + 2, String.valueOf((char) (inputText.charAt(i + 1) - 32)));
                        else if (inputText.charAt(i + 1) >= 'A' && inputText.charAt(i + 1) <= 'Z') inputText.replace(i + 1, i + 2, String.valueOf((char) (inputText.charAt(i + 1) + 32)));
                    }
                }
                System.out.println(inputText);
                i--;
                if(i==-1){
                    directionForward=true;
                    i=0;
                    if(inputText.charAt(i) >= 'a' && inputText.charAt(i) <= 'z') inputText.replace(i, i + 1, String.valueOf((char)(inputText.charAt(i) - 32)));
                    else if(inputText.charAt(i) >= 'A' && inputText.charAt(i) <= 'X') inputText.replace(i, i + 1, String.valueOf((char)(inputText.charAt(i) + 32)));
                    System.out.println(inputText);
                };
            }
        }
    }
}

