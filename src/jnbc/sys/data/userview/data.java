
 /**
 *
* @author NILDO BUENO CORREIA FILHO 
 * NB- DESENVOLVIMENTO DE SISTEMAS
 * EMAIL: nildobuenog2@gmail.com
 * 
 * Created on 03/05/2011, 03:20:27
 */

package jnbc.sys.data.userview;

import java.util.Date;
import java.text.SimpleDateFormat;
public class data
{
        
     public  String mes, dia, ano, dia_semana, hora;
        SimpleDateFormat horaformatada = new SimpleDateFormat ("HH:mm:ss");
        
        
        public void le_hora()
        {
        
        Date horaAtual = new Date();
        hora = horaformatada.format(horaAtual);
        
        }
        
        
        public void le_data()
        {
            Date data = new Date();
            
            mes = ""+data.getMonth();// 0 a 11
            dia = ""+data.getDate();
            ano = ""+(1900 + data.getYear());
            dia_semana = ""+data.getDay();
            
            
            switch (data.getDay())
            {
                case 0 : dia_semana = "Domingo";break;
                case 1 : dia_semana = "Segunda-Feira";break;
                case 2 : dia_semana = "Terça-Feira";break;
                case 3 : dia_semana = "Quarta-Feira";break;
                case 4 : dia_semana = "Quinta-Feira";break;
                case 5 : dia_semana = "Sexta-Feira";break;
                case 6 : dia_semana = "Sabado";break;
            }
            
            
            switch (data.getMonth())
            {  
              case 0 : mes = "Janeiro";break;
              case 1 : mes = "Fevereiro";break;
              case 2 : mes = "Mar�o";break;
              case 3 : mes = "Abril";break;
              case 4 : mes = "Maio";break;
              case 5 : mes = "Junho";break;
              case 6 : mes = "Julho";break;
              case 7 : mes = "Agosto";break;
              case 8 : mes = "Setembro";break;
              case 9 : mes = "Outubro";break;
              case 10 : mes = "Novembro";break;
              case 11 : mes = "Dezembro";break; 
            }
        }

}
