package Assignment_6;

import java.util.Arrays;

public class TaskOne {

    public static void main(String[] args)
    {
        char[] num_char;
        char[] curr_char;
        int num;
        int count = 0;
        for(int i=1; ; i++) {

            for(int j=i; ; j++) {
                num  = i * j;
                String x = Integer.toString(i);
                String y = Integer.toString(j);
                String z = Integer.toString(num);
                //checking trailing zeroes
                if((x.charAt(x.length()-1)=='0'&& y.charAt(y.length()-1)=='0'))
                    break;
                //checking for odd length number
                if(z.length()%2!=0 && x.length() != y.length())
                    break;
                String curr_ans = x + y;
                num_char = z.toCharArray();
                curr_char = curr_ans.toCharArray();

                Arrays.sort(num_char);
                Arrays.sort(curr_char);
                if(Arrays.equals(num_char, curr_char) ) {
                    System.out.println(i + " * " + j + " = " + num);
                    count++;
                    if(count == 100)
                        return;
                }
            }
        }
    }
}

