class  Prime
{
	public static void main(String[] args) 
	{
		int n=100;
		int howmany=0;
	  outer:for(int i=2;i<=n;i++){
				int count = 0;
				for(int j=2;j<i;j++){
					if(i%j==0)
						count++;
				}
				if(count==0){
					System.out.println(i+" ");
					howmany=howmany+1;
					//System.out.println("Hello World!");
				}
				if(howmany==10){
					break outer;
			}
		}
	}
}
