package pe.edu.cibertec.soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.*;

import java.util.Arrays;


@Endpoint
public class calculoEndPoint {


    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetHoraTrabajoRequest")
    @ResponsePayload
    public GetHoraTrabajoResponse getHoraTrabajo(@RequestPayload GetHoraTrabajoRequest request){
        double horasTrabajadas = request.getHora();
        double salario = calcularSalario(horasTrabajadas);

        GetHoraTrabajoResponse response = new GetHoraTrabajoResponse();
        response.setSalario(salario);

        return response;

    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetSegundosRequest")
    @ResponsePayload
    public GetSegundosResponse getHoraTrabajo(@RequestPayload GetSegundosRequest request){
        int segundos = request.getSegundos();

        int minutos = calcularMinutos(segundos);

        GetSegundosResponse response = new GetSegundosResponse();

        response.setMinutos(minutos);

        return response;

    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetLimiteRequest")
    @ResponsePayload
    public GetLimiteResponse getLimite(@RequestPayload GetLimiteRequest request){
        int numero = request.getNumero();

        int suma = calcularSuma(numero);

        GetLimiteResponse response = new GetLimiteResponse();

        response.setSumalimite(suma);

        return response;

    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPromedioRequest")
    @ResponsePayload
    public GetPromedioResponse getPromedio(@RequestPayload GetPromedioRequest request) {
        double[] notas = {request.getNota1(), request.getNota2(), request.getNota3(), request.getNota4()};
        Arrays.sort(notas);

        double notaEliminada = notas[0];
        double promedio = (notas[1] + notas[2] + notas[3]) / 3;

        GetPromedioResponse response = new GetPromedioResponse();
        response.setNotaeliminada(notaEliminada);
        response.setPromedio(promedio);

        return response;
    }




    public static int calcularMinutos(int segundos) {
        // Calcula los minutos dividiendo los segundos por 60
        int minutos = segundos / 60;
        return minutos;
    }

    public double calcularSalario(double horasTrabajadas) {
        double salario;

        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * 16; // Se paga $16 por hora
        } else {
            // Se pagan $16 por las primeras 40 horas
            salario = 40 * 16;
            // Se pagan $20 por cada hora extra
            salario += (horasTrabajadas - 40) * 20;
        }

        return salario;
    }


    public static int calcularSuma(int limite) {
        int suma = 0;
        // Sumar todos los números desde 1 hasta el límite
        for (int i = 1; i <= limite; i++) {
            suma += i;
        }
        return suma;
    }
}
