//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 06:27:21 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="notaeliminada" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="promedio" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notaeliminada",
    "promedio"
})
@XmlRootElement(name = "GetPromedioResponse")
public class GetPromedioResponse {

    protected double notaeliminada;
    protected double promedio;

    /**
     * Obtiene el valor de la propiedad notaeliminada.
     * 
     */
    public double getNotaeliminada() {
        return notaeliminada;
    }

    /**
     * Define el valor de la propiedad notaeliminada.
     * 
     */
    public void setNotaeliminada(double value) {
        this.notaeliminada = value;
    }

    /**
     * Obtiene el valor de la propiedad promedio.
     * 
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * Define el valor de la propiedad promedio.
     * 
     */
    public void setPromedio(double value) {
        this.promedio = value;
    }

}
