package pe.edu.cibertec.soap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.*;

import java.util.List;

@Endpoint
public class medicoEndPoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private pe.edu.cibertec.soap.repository.medicoRepository medicoRepository;


    @Autowired
    private pe.edu.cibertec.soap.convert.medicoConvert medicoConvert;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMedicosRequest")
    @ResponsePayload
    public GetMedicosResponse getMedicos(@RequestPayload GetMedicosRequest request){
        GetMedicosResponse response = new GetMedicosResponse();
        List<Medicows> medicowsList = medicoConvert
                .convertMedicoToMedicoWs(medicoRepository.findAll());
        response.getMedicos().addAll(medicowsList);

        return response;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMedicoRequest")
    @ResponsePayload
    public GetMedicoResponse getMedicoXId(@RequestPayload GetMedicoRequest request){
        GetMedicoResponse response = new GetMedicoResponse();

        Medicows medicows = medicoConvert
                .convertMedicoToMedicoWs(medicoRepository.findById(request.getId()).get());

        response.setMedico(medicows);

        return response;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postMedicoRequest")
    @ResponsePayload
    public PostMedicoResponse postPaciente(@RequestPayload PostMedicoRequest request){
        PostMedicoResponse response = new PostMedicoResponse();

        Medicows medicows = medicoConvert
                .convertMedicoToMedicoWs(medicoRepository.save(medicoConvert.convertMedicoWsToMedico(request.getMedico())));

        response.setMedico(medicows);

        return response;
    }

}
