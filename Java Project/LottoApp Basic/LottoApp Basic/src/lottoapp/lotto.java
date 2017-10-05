package lottoapp;

public class lotto{

	//declare vars
	private int nums[] = new int[5];

	private int lnums[] = new int[5];

	private int myCorrectNumbers;
        private int num1;
        private int num2;
        private int num3;
        private int num4;
        private int num5;
	//constructor
	public lotto(){
            int randomNum;

            for (int i = 0; i < 5; i++) {
                randomNum = (int) ((47 * Math.random()) + 1);
                for (int x = 0; x < i; x++) {
                    if (lnums[x] == randomNum )
                    {
                        randomNum = (int) ((47 * Math.random()) + 1);
                        x = -1;
                    }

                }
                lnums[i] = randomNum;
            }
                
		myCorrectNumbers=0;
	}

	//set
	public void setLotto(int nums[]){
		for(int i=0; i<5; i++){
			this.nums[i]=nums[i];
		}
                num1 = lnums[0];
                num2 = lnums[1];
                num3 = lnums[2];
                num4 = lnums[3];
                num5 = lnums[4];
	}

	//compute
	public void checkNumbers(){
		for(int i=0; i<5;i++){
			if (nums[i]==lnums[0]||
				nums[i]==lnums[1]||
				nums[i]==lnums[2]||
				nums[i]==lnums[3]||
				nums[i]==lnums[4]){
                                
				myCorrectNumbers++;
			}
		}

	}

        public int getNum1(){
		return num1;
                
	}
        public int getNum2(){
		return num2;
                
	}
        public int getNum3(){
		return num3;
                
	}
        public int getNum4(){
		return num4;
                
	}
        public int getNum5(){
		return num5;
                
	}
	public int getMyCorrectNumbers(){
		return myCorrectNumbers;
                
	}




}
