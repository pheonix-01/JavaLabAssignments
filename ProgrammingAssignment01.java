class SY2022bit008
{
    public static void main(String args[])
    {
    	String reg_no[]={"2020BIT151","2022BEC025" ,"2017BCE013" ,"2018BME045", "2022BIT110" ,"2010BCS079","2023BCH001","2022BTT031" ,"2020BPR021", "2022BCS011"};
        int validCount=getValidRegistrationsCount(reg_no);
        System.out.println("Total No. of Valid Registration Numbers=" + validCount);
    }
    
    public static int getValidRegistrationsCount(String[] reg_no)
    {
        int i,count=0;
        boolean c;
        for(i=0;i<10;i++)
        {
            c=ValidRegNumber(reg_no[i]);
            if(c==true)
                count++;
        }
        return count;
    }
    
    public static boolean ValidRegNumber(String str)
    {
        String reg=str.substring(4,7);
        if(reg.equals("BIT") || reg.equals("BME") || reg.equals("BCS") || reg.equals("BCH"))
            return true;
        else
            return false;
    }
}
