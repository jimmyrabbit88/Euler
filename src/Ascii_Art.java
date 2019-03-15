import java.util.Scanner;

public class Ascii_Art {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int NumWords = in.nextInt();
        in.nextLine();
        String sent = in.nextLine();
        String[] words = sent.split(" ");
        int wordlength = 1;
        for (String w:words) {
            if(wordlength < w.length()){
                wordlength = w.length();
            }
        }





        if(wordlength%2 == 0){
            wordlength += 4;
        }
        else{
            wordlength +=5;
        }

        String out = "";
        for (int i = 0; i < wordlength/2; i++) {
            out += "* ";
        }
        int i = 0;
        int line = wordlength - 4;
        System.out.println(line);
        out += "\n* ";
        boolean finished = false;
        while(!finished) {
            String temp = words[i] + " ";
            if (i < words.length - 2 && (temp.length() + words[i + 1].length() < line)) {
                temp += words[i + 1] + " ";
                i++;
            } else {
                //System.out.println();
                for (int j = 0; j < line - temp.length(); j++) {
                    temp += " ";
                }
            }
            if (i >= words.length-1){
                finished = true;
            }
            else{
                i ++;
            }
            temp += "*\n* ";
            out += temp;
        }

        for (int k = 0; k < (wordlength/2) -1; k++) {
            out += "* ";
        }



        System.out.println(out);
    }
}
