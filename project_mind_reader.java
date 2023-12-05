import java.io.*;
import java.util.*;
class project_mind_reader
{
    public static void main(String args[])throws IOException
    {
        int arr1[]={16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95};
        int arr2[]={2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31,34,35,38,39,42,43,46,47,50,51,54,55,58,59,62,63,66,67,70,71,74,75,78,79,82,83,86,87,90,91,94,95,98,99};
        int arr3[]={64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
        int arr4[]={32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,96,97,98,99,100};
        int arr5[]={4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31,36,37,38,39,44,45,46,47,52,53,54,55,60,61,62,63,68,69,70,71,76,77,78,79,84,85,86,87,92,93,94,95,100};
        int arr6[]={8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31,40,41,42,43,44,45,46,47,56,57,58,59,60,61,62,63,72,73,74,75,76,77,78,79,88,89,90,91,92,93,94,95};
        int arr7[]={1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59,61,63,65,67,69,71,73,75,77,79,81,83,85,87,89,91,93,95,97,99};
        int ch_no=0,k=1;
        String str=" ",str1=" ";
        System.out.println("HELLO! I'M YOUR MIND READER. WELL, YOU CHOOSE A NUMBER BETWEEN 1 TO 100 AND THEN I'LL GUESS IT. AS SIMPLE AS THAT! LET'S GET STARTED");
	System.out.println("AFTER YOU FINISH CHOOSING, REMEMBER IT AND THEN ENTER \"Y\"");
	Scanner sc=new Scanner(System.in);
        str=sc.next();
        if(str.equalsIgnoreCase("Y"))
	{
            System.out.println("\f");
            for(int i=0;i<48;i++)
            {
                System.out.print(arr1[i]+"    ");
                k++;
                if(k==6)
                {
                    System.out.println();
                    k=1;
                }
            }
	    k=1;
            System.out.println("\nCHECK WHETHER YOUR NUMBER IS AMONG THEM AND ENTER \"Y\" IF YES AND \"N\" IF NO");
	    str1=sc.next();
            if(str1.equalsIgnoreCase("Y"))
                ch_no=ch_no+arr1[0];
            str1=" ";
            System.out.println("\f");
            for(int i=0;i<50;i++)
            {
                if(arr2[i]<10)
                    System.out.print("0"+arr2[i]+"    ");
                else
                    System.out.print(arr2[i]+"    ");
                k++;
                if(k==5)
                {
                    System.out.println();
                    k=1;
                }
            }
            k=1;
            System.out.println("\nCHECK AGAIN WHETHER YOUR NUMBER IS AMONG THEM AND ENTER \"Y\" IF YES AND \"N\" IF NO");
	    str1=sc.next();
            if(str1.equalsIgnoreCase("Y"))
                ch_no=ch_no+arr2[0];
            str1=" ";
            System.out.println("\f");
            for(int i=0;i<37;i++)
            {
                System.out.print(arr3[i]+"    ");
                k++;
                if(k==6)
                {
                    System.out.println();
                    k=1;
                }
            }
            k=1;
            System.out.println("\nCHECK AGAIN WHETHER YOUR NUMBER IS AMONG THEM AND ENTER \"Y\" IF YES AND \"N\" IF NO");
	    str1=sc.next();
            if(str1.equalsIgnoreCase("Y"))
                ch_no=ch_no+arr3[0];
            str1=" ";
            System.out.println("\f");
            for(int i=0;i<37;i++)
            {
                System.out.print(arr4[i]+"    ");
                k++;
                if(k==6)
                {
                    System.out.println();
                    k=1;
                }
            }
            k=1;
            System.out.println("\nCHECK AGAIN WHETHER YOUR NUMBER IS AMONG THEM AND ENTER \"Y\" IF YES AND \"N\" IF NO");
	    str1=sc.next();
            if(str1.equalsIgnoreCase("Y"))
                ch_no=ch_no+arr4[0];
            str1=" ";
            System.out.println("\f");
            for(int i=0;i<49;i++)
            {
                if(arr5[i]<10)
                    System.out.print("0"+arr5[i]+"    ");
                else
                    System.out.print(arr5[i]+"    ");
                k++;
                if(k==7)
                {
                    System.out.println();
                    k=1;
                }
            }
            k=1;
            System.out.println("\nCHECK AGAIN WHETHER YOUR NUMBER IS AMONG THEM AND ENTER \"Y\" IF YES AND \"N\" IF NO");
	    str1=sc.next();
            if(str1.equalsIgnoreCase("Y"))
                ch_no=ch_no+arr5[0];
            str1=" ";
            System.out.println("\f");
            for(int i=0;i<48;i++)
            {
                if(arr6[i]<10)
                    System.out.print("0"+arr6[i]+"    ");
                else
                    System.out.print(arr6[i]+"    ");
                k++;
                if(k==6)
                {
                    System.out.println();
                    k=1;
                }
            }
            k=1;
            System.out.println("\nCHECK AGAIN WHETHER YOUR NUMBER IS AMONG THEM AND ENTER \"Y\" IF YES AND \"N\" IF NO");
	    str1=sc.next();
            if(str1.equalsIgnoreCase("Y"))
                ch_no=ch_no+arr6[0];
            str1=" ";
            System.out.println("\f");
            for(int i=0;i<50;i++)
            {
                if(arr7[i]<10)
                    System.out.print("0"+arr7[i]+"    ");
                else
                    System.out.print(arr7[i]+"    ");
                k++;
                if(k==5)
                {
                    System.out.println();
                    k=1;
                }
            }
            k=1;
            System.out.println("\nCHECK AGAIN WHETHER YOUR NUMBER IS AMONG THEM AND ENTER \"Y\" IF YES AND \"N\" IF NO");
	    str1=sc.next();
            if(str1.equalsIgnoreCase("Y"))
                ch_no=ch_no+arr7[0];
            str1=" ";
            System.out.println("\f");
            System.out.println("HMM, THAT WAS HARD BUT NOT IMPOSSIBLE ;-) \nYOUR NUMBER IS "+ch_no+", ISN'T IT?");
	    System.out.println("SHOCKED?!!");
        }
    }
}
	    