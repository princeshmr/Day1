class SumCMD{

   public static void main(String args[]){
  
        int n,cnt=0,sum=0;
        for(int i=0;i<args.length;i++){
             try{
                   n=Integer.parseInt(args[i]);
                   sum=sum+n;
                }
             catch (NumberFormatException e){
                        cnt++;
                }
        }
        System.out.println("Sum of command-line "+sum);
        System.out.println("Invalid Integer "+cnt);
   }

}