package th.go.dbd.bizclub.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import th.go.dbd.bizclub.domain.BizclubAsset;
import th.go.dbd.bizclub.domain.BizclubCorpW;
import th.go.dbd.bizclub.domain.BizclubPicture;
import th.go.dbd.bizclub.domain.BizclubRegister;
import th.go.dbd.bizclub.domain.RoleType;
import th.go.dbd.bizclub.domain.User;
@Repository("bizClubRepository")
@Transactional
public class BizClubRepository {
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;
	/*
	
	public Long saveLosApplication(LosApplication losApplication) {
		// TODO Auto-generated method stub
		LosApplication losApplication =new LosApplication();
		BeanUtils.copyProperties(losApplication, losApplication);
		String token=TokenUtils.genToken(10);
		
		losApplication.setLosAppId(token);
		losApplication.setApplicationId(token);
		losApplication.setVersion(1);
		losApplication.setIsActive(1);
		entityanager.persist(losApplication);
		return 1l;
	}

	
	public Long saveLosApplicationVersion(LosApplication losApplication) {
		// TODO Auto-generated method stub
		LosApplication losApplication =new LosApplication();
		BeanUtils.copyProperties(losApplication, losApplication);
		Query query=entityanager.createQuery("select u from LosApplication u where u.applicationId=:applicationId"
				+ "  and u.isActive=1 "
				+ "", LosApplication.class);
		query.setParameter("applicationId", losApplication.getApplicationId());
		List<LosApplication> losApplications=query.getResultList();
		if(losApplications!=null){
			for (LosApplication app : losApplications) {
				app.setIsActive(0);
				entityanager.merge(app);
			}
		}
		String token=TokenUtils.genToken(10);	
		losApplication.setLosAppId(token);
		losApplication.setIsActive(1);
		entityanager.persist(losApplication);
		return 1l;
	}

	
	public LosApplication findLosApplicationById(String losAppId) {
		// TODO Auto-generated method stub
		LosApplication losApplication =new LosApplication();
		LosApplication losApplication=entityanager.find(LosApplication.class, losAppId);
		BeanUtils.copyProperties(losApplication, losApplication);
		return losApplication;
	}

	
	public Long updateLosApplicationVersion(LosApplication losApplication) {
		// TODO Auto-generated method stub
		LosApplication losApplication =new LosApplication();
		BeanUtils.copyProperties(losApplication, losApplication);
		entityanager.merge(losApplication);
		return 1l;
	}

	
	public List<LosApplication> searchLosApplication(
			LosApplication losApplication) {
		// TODO Auto-generated method stub
	
		Query query=entityanager.createQuery("select u from LosApplication u where u.updatedBy=:updatedBy "
				+ "", LosApplication.class);
		query.setParameter("updatedBy", losApplication.getUpdatedBy());
		List<LosApplication> losApplications=query.getResultList();
		 List<LosApplication> losApplications_model=null;
		if(losApplications!=null){
			losApplications_model = new ArrayList<LosApplication>(losApplications.size());
			for (LosApplication app : losApplications) {
				LosApplication model =new LosApplication();
				BeanUtils.copyProperties(app, model);
				losApplications_model.add(model);
			}
		}
	 return losApplications_model;	
	}
*/

	
	public Integer saveUser(User user) {
		// TODO Auto-generated method stub
		entityManager.persist(user);
		entityManager.flush();
		return null;
	}

	
	public Integer updateUser(User user) {
		// TODO Auto-generated method stub
		entityManager.merge(user);
		entityManager.flush();
		return null;
	}

	
	public Integer deleteUser(User user) {
		// TODO Auto-generated method stub
		entityManager.remove(user);
		entityManager.flush();
		return null;
	}

	
	public User findUserById(Integer userId) {
		// TODO Auto-generated method stub
		return entityManager.find(User.class,userId );
	}

	
	public List<User> searchUser(User user) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("select u from User u where u.userId!=1 ");
		if(user!=null){
			if(user.getCorpGroupDesc()!=null && user.getCorpGroupDesc().length()>0){
				sb.append(" and u.corpGroupDesc like '%"+user.getCorpGroupDesc().trim()+"%'");
			}
			if(user.getCardId()!=null && user.getCardId().length()>0){
				sb.append(" and u.cardId like '%"+user.getCardId().trim()+"%'");
			}
			if(user.getFirstName()!=null && user.getFirstName().length()>0){
				sb.append(" and u.firstName like '%"+user.getFirstName().trim()+"%'");
			}
			if(user.getCorpName()!=null && user.getCorpName().length()>0){
				sb.append(" and u.corpName like '%"+user.getCorpName().trim()+"%'");
			}
			if(user.getServices()!=null && user.getServices().length()>0){
				sb.append(" and u.services like '%"+user.getServices().trim()+"%'");
			}
		}
	
		Query query=entityManager.createQuery(sb.toString(), User.class);
		
