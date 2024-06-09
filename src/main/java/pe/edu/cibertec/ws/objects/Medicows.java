//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 02:50:58 PM PET 
//


package pe.edu.cibertec.ws.objects;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para medicows complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="medicows"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdMedico" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomMedico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApeMedico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechNacMedico" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicows", propOrder = {
    "idMedico",
    "nomMedico",
    "apeMedico",
    "fechNacMedico"
})
public class Medicows {

    @XmlElement(name = "IdMedico")
    protected int idMedico;
    @XmlElement(name = "NomMedico", required = true)
    protected String nomMedico;
    @XmlElement(name = "ApeMedico", required = true)
    protected String apeMedico;
    @XmlElement(name = "FechNacMedico", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechNacMedico;

    /**
     * Obtiene el valor de la propiedad idMedico.
     * 
     */
    public int getIdMedico() {
        return idMedico;
    }

    /**
     * Define el valor de la propiedad idMedico.
     * 
     */
    public void setIdMedico(int value) {
        this.idMedico = value;
    }

    /**
     * Obtiene el valor de la propiedad nomMedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomMedico() {
        return nomMedico;
    }

    /**
     * Define el valor de la propiedad nomMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomMedico(String value) {
        this.nomMedico = value;
    }

    /**
     * Obtiene el valor de la propiedad apeMedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApeMedico() {
        return apeMedico;
    }

    /**
     * Define el valor de la propiedad apeMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApeMedico(String value) {
        this.apeMedico = value;
    }

    /**
     * Obtiene el valor de la propiedad fechNacMedico.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechNacMedico() {
        return fechNacMedico;
    }

    /**
     * Define el valor de la propiedad fechNacMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechNacMedico(XMLGregorianCalendar value) {
        this.fechNacMedico = value;
    }

}
