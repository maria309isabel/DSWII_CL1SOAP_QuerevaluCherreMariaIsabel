package pe.edu.cibertec.soap.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class serviceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet
            (ApplicationContext applicationContext){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }
    @Bean(name = "medicos")
    public DefaultWsdl11Definition medicoWsdl11Definition(XsdSchema paisSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("MedicosPort");
        wsdl11Definition.setLocationUri("/ws/medicos");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(paisSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema paisSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/medico.xsd"));
    }

    @Bean(name = "calculo")
    public DefaultWsdl11Definition calculoWsdl11Definition(XsdSchema domicilioSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CalculoPort");
        wsdl11Definition.setLocationUri("/ws/calculo");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(domicilioSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema domicilioSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/calculo.xsd"));
    }




}
