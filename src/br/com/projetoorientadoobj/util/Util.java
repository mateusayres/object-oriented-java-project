package br.com.projetoorientadoobj.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    
    public static String getDataPtBr(Date data) {
        String dataFormatada = null;
        
        SimpleDateFormat formatafor = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        dataFormatada = formatafor.format(data);
        
        return dataFormatada;
    } 
    
}
