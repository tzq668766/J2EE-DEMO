package net.grosso.me.service;



import java.sql.SQLException;
import java.util.List;

import net.grosso.me.domain.UserRole;


import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface UserRoleService {

	@Transactional
	public List<UserRole> getAllUserRoles() throws SQLException;
	
	@Transactional
	public void save(UserRole userRole) throws SQLException;
	
	@Transactional
	public void delete(UserRole userRole) throws SQLException;

	
}
