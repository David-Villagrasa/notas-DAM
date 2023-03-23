/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Excepcion.ErrorException;

/**
 *
 * @author Alumno
 */
public class SI {
    protected double [] examenes;
    protected int [] cantidad=new int[2];// [PRACTICAS,NOTAS]
    
    public SI (){
        
    }
    
    public SI (String [] examenes, String [] cantidad) throws ErrorException{
        setExamenes(examenes);
        setCantidad(cantidad);
    }

    private void setExamenes(String[] examenes) throws ErrorException {
        for (int i = 0; i < examenes.length; i++) {
            if(examenes[i]==null){
                throw new ErrorException("La nota no puede ser nulo");
            }
        }
    }

    private void setCantidad(String[] cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
