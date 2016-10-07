import javax.swing.JOptionPane;
import javax.swing.JTextArea;

class Payroll{
    public static void main (String args[]){
        String yourName; //employee's name
        double payRate; //floating point number
        int hours; //whole number
        double taxRate; //% of tax paid - floating point number
        double insRate; //social insurance paid - floating point
        double grossPay, taxPaid, prsiPaid, netPay, totalDeduct;
        
        // Employee name
        yourName = JOptionPane.showInputDialog("Enter the your name");
 
        // pay rate
        String payRateInput = JOptionPane.showInputDialog("Enter your Hourly Pay Rate");
        payRate = Double.parseDouble(payRateInput); // parse user Hours input from String to floating number
        
        //hours worked
        String hoursInput = JOptionPane.showInputDialog("Enter Hours worked");
        hours = Integer.parseInt(hoursInput); // parse user Hours input from String to whole number
        
        // % tax paid
        String taxRateInput = JOptionPane.showInputDialog("Enter your Tax Rate");
        taxRate = Double.parseDouble(taxRateInput);
        taxRate = taxRate/100;
        
        // amount of social insurance paid
        String insRateInput = JOptionPane.showInputDialog("Enter your PRSI Rate");
        insRate = Double.parseDouble(insRateInput);
        insRate = insRate/100;
        
        /*
        grossPay = payRate*hours; //gross pay before tax
        taxPaid = taxRate*grossPay; //taxes to be paid from Pay
        prsiPaid = insRate*grossPay; //PRSI to be paid from Pay
        totalDeduct = taxPaid + prsiPaid;
        netPay = grossPay - totalDeduct;
        */
        
        grossPay = payRate*hours; //gross pay before tax
        taxPaid = 20;
        prsiPaid = 15;
        totalDeduct = taxPaid + prsiPaid;
        netPay = grossPay - totalDeduct;
        String output = ("===================== \n" +
                        "Employee Name : " + yourName + "\n"
                        + "Hours Worked : " + hours + "\n"
                        + "Hourly Rate : " + payRate + "\n"
                        + "Gross Pay : " + grossPay +
                        "\n\n" +
                        "Deductions"
                        + "\t Tax Paid : " + taxPaid + "\n"
                        + "\t PRSI Paid : " + prsiPaid +"\n"
                        + "\n Total Deductions : " + totalDeduct + "\n"
                        + "\n\n" +
                        "Net Pay : " + netPay
                        + "\n====================="
                        
                );
        
        JTextArea txt = new JTextArea(output);
        txt.setEditable(false);
        JOptionPane.showMessageDialog(null, txt);
        
        System.exit(0);
    }
}