		return query.getResultList();
	}

	
	public Integer saveBizclubRegister(BizclubRegister bizclubRegister) {
		// TODO Auto-generated method stub
		entityManager.persist(bizclubRegister);
		entityManager.flush();
		return bizclubRegister.getBrId();
	}

	
	public Integer updateBizclubRegister(BizclubRegister bizclubRegister) {
		// TODO Auto-generated method stub
		entityManager.merge(bizclubRegister);
		entityManager.flush();
		return null;
	}

	
	public Integer deleteBizclubRegister(BizclubRegister bizclubRegister) {
		// TODO Auto-generated method stub
		entityManager.remove(bizclubRegister);
		entityManager.flush();
		return null;
	}

	
	public BizclubRegister findBizclubRegisterById(Integer brId) {
		// TODO Auto-generated method stub
		return entityManager.find(BizclubRegister.class,brId );
		
	}

	
	public List<BizclubRegister> searchBizclubRegister(
			BizclubRegister bizclubRegister) {
		// TODO Auto-generated method stub
		Query query=entityManager.createQuery("select u from BizclubRegister u where u.approveStatus is null "
				+ "", BizclubRegister.class);
		return query.getResultList();
	}

	
	public Integer saveBizclubPicture(BizclubPicture bizclubPicture) {
		// TODO Auto-generated method stub
		entityManager.persist(bizclubPicture);
		entityManager.flush();
		return null;
	}

	
	public Integer updateBizclubPicture(BizclubPicture bizclubPicture) {
		// TODO Auto-generated method stub
		entityManager.merge(bizclubPicture);
		entityManager.flush();
		return null;
	}

	
	public Integer deleteBizclubPicture(BizclubPicture bizclubPicture) {
		// TODO Auto-generated method stub
		entityManager.remove(bizclubPicture);
		entityManager.flush();
		return null;
	}

	
	public BizclubPicture findBizclubPictureById(Integer bpId) {
		// TODO Auto-generated method stub
		return entityManager.find(BizclubPicture.class,bpId );
	}

	
	public List<BizclubPicture> searchBizclubPicture(
			BizclubPicture bizclubPicture) {
		// TODO Auto-generated method stub
		Query query=entityManager.createQuery("select u from BizclubPicture u  "
				+ "", BizclubPicture.class);
		return query.getResultList();
	}

	
	public Integer saveBizclubAsset(BizclubAsset bizclubAsset) {
		// TODO Auto-generated method stub
		entityManager.persist(bizclubAsset);
		entityManager.flush();
		return null;
	}

	
	public Integer updateBizclubAsset(BizclubAsset bizclubAsset) {
		// TODO Auto-generated method stub
		entityManager.merge(bizclubAsset);
		entityManager.flush();
		return null;
	}

	
	public Integer deleteBizclubAsset(BizclubAsset bizclubAsset) {
		// TODO Auto-generated method stub
		
			Query query=	entityManager.createQuery( "delete from BizclubAsset where baId =:baId ");
			query.setParameter("baId",bizclubAsset.getBaId());
	     
			return Integer.valueOf(query.executeUpdate());
	}

	
	public BizclubAsset findBizclubAssetById(Integer baId) {
		// TODO Auto-generated method stub
		return entityManager.find(BizclubAsset.class,baId );
	}

	
	public List<BizclubAsset> searchBizclubAsset(BizclubAsset bizclubAsset) {
		// TODO Auto-generated method stub
		boolean haveWhere=false;
		StringBuffer sb=new StringBuffer("select u from BizclubAsset u ");
		if(bizclubAsset.getUser()!=null && bizclubAsset.getUser().getUserId()!=null){
			sb.append(" where u.user.userId="+bizclubAsset.getUser().getUserId());
			haveWhere=true;
		}if(bizclubAsset.getBaTitle()!=null && bizclubAsset.getBaTitle().length()>0){
			sb.append((haveWhere?"and":"where")+" ( u.baTitle like '%"+bizclubAsset.getBaTitle().trim()+"%' or "
					+ " u.baDetail like '%"+bizclubAsset.getBaDetail().trim()+"%' ) ");
		}
		Query query=entityManager.createQuery( sb.toString(), BizclubAsset.class);
		return query.getResultList();
	}
	public List<RoleType> listRoleType(Integer rtId) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("select u from RoleType u where u.rtId=:rtId");
		Query query=entityManager.createQuery( sb.toString(), RoleType.class);
		query.setParameter("rtId", rtId);
		return query.getResultList();
	}
	public BizclubCorpW findBizclubCorpWById(String corpId,String corpType) {
		//return entityManager.find(BizclubCorpW.class,corpId );
		StringBuffer sb=new StringBuffer("select u from BizclubCorpW u where u.corpId=:corpId and u.corpType=:corpType ");
		Query query=entityManager.createQuery( sb.toString(), BizclubCorpW.class);
		query.setParameter("corpId", corpId);
		query.setParameter("corpType", corpType);
		Object obj=query.getSingleResult();
		if(obj!=null)
			return (BizclubCorpW)obj;
		else
			return null;
	}
	
}
