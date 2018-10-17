// package game;

import java.util.*;

public class BeanMachine {
    private int n ;
    private int balls;
    private int[] slots;

    // accessor  mutator ;
    public BeanMachine(){
      Scanner input = new Scanner(System.in) ;
      while(true) {
      System.out.println("请输入小球的数量和层数：");
      balls = input.nextInt() ;
      n = input.nextInt() ;
      slots = new int[n];

      simulate() ;
      output1();

      output();
       } 
    }   

    void simulate() {
       for(int i=0 ;i <balls ;i++) {
            System.out.println() ;
            int r = 0;
            for(int j =0 ; j<n ;j++) {
                int chance = (int) (Math.random()*2);
                if(chance==1){
                     System.out.print("R"); r++;
                 }
                 else {
                     System.out.print("L");
                  }
             }
             slots[r]++;
        } 
        System.out.println('\n');
    }

    public void output1() {
        for(int i=0;i<slots.length; i++)  {
             for(int j =0 ; j<slots[i] ;j++) {
                 System.out.print("O"); 
             }
             System.out.println();
         }
    }  

    public void output()
    {
    	for(int j=balls;j>0;j--)
    	{
    		for(int i=0;i<slots.length;i++)
    		{
    			if(slots[i]==j)
    			{
    				System.out.print("O");
    				slots[i]--;
    			}
    			else
    			{
    				System.out.printf(" ");
    			}
    		}
    		System.out.println();
    	}
    }

    public static void main(String[] args) {
         BeanMachine bm = new BeanMachine() ;
         
    } 
}