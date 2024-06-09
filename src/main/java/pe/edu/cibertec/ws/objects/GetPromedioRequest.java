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
 *         &lt;element name="nota1" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="nota2" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="nota3" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="nota4" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "nota1",
    "nota2",
    "nota3",
    "nota4"
})
@XmlRootElement(name = "GetPromedioRequest")
public class GetPromedioRequest {

    protected double nota1;
    protected double nota2;
    protected double nota3;
    protected double nota4;

    /**
     * Obtiene el valor de la propiedad nota1.
     * 
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * Define el valor de la propiedad nota1.
     * 
     */
    public void setNota1(double value) {
        this.nota1 = value;
    }

    /**
     * Obtiene el valor de la propiedad nota2.
     * 
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * Define el valor de la propiedad nota2.
     * 
     */
    public void setNota2(double value) {
        this.nota2 = value;
    }

    /**
     * Obtiene el valor de la propiedad nota3.
     * 
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * Define el valor de la propiedad nota3.
     * 
     */
    public void setNota3(double value) {
        this.nota3 = value;
    }

    /**
     * Obtiene el valor de la propiedad nota4.
     * 
     */
    public double getNota4() {
        return nota4;
    }

    /**
     * Define el valor de la propiedad nota4.
     * 
     */
    public void setNota4(double value) {
        this.nota4 = value;
    }

}
