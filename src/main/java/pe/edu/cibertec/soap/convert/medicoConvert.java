package pe.edu.cibertec.soap.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.soap.model.medico;
import pe.edu.cibertec.ws.objects.Medicows;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Component
public class medicoConvert {


    private Date convertXMLGregorianCalendarToDate(XMLGregorianCalendar xmlGregorianCalendar) {
        if (xmlGregorianCalendar == null) {
            return null;
        }
        return xmlGregorianCalendar.toGregorianCalendar().getTime();
    }

    private XMLGregorianCalendar convertDateToXMLGregorianCalendar(Date date) {
        if (date == null) {
            return null;
        }

        try {
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
            return null;
        }
    }

    public medico convertMedicoWsToMedico(Medicows medicows) {
        medico medico = new medico();

        medico.setIdmedico(medicows.getIdMedico());
        medico.setNommedico(medicows.getNomMedico());
        medico.setApeme(medicows.getApeMedico());
        Date fechaNacimiento = convertXMLGregorianCalendarToDate(medicows.getFechNacMedico());
        medico.setFechnac(fechaNacimiento);

        return medico;
    }

    public Medicows convertMedicoToMedicoWs(medico medico) {
        Medicows medicows = new Medicows();

        medicows.setIdMedico(medico.getIdmedico());
        medicows.setNomMedico(medico.getNommedico());
        medicows.setApeMedico(medico.getApeme());
        XMLGregorianCalendar fechaNacimiento = convertDateToXMLGregorianCalendar(medico.getFechnac());
        medicows.setFechNacMedico(fechaNacimiento);

        return medicows;
    }

    public List<medico> convertMedicoWsToMedico(List<Medicows> pacientewsList) {
        List<medico> pacienteList = new ArrayList<>();
        for (Medicows medicows : pacientewsList) {
            pacienteList.add(convertMedicoWsToMedico(medicows));
        }
        return pacienteList;
    }

public List<Medicows> convertMedicoToMedicoWs(List<medico> medicos) {
        List<Medicows> medicowsList = new ArrayList<>();
        for (pe.edu.cibertec.soap.model.medico medico : medicos) {
            medicowsList.add(convertMedicoToMedicoWs(medico));
        }
        return medicowsList;
    }



}
