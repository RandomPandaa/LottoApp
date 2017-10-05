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
        int counter= '0';
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

	//input
	for(int i=0; i<5; i++){
            if (i<1){
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
	int selectedOption = JOptionPane.showConfirmDialog(null,"you got " + myCorrectNumbers + " correct. The lotto numbers were " + num1 + ", " + num2 + ", " + num3 + ", "+ num4 + ", "+ num5 + ". Would you like to play again!");
        if (selectedOption == JOptionPane.YES_OPTION) {
            LottoApp.main(args);
        }else{
            System.exit(0);
        }

	}
}