
package ebankingsystemEmployee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ebankingsystemEmployee package. 
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

    private final static QName _SelectedEmployee_QNAME = new QName("http://ebankingEmployee/", "selectedEmployee");
    private final static QName _ValidateUsername_QNAME = new QName("http://ebankingEmployee/", "validateUsername");
    private final static QName _GetEmployeeList_QNAME = new QName("http://ebankingEmployee/", "getEmployeeList");
    private final static QName _ValidateFormResponse_QNAME = new QName("http://ebankingEmployee/", "validateFormResponse");
    private final static QName _DeleteEmployee_QNAME = new QName("http://ebankingEmployee/", "deleteEmployee");
    private final static QName _AddEmployee_QNAME = new QName("http://ebankingEmployee/", "addEmployee");
    private final static QName _Hello_QNAME = new QName("http://ebankingEmployee/", "hello");
    private final static QName _SelectedEmployeeResponse_QNAME = new QName("http://ebankingEmployee/", "selectedEmployeeResponse");
    private final static QName _ValidateSignupContents_QNAME = new QName("http://ebankingEmployee/", "validateSignupContents");
    private final static QName _UpdateEmployee_QNAME = new QName("http://ebankingEmployee/", "updateEmployee");
    private final static QName _HelloResponse_QNAME = new QName("http://ebankingEmployee/", "helloResponse");
    private final static QName _ValidateForm_QNAME = new QName("http://ebankingEmployee/", "validateForm");
    private final static QName _ValidateUsernameResponse_QNAME = new QName("http://ebankingEmployee/", "validateUsernameResponse");
    private final static QName _ValidateSignupContentsResponse_QNAME = new QName("http://ebankingEmployee/", "validateSignupContentsResponse");
    private final static QName _GetEmployeeListResponse_QNAME = new QName("http://ebankingEmployee/", "getEmployeeListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ebankingsystemEmployee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeeList }
     * 
     */
    public GetEmployeeList createGetEmployeeList() {
        return new GetEmployeeList();
    }

    /**
     * Create an instance of {@link ValidateFormResponse }
     * 
     */
    public ValidateFormResponse createValidateFormResponse() {
        return new ValidateFormResponse();
    }

    /**
     * Create an instance of {@link SelectedEmployee }
     * 
     */
    public SelectedEmployee createSelectedEmployee() {
        return new SelectedEmployee();
    }

    /**
     * Create an instance of {@link ValidateUsername }
     * 
     */
    public ValidateUsername createValidateUsername() {
        return new ValidateUsername();
    }

    /**
     * Create an instance of {@link ValidateSignupContentsResponse }
     * 
     */
    public ValidateSignupContentsResponse createValidateSignupContentsResponse() {
        return new ValidateSignupContentsResponse();
    }

    /**
     * Create an instance of {@link ValidateUsernameResponse }
     * 
     */
    public ValidateUsernameResponse createValidateUsernameResponse() {
        return new ValidateUsernameResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeListResponse }
     * 
     */
    public GetEmployeeListResponse createGetEmployeeListResponse() {
        return new GetEmployeeListResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ValidateForm }
     * 
     */
    public ValidateForm createValidateForm() {
        return new ValidateForm();
    }

    /**
     * Create an instance of {@link UpdateEmployee }
     * 
     */
    public UpdateEmployee createUpdateEmployee() {
        return new UpdateEmployee();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link SelectedEmployeeResponse }
     * 
     */
    public SelectedEmployeeResponse createSelectedEmployeeResponse() {
        return new SelectedEmployeeResponse();
    }

    /**
     * Create an instance of {@link ValidateSignupContents }
     * 
     */
    public ValidateSignupContents createValidateSignupContents() {
        return new ValidateSignupContents();
    }

    /**
     * Create an instance of {@link DeleteEmployee }
     * 
     */
    public DeleteEmployee createDeleteEmployee() {
        return new DeleteEmployee();
    }

    /**
     * Create an instance of {@link AddEmployee }
     * 
     */
    public AddEmployee createAddEmployee() {
        return new AddEmployee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectedEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankingEmployee/", name = "selectedEmployee")
    public JAXBElement<SelectedEmployee> createSelectedEmployee(SelectedEmployee value) {
        return new JAXBElement<SelectedEmployee>(_SelectedEmployee_QNAME, SelectedEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankingEmployee/", name = "validateUsername")
    public JAXBElement<ValidateUsername> createValidateUsername(ValidateUsername value) {
        return new JAXBElement<ValidateUsername>(_ValidateUsername_QNAME, ValidateUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankingEmployee/", name = "getEmployeeList")
    public JAXBElement<GetEmployeeList> createGetEmployeeList(GetEmployeeList value) {
        return new JAXBElement<GetEmployeeList>(_GetEmployeeList_QNAME, GetEmployeeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateFormResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankingEmployee/", name = "validateFormResponse")
    public JAXBElement<ValidateFormResponse> createValidateFormResponse(ValidateFormResponse value) {
        return new JAXBElement<ValidateFormResponse>(_ValidateFormResponse_QNAME, ValidateFormResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankingEmployee/", name = "deleteEmployee")
    public JAXBElement<DeleteEmployee> createDeleteEmployee(DeleteEmployee value) {
        return new JAXBElement<DeleteEmployee>(_DeleteEmployee_QNAME, DeleteEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankingEmployee/", name = "addEmployee")
    public JAXBElement<AddEmployee> createAddEmployee(AddEmployee value) {
        return new JAXBElement<AddEmployee>(_AddEmployee_QNAME, AddEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankingEmployee/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectedEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankingEmployee/", name = "selectedEmployeeResponse")
    public JAXBElement<SelectedEmployeeResponse> createSelectedEmployeeResponse(SelectedEmployeeResponse value) {
        return new JAXBElement<SelectedEmployeeResponse>(_SelectedEmployeeResponse_QNAME, SelectedEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSignupContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankingEmployee/", name = "validateSignupContents")
    public JAXBElement<ValidateSignupContents> createValidateSignupContents(ValidateSignupContents value) {
        return new JAXBElement<ValidateSignupContents>(_ValidateSignupContents_QNAME, ValidateSignupContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankingEmployee/", name = "updateEmployee")
    public JAXBElement<UpdateEmployee> createUpdateEmployee(UpdateEmployee value) {
        return new JAXBElement<UpdateEmployee>(_UpdateEmployee_QNAME, UpdateEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankingEmployee/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateForm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankingEmployee/", name = "validateForm")
    public JAXBElement<ValidateForm> createValidateForm(ValidateForm value) {
        return new JAXBElement<ValidateForm>(_ValidateForm_QNAME, ValidateForm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateUsernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankingEmployee/", name = "validateUsernameResponse")
    public JAXBElement<ValidateUsernameResponse> createValidateUsernameResponse(ValidateUsernameResponse value) {
        return new JAXBElement<ValidateUsernameResponse>(_ValidateUsernameResponse_QNAME, ValidateUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSignupContentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankingEmployee/", name = "validateSignupContentsResponse")
    public JAXBElement<ValidateSignupContentsResponse> createValidateSignupContentsResponse(ValidateSignupContentsResponse value) {
        return new JAXBElement<ValidateSignupContentsResponse>(_ValidateSignupContentsResponse_QNAME, ValidateSignupContentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebankingEmployee/", name = "getEmployeeListResponse")
    public JAXBElement<GetEmployeeListResponse> createGetEmployeeListResponse(GetEmployeeListResponse value) {
        return new JAXBElement<GetEmployeeListResponse>(_GetEmployeeListResponse_QNAME, GetEmployeeListResponse.class, null, value);
    }

}
