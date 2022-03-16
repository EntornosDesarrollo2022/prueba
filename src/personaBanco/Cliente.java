

package personaBanco;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/* La interface Serializable no tiene métodos, pero es necesario implementarla pues el método writeObject de 
   la clase ObjetOutputStream recibe como  argumento un objeto "Serializable"
*/
public class Cliente extends Persona{
    
    private boolean vip;

    public Cliente(String aNombre, String aApellidos, String aDireccion, String aLocalidad, LocalDate aFNacimiento, boolean vip) {
        super(aNombre, aApellidos, aDireccion, aLocalidad, aFNacimiento);
        this.vip = vip;
    }
    //usado para mostrar parte de los datos del cliente
    
    
            
    public String direccionCompleta() { return getDireccion() + ", " + getLocalidad(); }


    /**
     * @return the vip
     */
    public boolean isVip() {
        return vip;
    }

    /**
     * @param vip the vip to set
     */
    public void setVip(boolean vip) {
        this.vip = vip;
    }

}
