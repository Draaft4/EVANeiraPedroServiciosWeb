
package ec.edu.ups.EVANeiraPedroCLI.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups.EVANeiraPedroCLI.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CrearAuto_QNAME = new QName("http://services.EVANeiraPedroSRV.ups.edu.ec/", "crearAuto");
    private final static QName _CrearAutoResponse_QNAME = new QName("http://services.EVANeiraPedroSRV.ups.edu.ec/", "crearAutoResponse");
    private final static QName _ListarAutos_QNAME = new QName("http://services.EVANeiraPedroSRV.ups.edu.ec/", "listarAutos");
    private final static QName _ListarAutosResponse_QNAME = new QName("http://services.EVANeiraPedroSRV.ups.edu.ec/", "listarAutosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.EVANeiraPedroCLI.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearAuto }
     * 
     */
    public CrearAuto createCrearAuto() {
        return new CrearAuto();
    }

    /**
     * Create an instance of {@link CrearAutoResponse }
     * 
     */
    public CrearAutoResponse createCrearAutoResponse() {
        return new CrearAutoResponse();
    }

    /**
     * Create an instance of {@link ListarAutos }
     * 
     */
    public ListarAutos createListarAutos() {
        return new ListarAutos();
    }

    /**
     * Create an instance of {@link ListarAutosResponse }
     * 
     */
    public ListarAutosResponse createListarAutosResponse() {
        return new ListarAutosResponse();
    }

    /**
     * Create an instance of {@link Automovil }
     * 
     */
    public Automovil createAutomovil() {
        return new Automovil();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearAuto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearAuto }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.EVANeiraPedroSRV.ups.edu.ec/", name = "crearAuto")
    public JAXBElement<CrearAuto> createCrearAuto(CrearAuto value) {
        return new JAXBElement<CrearAuto>(_CrearAuto_QNAME, CrearAuto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearAutoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearAutoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.EVANeiraPedroSRV.ups.edu.ec/", name = "crearAutoResponse")
    public JAXBElement<CrearAutoResponse> createCrearAutoResponse(CrearAutoResponse value) {
        return new JAXBElement<CrearAutoResponse>(_CrearAutoResponse_QNAME, CrearAutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAutos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarAutos }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.EVANeiraPedroSRV.ups.edu.ec/", name = "listarAutos")
    public JAXBElement<ListarAutos> createListarAutos(ListarAutos value) {
        return new JAXBElement<ListarAutos>(_ListarAutos_QNAME, ListarAutos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAutosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarAutosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.EVANeiraPedroSRV.ups.edu.ec/", name = "listarAutosResponse")
    public JAXBElement<ListarAutosResponse> createListarAutosResponse(ListarAutosResponse value) {
        return new JAXBElement<ListarAutosResponse>(_ListarAutosResponse_QNAME, ListarAutosResponse.class, null, value);
    }

}
