//中国税率算法
import java.util.Scanner;


 class ChineseIndividualIncomeTax
{
	private  double gongzi;
	private  double shuihougongzi;


	public ChineseIndividualIncomeTax(double a)
	{

		gongzi = a;
		shuihougongzi = 0;
                Count();
		printRE();

	}
	public void printRE()
    {
        System.out.println("从2018年10月1日起，个人起征点按照5000计算");
        System.out.println("计算公式：");
        System.out.println("应纳税所得额 = 工资收入金额 － 各项社会保险费 － 起征点(5000元)");
        System.out.println("应纳税额 = 应纳税所得额 x 税率 － 速算扣除数");
        System.out.println("_________________________________________");
        System.out.println("各项社会保险费具体金额为：");
        System.out.println("养老保险金：8%");
        System.out.println("医疗保险金：2%");
        System.out.println("失业保险金：1%");
        System.out.println("住房公积金：5%");
        System.out.println();
    }

	double getGongzi()
	{
		return gongzi;
	}
	double getshuihougongzi()
	{
		return shuihougongzi;
	}
       
	public double Count()  
	{
			double one = gongzi-gongzi*0.16-5000;                     
			double tax = 0;
			double k = 0;
			if(one>0&&one<=3000)
            {
                tax = one*0.03;
            }else if(one>0&&one<=12000)
            {
                tax = (one-3000)*0.10-210+3000*0.03;
                k+=210;
            }else if(one>0&&one<=25000)
            {
                tax = (one-12000)*0.2-1410+(12000-3000)*0.1-210+3000*0.03-0;
                k+=1410+210;
            }else if(one>0&&one<=35000)
            {
                tax = (one-25000)*0.25-2660+13000*0.2-1410+9000*0.1-210+3000*0.03-0;
                k+=2660+1410+210;
            }else if(one>0&&one<=55000)
            {
                tax = (one-35000)*0.3-4410+10000*0.25-2660+13000*0.2-1410+9000*0.1-210+3000*0.03-0;
                k+=4410+2660+1410+210;

            }else if(one>0&&one<=80000)
            {
                tax = (one-55000)*0.35-7160+20000*0.3-4410+10000*0.25-2660+13000*0.2-1410+9000*0.1-210+3000*0.03-0;
                k+=7160+4410+2660+1410+210;
            }else if(one>80000)
            {
                tax = (one-80000)*0.45-15160+25000*0.35-7160+20000*0.3-4410+10000*0.25-2660+13000*0.2-1410+9000*0.1-210+3000*0.03-0;
                k+=15160+7160+4410+2660+1410+210;
            }
            shuihougongzi = gongzi-tax-gongzi*0.16-k;   
            return tax+k;
	}
    

}
//美国税率算法
 class ComputerTax {
    //danshenshuishou
    private double singleFilersTax = 0;
    //yihungongtonghuogongtongzhengshiguangashuishou 
    private double marridFilingJointlyOrQualifyingTax = 0;
    //yihundandushuishou
    private double marridFilingSeparatelyTax = 0;
    //jiatinghuzhunashui
    private double headOfHouseHoldTax = 0;
    //shouru
    private double income = 0;
    public ComputerTax(double income){
        this.income = income;
    }
    //dedaodanshenshuishou
    public double getsingleFilersTax(){
        if(income <= 8350)
            singleFilersTax =  income * 0.1;
        else if(income <= 33950)
            singleFilersTax = 8350 *  0.1 + (income - 8350) * 0.15;
        else if(income <= 52250)
            singleFilersTax = 8350 *  0.1 + (33950 - 8350) * 0.15 
                    + (income -33950) * 0.25;
        else if(income <= 171550)
            singleFilersTax = 8350 *  0.1 + (33950 - 8355) * 0.15 
                    + (52250 -33950) * 0.25 + (income -52250) * 0.28;
        else if(income <= 372950)
            singleFilersTax = 8350 *  0.1 + (33950 - 8355) * 0.15 
                    + (52250 -33950) * 0.25 + (171550 -52250) * 0.28 
                    + (income - 171550) * 0.33;
        else
            singleFilersTax = 8350 *  0.1 + (33950 - 8355) * 0.15 
                    + (52250 -33950) * 0.25 + (171550 -52250) * 0.28 
                    + (327950 - 171550) * 0.33 + (income - 372950) * 0.35;
        return singleFilersTax;
    }
    //dedaoyihungongtonghuogongtongzhengshiguangashuishou
    public double getmarridFilingJointlyOrQualifyingTax(){ 
        if(income <= 16700)
            marridFilingJointlyOrQualifyingTax = income * 0.1;
        else if(income <= 67900)
            marridFilingJointlyOrQualifyingTax = 16700 * 0.1 
                    + (income - 16700) * 0.15;
        else if(income <= 137050)
            marridFilingJointlyOrQualifyingTax = 16700 * 0.1 
                    + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
        else if(income <= 208850)
            marridFilingJointlyOrQualifyingTax = 16700 * 0.1 
                    + (67900 - 16700) * 0.15 + (137050 - 37900) * 0.25 
                    + (income - 137050) * 0.28;
        else if(income <= 372950 )
            marridFilingJointlyOrQualifyingTax = 16700 * 0.1 
                    + (67900 - 16700) * 0.15+ (137050 - 37900) * 0.25 
                    + (208850 - 137050) * 0.28 + (income - 208850) * 0.33;
        else
            marridFilingJointlyOrQualifyingTax = 16700 * 0.1 
                    + (67900 - 16700) * 0.15 + (137050 - 37900) * 0.25 
                    + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 
                    + (income - 372950) * 0.35;
        return marridFilingJointlyOrQualifyingTax;
    }
    //dedaoyihundandushuishou
    public double getmarridFilingSeparatelyTax(){
        if(income <= 8350)
            marridFilingSeparatelyTax = income * 0.1;
        else if(income <= 33950)
            marridFilingSeparatelyTax = 8350 * 0.1 + (income - 8350) * 0.15;
        else if(income <= 68525)
            marridFilingSeparatelyTax = 8350 * 0.1 + (33950 - 8350) * 0.15 
                    + (income - 33950) * 0.25;
        else if(income <= 104425)
            marridFilingSeparatelyTax = 8350 * 0.1 + (33950 - 8350) * 0.15
                    + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
        else if(income <= 186475 )
            marridFilingSeparatelyTax = 8350 * 0.1 + (33950 - 8350) * 0.15
                    + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 
                    + (income - 104425) * 0.33;
        else
            marridFilingSeparatelyTax = 8350 * 0.1 + (33950 - 8350) * 0.15
                    + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 
                    + (186475 - 104425) * 0.33 + (income - 186475);
        return marridFilingSeparatelyTax;
    }
    //dedao
    public double getheadOfHouseHoldTax(){
        if(income <= 11950)
            headOfHouseHoldTax = income * 0.1;
        else if(income <= 45500)
            headOfHouseHoldTax = 11950 * 0.1 + (income - 11950) * 0.15;
        else if(income <= 117450)
            headOfHouseHoldTax = 11950 * 0.1 + (45500 - 11950) * 0.15 
                    + (income - 45500) * 0.25;
        else if(income <= 190200)
            headOfHouseHoldTax = 11950 * 0.1 + (45500 - 11950) * 0.15 
                    + (117450 - 33950) * 0.25 + (income - 117450) * 0.28;
        else if(income <= 372950)
            headOfHouseHoldTax = 11950 * 0.1 + (45500 - 11950) * 0.15 
                    + (117450 - 33950) * 0.25 + (190200 - 117450) * 0.28 
                    + (income - 190200) * 0.33;
        else
            headOfHouseHoldTax = 11950 * 0.1 + (45500 - 11950) * 0.15 
                    + (117450 - 33950) * 0.25 + (190200 - 117450) * 0.28 
                    + (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
        return headOfHouseHoldTax;
    }
}

//测试比较

public class ComputerTaxTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Scanner input = new Scanner(System.in);
      System.out.println("please input your saraly:(请输入你的工资)单位为美元");
      double salary = input.nextInt();
      System.out.print("你的工资为：");
      System.out.printf("%.3f dallor,折合人民币 %.3f yuan\n\n\n",salary,salary*6.9017);
      ComputerTax USA = new ComputerTax(salary);
      ChineseIndividualIncomeTax China = new ChineseIndividualIncomeTax(salary*6.9017);
      System.out.println("In China you should pay  " + China.Count() 
              + " for tax"+"折合美元为"+China.Count()/6.9017);
      System.out.println("In  USA  If you are singleFilers you should pay " 
              + USA.getsingleFilersTax());
      System.out.println("In  USA  If you are marridFilingJointlyOrQualifying"
              + " you should pay " + USA.getmarridFilingJointlyOrQualifyingTax());
      System.out.println("In  USA  If you are marridFilingSeparately you"
              + " should pay " + USA.getmarridFilingSeparatelyTax());
      System.out.println("In  USA  If you are headOfHouseHold you should pay " 
              + USA.getheadOfHouseHoldTax());
    }
    
}