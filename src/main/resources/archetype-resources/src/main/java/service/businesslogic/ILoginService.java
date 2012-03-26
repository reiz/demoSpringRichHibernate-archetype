#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.businesslogic;

import ${package}.persistence.entity.User;

public interface ILoginService {

	User getByLoginInformation(String username, String password);

}
