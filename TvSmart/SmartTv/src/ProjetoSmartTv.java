

import java.util.Scanner;//

import SmartTV.SmartTV;

public class ProjetoSmartTv {
    public static void main(String[] args){
        Scanner escolhar= new Scanner(System.in);
        SmartTV lg = new SmartTV();
        lg.ligaDesligar=false;
        lg.canal= 1;
        lg.volume = 25;
        
        System.out.println("Deseja ligar a Tv?");
        String ligar = "1";
        if(ligar=="1"){
            lg.ligaDesligar=true;
                System.out.println("A Tv esta ligada  "+ lg.ligaDesligar);
            } else{
                    System.out.println("A Tv esta Deligada   "+ lg.ligaDesligar);}
    switch (lg.canal=escolhar.nextInt()) {
        case 5:
            System.out.println("Canal escolhido foi " + lg.canal);
            break;
    
        default:
            break;
    }
                }
    }
    

