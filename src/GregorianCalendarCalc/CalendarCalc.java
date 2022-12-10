/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GregorianCalendarCalc;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author nil_b
 */
public class CalendarCalc {
    private String resultado = "";
    private Date data1;
    private Date data2;
    private Boolean ordemDoTempo;
    
    public String calcDays(Date data1User, Date data2User){
    
        data1 = data1User;
        data2 = data2User;
        GregorianCalendar greg1 = new GregorianCalendar();
        GregorianCalendar greg2 = new GregorianCalendar();
        greg1.setTime(data1);
        greg2.setTime(data2);
     
     
   if(greg2.before(greg1))
   {
      resultado= "";

      long d1 = data1.getTime();
      long d2 = data2.getTime();
      long milisseeg = d1 - d2 ;
      long dias = (long) (milisseeg/1000/60/60/24);

      String diasString  = String.valueOf(dias);
    // 
      resultado = "Faltam: "+diasString+" dias para o vencimento.";
      
      limpa();
   }

     else if(greg2.after(greg1))
     {
       resultado = "";

      long d1 = data1.getTime();
      long d2 = data2.getTime();
      long milisseeg = d2 - d1 ;
      long dias = (long) (milisseeg/1000/60/60/24);

      String diasString  = String.valueOf(dias);
        resultado = "Vencido à: "+diasString+" dias.";
    limpa();
}
   return resultado;
    }
   
    public void limpa()
    {

     data1 = null;
     data2 = null;

    }
    
    
}
