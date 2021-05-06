package pongesort;
import java.util.*;
public class PongeSort{
    public static int[] array;
    public static int l, max, count;
    public static void fillArray(){
        array = casualInt();
        order();
        print();
    }
    public static void print(){;
	    for(int s=0; s<array.length; s++)
            System.out.print(array[s]+" ");
        System.out.println("\ncounts: "+count);
    }
    public static int [] casualInt(){
    	for(int i=0; i<l; i++)
            array[i]=(int)(Math.random()*(max+1));
        return array;
    }
    public static void order(){
        boolean ordered;
        int keep;
        do{
            int c = (int)(Math.random()*(array.length));
            for(int i=0; i<array.length; i++){
                keep = array[c];
                array[c] = array[i];
                array[i] = keep;
            }
            count++;
            ordered = checkOrder();
        }while(!ordered);
    }
    public static boolean checkOrder(){
        boolean ordered=true;
        for(int i=0; i<array.length-1; i++){
            if(array[i]>array[i+1])
                ordered=false;
        }
        return ordered;
    }
    /* this shows how many times a number has appeared in the array
    public static int research(int search){
        int countSearches = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]==search)
                countSearches++;
        }
        return countSearches;
    }
    public static void countNumbers(){
        int countSearches;
        for(int i=0; i<max+1; i++){
            countSearches=research(i);
            System.out.println(i+" is present "+countSearches+" times");
        }
    }*/
    public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("how long should the array be? ");
	    l = sc.nextInt();
        System.out.print("what should be the maximum value of the numbers that make up the array? ");
        max = sc.nextInt();
	    array = new int[l];
	    fillArray();
        //countNumbers();
    }
}


