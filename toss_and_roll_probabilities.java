import java.util.*;
class toss_and_roll_probabilities
{
    public static void main(String args[])
    {
        int choice,totprob; //to make choice between coin or dice,total number of probabilities in either cases
        Random ra=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1 WHETHER YOU WANT TO TOSS A COIN OR 2 WHETHER YOU WANT TO ROLL A DICE");
        choice=sc.nextInt();
        if(choice==1)
        {
            int noc,m=0,n=0; //no of coins,an incrementing variable for checking whether the random value generated is already generated or not,an incrementing variable which provides with correct positions for the values to be stored in arr1[]
            String prob=""; //for storing the random probability value generated at every instance
            System.out.println("ENTER THE NUMBER OF COINS THAT YOU WANT TO TOSS");
            noc=sc.nextInt();   
            totprob=(int)Math.pow(2,noc);
            System.out.println("THE TOTAL NUMBER OF OUTCOMES ARE "+totprob);
            System.out.println("THOSE ARE:");
            int arr[]=new int[noc]; //for storing the random integer value generated which decides the random probability value in prob
            String arr1[]=new String[totprob]; //for storing all possible outcomes
            arr1[0]=" ";
            while(totprob>0)
            {
                for(int i=0;i<noc;i++)
                {
                    arr[i]=ra.nextInt(2);
                    if(arr[i]==0)
                    {
                        prob=prob+"HEADS ";
                    }
                    else
                    {
                        prob=prob+"TAILS ";
                    }
                }
                for(int i=0;i<=((int)Math.pow(2,noc)-totprob);i++)
                {
                    if(prob.equalsIgnoreCase(arr1[i]))
                    {
                        m++;
                    }
                }
                if(m==0)
                {
                    arr1[n]=prob;
                    totprob--;
                    n++;
                }
                prob="";
                m=0;
            }
            for(int i=0;i<(int)Math.pow(2,noc);i++)
            {
                System.out.println(arr1[i]);
            }
        }
        else if(choice==2)
        {
            int nod,prob=0,po,m=0,n=0,str=18; //no of dice,for storing the random probability value generated at every instance,a decrementing variable providing powers for 10 which gets initialized with a number equal to the no. of dice in every itteration,m&n same funtions above,a decrementing variable for giving the output in a rectangular struture
            System.out.println("ENTER THE NUMBER OF DICE THAT YOU WANT TO ROLL");
            nod=sc.nextInt();
            totprob=(int)Math.pow(6,nod);
            System.out.println("THE TOTAL NUMBER OF OUTCOMES ARE "+totprob);
            System.out.println("THOSE ARE:");
            int arr[]=new int[nod],arr1[]=new int[totprob]; //arr[]&arr1[] same fucntions above
            arr1[0]=7;
            while(totprob>0)
            {
                for(int i=0;i<nod;i++)
                {
                    arr[i]=ra.nextInt(6)+1;
                }
                po=nod;
                for(int i=0;i<nod;i++)
                {
                    prob=prob+arr[i]*(int)Math.pow(10,po-1);
                    po--;
                }
                for(int i=0;i<=((int)Math.pow(6,nod)-totprob);i++)
                {
                    if(prob==arr1[i])
                    {
                        m++;
                    }
                }
                if(m==0)
                {
                    arr1[n]=prob;
                    totprob--;
                    n++;
                }
                prob=0;
                m=0;
            }
            for(int i=0;i<(int)Math.pow(6,nod);i++)
            {
                System.out.print(arr1[i]+" ");
                str--;
                if(str==0)
                {
                    System.out.println();
                    str=18;
                }
            }
        }
        else
        System.out.println("Wrong input, ENTER AGAIN!!");
    }
} 

