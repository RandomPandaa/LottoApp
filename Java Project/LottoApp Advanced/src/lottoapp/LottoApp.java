/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottoapp;

/**
 *
 * @author tomxb
 */
import static java.time.Clock.system;
import javax.swing.JOptionPane;
public class LottoApp{
	public static void main(String args[]){

	//declare vars
	int nums[]=new int[5];

	int lnums[]= new int[5];
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;       
	int myCorrectNumbers;

	//declare objects
	lotto l;
	l=new lotto();
        lotto l2;
	l2=new lotto();
        lotto l3;
	l3=new lotto();
	//input
	for(int i=0; i<5; i++){
            
            if (i<1){
                JOptionPane.showMessageDialog(null, "You are about to play draw no 1");
                nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your first lotto number"));
                
            }else{
                    if (i<2) {
                    nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your second lotto number"));

                }else{
                      if(i<3){
                        nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your third lotto number"));

                    }else{
                            if (i<4){
                            nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your fourth lotto number"));

                        }else{
                            if (i<5){
                                nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your final lotto number"));

                            }else{ 
                    }
                
                }

                
                }
                
                }
                
            }
            
	 	
	}

	//set guesses
	l.setLotto(nums);

	//compute
	l.checkNumbers();

	//get amount of correct answers
	myCorrectNumbers=l.getMyCorrectNumbers();
        num1=l.getNum1();
        num2=l.getNum2();
        num3=l.getNum3();
        num4=l.getNum4();
        num5=l.getNum5();
	//output
	int selectedOption = JOptionPane.showConfirmDialog(null,"Draw no 1: you got " + myCorrectNumbers + " correct. The lotto numbers were " + num1 + ", " + num2 + ", " + num3 + ", "+ num4 + ", "+ num5 + ". Would you like to play in draw no 2!");
        if (selectedOption == JOptionPane.YES_OPTION) {
            
        }else{
            System.exit(0);
        }
        //input
	for(int i=0; i<5; i++){
            
            if (i<1){
                JOptionPane.showMessageDialog(null, "You are about to play draw no 2");
                nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your first lotto number"));
                
            }else{
                    if (i<2) {
                    nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your second lotto number"));

                }else{
                      if(i<3){
                        nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your third lotto number"));

                    }else{
                            if (i<4){
                            nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your fourth lotto number"));

                        }else{
                            if (i<5){
                                nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your final lotto number"));

                            }else{ 
                    }
                
                }

                
                }
                
                }
                
            }
            
	 	
	}

	//set guesses
	l2.setLotto(nums);

	//compute
	l2.checkNumbers();

	//get amount of correct answers
	myCorrectNumbers=l2.getMyCorrectNumbers();
        num1=l2.getNum1();
        num2=l2.getNum2();
        num3=l2.getNum3();
        num4=l2.getNum4();
        num5=l2.getNum5();
	//output
	int selectedOption2 = JOptionPane.showConfirmDialog(null,"Draw no 2: you got " + myCorrectNumbers + " correct. The lotto numbers were " + num1 + ", " + num2 + ", " + num3 + ", "+ num4 + ", "+ num5 + ". Would you like to play in draw no 3!");
        if (selectedOption2 == JOptionPane.YES_OPTION) {
            
        }else{
            System.exit(0);
        }
        //input
	for(int i=0; i<5; i++){
            
            if (i<1){
                JOptionPane.showMessageDialog(null, "You are about to play draw no 3");
                nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your first lotto number"));
                
            }else{
                    if (i<2) {
                    nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your second lotto number"));

                }else{
                      if(i<3){
                        nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your third lotto number"));

                    }else{
                            if (i<4){
                            nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your fourth lotto number"));

                        }else{
                            if (i<5){
                                nums[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your final lotto number"));

                            }else{ 
                    }
                
                }

                
                }
                
                }
                
            }
            
	 	
	}

	//set guesses
	l3.setLotto(nums);

	//compute
	l3.checkNumbers();

	//get amount of correct answers
	myCorrectNumbers=l3.getMyCorrectNumbers();
        num1=l3.getNum1();
        num2=l3.getNum2();
        num3=l3.getNum3();
        num4=l3.getNum4();
        num5=l3.getNum5();
	//output
	int selectedOption3 = JOptionPane.showConfirmDialog(null,"Draw no 3: you got " + myCorrectNumbers + " correct. The lotto numbers were " + num1 + ", " + num2 + ", " + num3 + ", "+ num4 + ", "+ num5 + ". Would you like to play again!");
        if (selectedOption3 == JOptionPane.YES_OPTION) {
            LottoApp.main(args);
        }else{
            System.exit(0);
        }
	}
        
}