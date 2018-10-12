/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.week.pkg2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author MYWINDOWS
 */
public class TugasWeek2 {

    /**
     * @param args the command line arguments
     */
          public static void Tugas_1 (){
         Scanner Angka = new Scanner (System.in);
        int a;
        int b;
        int c;
    System.out.print("Nomor 1 = ");
    a = Angka.nextInt();
    System.out.print("Nomor 2 = ");
    b = Angka.nextInt();
    System.out.print("Nomor 3 = ");
    c = Angka.nextInt();
    System.out.println("Rata-rata = " + ((a+b+c)/3));
    }
    
    public static void Tugas2 (){
        
         String nomor1 = JOptionPane.showInputDialog("Nomor 1 = ");
         String nomor2 = JOptionPane.showInputDialog("Nomor 2 = ");
         String nomor3 = JOptionPane.showInputDialog("Nomor 3 = ");
   
                int n1 = Integer.parseInt(nomor1);
                int n2 = Integer.parseInt(nomor2);
                int n3 = Integer.parseInt(nomor3);
                
                int rata = (n1+n2+n3)/3;
                String msg = "Nomor 1 = " +n1+ " Nomor 2 = " +n2+ " Nomor 3 = " +n3+ " Rata-Rata = "+rata;
                JOptionPane.showMessageDialog(null, msg);
    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TugasWeek2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TugasWeek2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TugasWeek2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TugasWeek2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//                Tugas1();
        Tugas2();
    }
    
}
