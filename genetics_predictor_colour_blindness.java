import java.util.*;
import java.io.*;
class genetics_predictor_colour_blindness
{
    public static void main(String args[])throws IOException
    {
        String fg,mg;
        int k=3;
        String arr1[]=new String[4];
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE GENES OF FATHER (XY for normal father and xY for colour-blind father)");
        fg=sc.next();
        System.out.println("ENTER THE GENES OF MOTHER (XX for normal mother, xX for normal but carrier mother and xx for colour-blind mother");
        mg=sc.next();
        fg=" "+fg+" ";
        mg=" "+mg+" ";
        arr1[k]=mg.substring(1,2)+fg.substring(1,2);
        k--;
        arr1[k]=mg.substring(2,3)+fg.substring(1,2);
        k--;
        arr1[k]=mg.substring(1,2)+fg.substring(2,3);
        k--;
        arr1[k]=mg.substring(2,3)+fg.substring(2,3);
        System.out .println("THE POSSIBLE OFFSPRING COMBINATIONS ARE:");
        for(int r=0;r<4;r++)
        {
            System.out.println(arr1[r]);
        }
        System.out.println("THE ABOVE COMBINATIONS MEANS THE FOLLOWING:");
        System.out.println("XX:- HOMOZYGOUS DOMINANT DAUGHTER(NON-SUFFERER)");
        System.out.println("Xx:- HETEROZYGOUS DOMINANT DAUGHTER(NON-SUFFERER)");
        System.out.println("xx:- HOMOZYGOUS RECESSIVE DAUGHTER(SUFFERER)");
        System.out.println("XY:- DOMINANT X-BEARING SON(NON-SUFFERER)");
        System.out.println("xY:- RECESSIVE X-BEARING SON(SUFFERER)");
    }
}
