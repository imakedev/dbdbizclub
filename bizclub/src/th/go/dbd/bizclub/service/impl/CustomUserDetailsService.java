package th.go.dbd.bizclub.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.go.dbd.bizclub.constant.ServiceConstant;
import th.go.dbd.bizclub.domain.MyUser;
import th.go.dbd.bizclub.domain.MyUserDetails;
import th.go.dbd.bizclub.domain.User;
import th.go.dbd.bizclub.repository.UserRepository;
import th.go.dbd.bizclub.service.BizClubService;



/**
 * A custom {@link UserDetailsService} where user information
 * is retrieved from a JPA repository
 */
@Service
@Transactional(readOnly = true)
public class CustomUserDetailsService implements UserDetailsService {
	private static final Logger logger = Logger.getLogger(ServiceConstant.LOG_APPENDER);
	 @Autowired
	private UserRepository userRepository;
	
	@Autowired
	@Qualifier("bizClubServiceImpl")
	private BizClubService bizClubService;
	/*@PersistenceContext
	private EntityManager em;*/
	//@PersistenceUnit(unitName = "hibernatePersistenceUnit")
    //private EntityManagerFactory entityManagerFactory;

	/**
	 * Returns a populated {@link UserDetails} object. 
	 * The username is first retrieved from the database and then mapped to 
	 * a {@link UserDetails} object.
	 */
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.debug(" xxxxxxxxxxxxxxxxxxxxxxxxxxxx into loadUserByUsername "+username);
		try {
	      User domainUserContact =  userRepository.findByUserName(username);
			logger.debug(" xxxxxxxxxxxxxxxxxxxxxxxxxxxx affter loadUserByUsername "+domainUserContact);
			
			boolean enabled = true;
			boolean accountNonExpired = true;
			boolean credentialsNonExpired = true;
			boolean accountNonLocked = true;
		 
			  boolean isAdmin=false;
			  Integer rtId=null;
		if(domainUserContact!=null){
			/*
			//logger.debug("  getMcontactName "+domainUser.getMissContact().getMcontactName());
			EntityManager em = entityManagerFactory.createEntityManager();
            try{
            	//org.hibernate.ejb.TransactionImpl tx=(org.hibernate.ejb.TransactionImpl)em.getTransaction();
            	EntityTransaction tx =  em.getTransaction();
            	tx.begin();
			  CriteriaBuilder cb = em.getCriteriaBuilder();
		        CriteriaQuery<com.gl.finwiz.domain.User> query = cb.createQuery(com.gl.finwiz.domain.User.class);
		       Root<com.gl.finwiz.domain.User> contact = query.from(com.gl.finwiz.domain.User.class);

		        query.where(cb.equal(contact.get("mcontactUsername").as(String.class),
		        		username));
		    
		       tx.commit();
            }catch (Exception e) {
				// TODO: handle exception
            	e.printStackTrace();
			}finally{
				em.close();
			} 
          
        */
			if(domainUserContact.getRole()!=null && domainUserContact.getRole().getRoleId()!=null)
					rtId=domainUserContact.getRole().getRoleId();
			MyUserDetails user=new MyUserDetails(domainUserContact.getUserName(),  
					domainUserContact.getPassword().toLowerCase(),
					enabled,
					accountNonExpired,
					credentialsNonExpired,
					accountNonLocked,
					//getAuthorities(domainUser.getRole().getRole()));
					//getAuthorities(domainUserContact.getRole()));
					getAuthorities(getRolesMapping(rtId,isAdmin)));
			MyUser myUser=new MyUser(domainUserContact.getFirstName()+" "+domainUserContact.getLastName());
			myUser.setUserid(domainUserContact.getUserId());
			user.setMyUser(myUser);
		return user;
		
		}else
			return null;
					
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	public  Set<th.go.dbd.bizclub.domain.RoleType> getRolesMapping(Integer rtId,boolean isAdmin){
		  Set<th.go.dbd.bizclub.domain.RoleType> role =new HashSet<th.go.dbd.bizclub.domain.RoleType>();
		  th.go.dbd.bizclub.domain.RoleType defualt= new th.go.dbd.bizclub.domain.RoleType();
		   defualt.setRole("ROLE_USER");
		   role.add(defualt); 
		   if(isAdmin){
			   th.go.dbd.bizclub.domain.RoleType admin= new th.go.dbd.bizclub.domain.RoleType();
				admin.setRole("ROLE_ADMIN");
				role.add(admin);
		   }
         
                   
//     	  logger.debug("yyyyyyyyyyyyyyyyyyyyyyy "+roleContact.getRcId());
     //      if(roleContact!=null && roleContact.getRcId()!=null ){
		     if(rtId!=null){
        	  @SuppressWarnings("unchecked")
			List<th.go.dbd.bizclub.domain.RoleType> roles= bizClubService.listRoleType(rtId);
        	  logger.debug("zzzzzzzzzzzzzzzzzzzzzzzzzzz "+roles);
        	  if(roles!=null && roles.size()>0){
        		  for (th.go.dbd.bizclub.domain.RoleType roleType : roles) {
        			  role.add(roleType);
				}
        	  }
        	  logger.debug("xxxxxxxxxxxxxxxxxxxxxxx "+role.size());
        	 
           }
		return role;
	}
	/**
	 * Retrieves a collection of {@link GrantedAuthority} based on a numerical role
	 * @param role the numerical role
	 * @return a collection of {@link GrantedAuthority
	 */
	/*	public Collection<? extends GrantedAuthority> getAuthorities(Set<Role> role) {
		List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(role));
		return authList;
	}*/
	public Collection<? extends GrantedAuthority> getAuthorities(Set<th.go.dbd.bizclub.domain.RoleType> role) {
		List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(role));
		return authList;
	}
	
	/**
	 * Converts a numerical role to an equivalent list of roles
	 * @param role the numerical role
	 * @return list of roles as as a list of {@link String}
	 */
/*	public List<String> getRoles(Set<Role> role) {
		List<String> roles = new ArrayList<String>();
		if(role!=null && role.size()>0)
		for (Role key : role) {
			roles.add(key.getRole());
		}
		return roles;
	}*/
	public List<String> getRoles(Set<th.go.dbd.bizclub.domain.RoleType> role) {
		List<String> roles = new ArrayList<String>();
		if(role!=null && role.size()>0)
		for (th.go.dbd.bizclub.domain.RoleType key : role) {
			roles.add(key.getRole());
		}
		return roles;
	}
	
	/**
	 * Wraps {@link String} roles to {@link SimpleGrantedAuthority} objects
	 * @param roles {@link String} of roles
	 * @return list of granted authorities
	 */
	/*public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}*/
	public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}
}
