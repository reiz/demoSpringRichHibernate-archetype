#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.persistence.dao;

import ${package}.persistence.entity.User;


public interface IUserDao extends IGenericDao<User, Long>{


	User getByUserName(String userName);

	User getByLoginInformation(String userName, String password);


}
