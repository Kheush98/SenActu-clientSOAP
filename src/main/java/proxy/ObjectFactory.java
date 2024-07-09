
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _AddUser_QNAME = new QName("http://services.webservicesoap.sn.esp/", "addUser");
    private static final QName _AddUserResponse_QNAME = new QName("http://services.webservicesoap.sn.esp/", "addUserResponse");
    private static final QName _DeleteUser_QNAME = new QName("http://services.webservicesoap.sn.esp/", "deleteUser");
    private static final QName _DeleteUserResponse_QNAME = new QName("http://services.webservicesoap.sn.esp/", "deleteUserResponse");
    private static final QName _GetAdminToken_QNAME = new QName("http://services.webservicesoap.sn.esp/", "getAdminToken");
    private static final QName _GetAdminTokenResponse_QNAME = new QName("http://services.webservicesoap.sn.esp/", "getAdminTokenResponse");
    private static final QName _GetUsers_QNAME = new QName("http://services.webservicesoap.sn.esp/", "getUsers");
    private static final QName _GetUsersResponse_QNAME = new QName("http://services.webservicesoap.sn.esp/", "getUsersResponse");
    private static final QName _Login_QNAME = new QName("http://services.webservicesoap.sn.esp/", "login");
    private static final QName _LoginResponse_QNAME = new QName("http://services.webservicesoap.sn.esp/", "loginResponse");
    private static final QName _UpdateUser_QNAME = new QName("http://services.webservicesoap.sn.esp/", "updateUser");
    private static final QName _UpdateUserResponse_QNAME = new QName("http://services.webservicesoap.sn.esp/", "updateUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     * @return
     *     the new instance of {@link AddUser }
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     * @return
     *     the new instance of {@link AddUserResponse }
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     * @return
     *     the new instance of {@link DeleteUser }
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     * @return
     *     the new instance of {@link DeleteUserResponse }
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link GetAdminToken }
     * 
     * @return
     *     the new instance of {@link GetAdminToken }
     */
    public GetAdminToken createGetAdminToken() {
        return new GetAdminToken();
    }

    /**
     * Create an instance of {@link GetAdminTokenResponse }
     * 
     * @return
     *     the new instance of {@link GetAdminTokenResponse }
     */
    public GetAdminTokenResponse createGetAdminTokenResponse() {
        return new GetAdminTokenResponse();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     * @return
     *     the new instance of {@link GetUsers }
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     * @return
     *     the new instance of {@link GetUsersResponse }
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     * @return
     *     the new instance of {@link Login }
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     * @return
     *     the new instance of {@link LoginResponse }
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     * @return
     *     the new instance of {@link UpdateUser }
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     * @return
     *     the new instance of {@link UpdateUserResponse }
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     * @return
     *     the new instance of {@link User }
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservicesoap.sn.esp/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservicesoap.sn.esp/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservicesoap.sn.esp/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservicesoap.sn.esp/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminToken }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAdminToken }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservicesoap.sn.esp/", name = "getAdminToken")
    public JAXBElement<GetAdminToken> createGetAdminToken(GetAdminToken value) {
        return new JAXBElement<>(_GetAdminToken_QNAME, GetAdminToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminTokenResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAdminTokenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservicesoap.sn.esp/", name = "getAdminTokenResponse")
    public JAXBElement<GetAdminTokenResponse> createGetAdminTokenResponse(GetAdminTokenResponse value) {
        return new JAXBElement<>(_GetAdminTokenResponse_QNAME, GetAdminTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservicesoap.sn.esp/", name = "getUsers")
    public JAXBElement<GetUsers> createGetUsers(GetUsers value) {
        return new JAXBElement<>(_GetUsers_QNAME, GetUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservicesoap.sn.esp/", name = "getUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservicesoap.sn.esp/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservicesoap.sn.esp/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservicesoap.sn.esp/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservicesoap.sn.esp/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

}
