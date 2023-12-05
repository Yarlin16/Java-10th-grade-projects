import java.io.*;
import java.util.*;
class day_finder_2001_2100
{
    public static void main(String args[])throws IOException
    {
        int year,checker1,checker2,checker3=0,checker4,j=65;
        String str;
        char arr1[]={'A','B','C','K','F','G','A','I','D','E','F','N','B','C','D','L','G','A','B','J','E','F','G','H','C','D','E','M'},checker=' ';
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE DATE FOR WHICH YOU WANT TO FIND THE DAY NAME (FORMAT:DD-MM-YYYY)");
        str=sc.next();
        year=Integer.parseInt(str.substring(6));
        checker1=year%100;
        //System.out.println(checker1);
        if(checker1<=28&&checker1!=0)
            checker=arr1[checker1-1];
        else if(checker1<=56&&checker1>28)
            checker=arr1[checker1-29];
        else if(checker1<=84&&checker1>56)
            checker=arr1[checker1-57];
        else if(checker1>84&&checker1!=0)
            checker=arr1[checker1-85];
        else
            checker='E';
        //System.out.println(checker);
        int codeA[]={1,4,4,7,2,5,7,3,6,1,4,6},codeB[]={2,5,5,1,3,6,1,4,7,2,5,7},codeC[]={3,6,6,2,4,7,2,5,1,3,6,1},codeD[]={4,7,7,3,5,1,3,6,2,4,7,2};
        int codeE[]={5,1,1,4,6,2,4,7,3,5,1,3},codeF[]={6,2,2,5,1,3,5,1,4,6,2,4},codeG[]={7,3,3,6,1,4,6,2,5,7,3,5},codeH[]={1,4,5,1,3,6,1,4,7,2,5,7};
        int codeI[]={2,5,6,2,4,7,2,5,1,3,6,1},codeJ[]={3,6,7,3,5,1,3,6,2,4,7,2},codeK[]={4,7,1,4,6,2,4,7,3,5,1,3},codeL[]={5,1,2,5,7,3,5,1,4,6,2,4};
        int codeM[]={6,2,3,6,1,4,6,2,5,7,3,5},codeN[]={7,3,4,7,2,5,7,3,6,1,4,6};
        checker2=Integer.parseInt(str.substring(3,5));
        if(checker==j)
            checker3=codeA[checker2-1];
        j++;
        if(checker==j)
            checker3=codeB[checker2-1];
        j++;
        if(checker==j)
            checker3=codeC[checker2-1];
        j++;
        if(checker==j)
            checker3=codeD[checker2-1];
        j++;
        if(checker==j)
            checker3=codeE[checker2-1];
        j++;
        if(checker==j)
            checker3=codeF[checker2-1];
        j++;
        if(checker==j)
            checker3=codeG[checker2-1];
        j++;
        if(checker==j)
            checker3=codeH[checker2-1];
        j++;
        if(checker==j)
            checker3=codeI[checker2-1];
        j++;
        if(checker==j)
            checker3=codeJ[checker2-1];
        j++;
        if(checker==j)
            checker3=codeK[checker2-1];
        j++;
        if(checker==j)
            checker3=codeL[checker2-1];
        j++;
        if(checker==j)
            checker3=codeM[checker2-1];
        j++;
        if(checker==j)
            checker3=codeN[checker2-1];
        j++;
        //System.out.println(checker3);
        checker4=Integer.parseInt(str.substring(0,2));
        System.out.print("THE DAY IS ");
        if(checker3==1)
        {
            for(int k=1;k<=31;k++)
            {
                if(checker4==k)
                {
                    if(checker4%7==0)
                        System.out.print("SUNDAY");
                    else if(checker4%7==1)
                        System.out.print("MONDAY");
                    else if(checker4%7==2)
                        System.out.print("TUESDAY");
                    else if(checker4%7==3)
                        System.out.print("WEDNESDAY");
                    else if(checker4%7==4)
                        System.out.print("THURSDAY");
                    else if(checker4%7==5)
                        System.out.print("FRIDAY");
                    else
                        System.out.print("SATURDAY");
                }
            }
        }
        if(checker3==2)
        {
            for(int k=1;k<=31;k++)
            {
                if(checker4==k)
                {
                    if(checker4%7==0)
                        System.out.print("MONDAY");
                    else if(checker4%7==1)
                        System.out.print("TUESDAY");
                    else if(checker4%7==2)
                        System.out.print("WEDNESDAY");
                    else if(checker4%7==3)
                        System.out.print("THURSDAY");
                    else if(checker4%7==4)
                        System.out.print("FRIDAY");
                    else if(checker4%7==5)
                        System.out.print("SATURDAY");
                    else 
                        System.out.print("SUNDAY");
                }
            }
        }
        if(checker3==3)
        {
            for(int k=1;k<=31;k++)
            {
                if(checker4==k)
                {
                    if(checker4%7==0)
                        System.out.print("TUESDAY");
                    else if(checker4%7==1)
                        System.out.print("WEDNESDAY");
                    else if(checker4%7==2)
                        System.out.print("THURSDAY");
                    else if(checker4%7==3)
                        System.out.print("FRIDAY");
                    else if(checker4%7==4)
                        System.out.print("SATURDAY");
                    else if(checker4%7==5)
                        System.out.print("SUNDAY");
                    else 
                        System.out.print("MONDAY");
                }
            }
        }
        if(checker3==4)
        {
            for(int k=1;k<=31;k++)
            {
                if(checker4==k)
                {
                    if(checker4%7==0)
                        System.out.print("WEDNESDAY");
                    else if(checker4%7==1)
                        System.out.print("THURSDAY");
                    else if(checker4%7==2)
                        System.out.print("FRIDAY");
                    else if(checker4%7==3)
                        System.out.print("SATURDAY");
                    else if(checker4%7==4)
                        System.out.print("SUNDAY");
                    else if(checker4%7==5)
                        System.out.print("MONDAY");
                    else 
                        System.out.print("TUESDAY");
                }
            }
        }
        if(checker3==5)
        {
            for(int k=1;k<=31;k++)
            {
                if(checker4==k)
                {
                    if(checker4%7==0)
                        System.out.print("THURSDAY");
                    else if(checker4%7==1)
                        System.out.print("FRIDAY");
                    else if(checker4%7==2)
                        System.out.print("SATURDAY");
                    else if(checker4%7==3)
                        System.out.print("SUNDAY");
                    else if(checker4%7==4)
                        System.out.print("MONDAY");
                    else if(checker4%7==5)
                        System.out.print("TUESDAY");
                    else 
                        System.out.print("WEDNESDAY");
                }
            }
        }
        if(checker3==6)
        {
            for(int k=1;k<=31;k++)
            {
                if(checker4==k)
                {
                    if(checker4%7==0)
                        System.out.print("FRIDAY");
                    else if(checker4%7==1)
                        System.out.print("SATURDAY");
                    else if(checker4%7==2)
                        System.out.print("SUNDAY");
                    else if(checker4%7==3)
                        System.out.print("MONDAY");
                    else if(checker4%7==4)
                        System.out.print("TUESDAY");
                    else if(checker4%7==5)
                        System.out.print("WEDNESDAY");
                    else
                        System.out.print("THURSDAY");
                }
            }
        }
        if(checker3==7)
        {
            for(int k=1;k<=31;k++)
            {
                if(checker4==k)
                {
                    if(checker4%7==0)
                        System.out.print("SATURDAY");
                    else if(checker4%7==1)
                        System.out.print("SUNDAY");
                    else if(checker4%7==2)
                        System.out.print("MONDAY");
                    else if(checker4%7==3)
                        System.out.print("TUESDAY");
                    else if(checker4%7==4)
                        System.out.print("WEDNESDAY");
                    else if(checker4%7==5)
                        System.out.print("THURSDAY");
                    else 
                        System.out.print("FRIDAY");
                }
            }
        }
    }
}    
