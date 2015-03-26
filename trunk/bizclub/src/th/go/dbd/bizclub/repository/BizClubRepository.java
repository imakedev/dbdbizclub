package th.go.dbd.bizclub.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import th.go.dbd.bizclub.domain.Amphur;
import th.go.dbd.bizclub.domain.BizclubAsset;
import th.go.dbd.bizclub.domain.BizclubCenter;
import th.go.dbd.bizclub.domain.BizclubCorpW;
import th.go.dbd.bizclub.domain.BizclubPicture;
import th.go.dbd.bizclub.domain.BizclubProvinceCenter;
import th.go.dbd.bizclub.domain.BizclubRegister;
import th.go.dbd.bizclub.domain.District;
import th.go.dbd.bizclub.domain.Province;
import th.go.dbd.bizclub.domain.RoleType;
import th.go.dbd.bizclub.domain.User;
import th.go.dbd.bizclub.domain.Zipcode;
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
		java.sql.Timestamp now = new java.sql.Timestamp(new Date().getTime());
		user.setUpdatedDate(now);
		user.setCreatedDate(now);
		entityManager.persist(user);
		entityManager.flush();
		return null;
	}

	
	public Integer updateUser(User user) {
		// TODO Auto-generated method stub
		java.sql.Timestamp now = new java.sql.Timestamp(new Date().getTime());
		user.setUpdatedDate(now);
		entityManager.merge(user);
		entityManager.flush();
		return null;
	}

	
	public Integer deleteUser(User userId) {
		// TODO Auto-generated method stub
	
		Query query=	entityManager.createQuery( "delete from User where userId =:userId ");
		query.setParameter("userId",userId.getUserId());
		return Integer.valueOf(query.executeUpdate());
	
	}

	
	public User findUserById(Integer userId) {
		// TODO Auto-generated method stub
		User user =entityManager.find(User.class,userId );
		if(user.getBizclubProvince()!=null && user.getBizclubProvince().length()>0){
			BizclubCenter bizclubProvinceCenter = entityManager.find(BizclubCenter.class,Integer.valueOf(user.getBizclubProvince()));
			user.setBizclubProvinceShow(bizclubProvinceCenter.getBcProviceName());
		}
		if(user.getAddressProvince()!=null && user.getAddressProvince().length()>0){
			Province province = entityManager.find(Province.class,Integer.valueOf(user.getAddressProvince()));
			user.setAddressProvinceShow(province.getProvinceName());
		}
		if(user.getAddressDistrict()!=null && user.getAddressDistrict().length()>0){
			Amphur amphur = entityManager.find(Amphur.class,Integer.valueOf(user.getAddressDistrict()));
			user.setAddressDistrictShow(amphur.getAmphurName());
		}
		if(user.getAddressSubDistrict()!=null && user.getAddressSubDistrict().length()>0){
			District district = entityManager.find(District.class,Integer.valueOf(user.getAddressSubDistrict()));
			user.setAddressSubDistrictShow(district.getDistrictName());
		}
		if(user.getAddressPostCode()!=null && user.getAddressPostCode().length()>0){
			Zipcode zipcode = entityManager.find(Zipcode.class,Integer.valueOf(user.getAddressPostCode()));
			user.setAddressPostCodeShow(zipcode.getZipcode());
		}
		
		return user;
	}

	public List<User> searchUserByCenter(User user) {
		StringBuffer sb=new StringBuffer("select u from User u where u.userId!=1 ");
		sb.append("  and u.bizclubProvince='"+user.getBizclubProvince()+"'");
		sb.append(" order by u.corpType asc , u.corpName asc  ");
		//sb.append(" order by u.updatedDate desc ");d
		Query query=entityManager.createQuery(sb.toString(), User.class);
		
		return query.getResultList();
	}
	public List<User> searchUser(User user) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("select u from User u where u.userId!=1 ");
		if(user!=null){
			if(user.getBizclubProvince()!=null && user.getBizclubProvince().length()>0){
				sb.append(" and u.bizclubProvince ='"+user.getBizclubProvince().trim()+"'");
			}
			if(user.getSearchUserType()!=null && user.getSearchUserType().length()>0){
				sb.append(" and u.role.roleId ="+user.getSearchUserType().trim()+"");
			}
			if(user.getCorpGroupDesc()!=null && user.getCorpGroupDesc().length()>0){
				sb.append(" and u.corpGroupId like '%"+user.getCorpGroupDesc().trim()+"%'");
			}
			if(user.getCardId()!=null && user.getCardId().length()>0){
				sb.append(" and u.cardId like '%"+user.getCardId().trim()+"%'");
			}
			if(user.getFirstName()!=null && user.getFirstName().length()>0){
				sb.append(" and ( u.firstName like '%"+user.getFirstName().trim()+"%' or u.lastName like '%"+user.getFirstName().trim()+"%'  ) ");
			}
			if(user.getCorpName()!=null && user.getCorpName().length()>0){
				sb.append(" and u.corpName like '%"+user.getCorpName().trim()+"%'");
			}
			if(user.getServices()!=null && user.getServices().length()>0){
				sb.append(" and u.services like '%"+user.getServices().trim()+"%'");
			}
			if(user.getSearchProvinceCenter()!=null && user.getSearchProvinceCenter().length()>0){
				sb.append(" and u.bizclubProvince="+user.getSearchProvinceCenter().trim()+"");
			}
				
			if(user.getSearchForm()!=null && user.getSearchForm().equals("0") ){
				if( user.getKeyworkd()!=null && user.getKeyworkd().trim().length()>0 )
					sb.append(" and ( u.cardId like '%"+user.getKeyworkd().trim()+"%'  or  "
							+ "  u.firstName like '%"+user.getKeyworkd().trim()+"%' or u.lastName like '%"+user.getKeyworkd().trim()+"%' or"
							+ "   u.corpName like '%"+user.getKeyworkd().trim()+"%' or  u.services like '%"+user.getKeyworkd().trim()+"%' )");
			}else{
				
			}
		}
		System.out.println(sb.toString());
		sb.append(" order by u.firstName asc ");
		//sb.append(" order by u.updatedDate desc ");
		Query query=entityManager.createQuery(sb.toString(), User.class);
		
		return query.getResultList();
	}

	
	public Integer saveBizclubRegister(BizclubRegister bizclubRegister) {
		// TODO Auto-generated method stub
		java.sql.Timestamp now = new java.sql.Timestamp(new Date().getTime());
		bizclubRegister.setUpdatedDate(now);
		bizclubRegister.setCreatedDate(now);
		entityManager.persist(bizclubRegister);
		entityManager.flush();
		return bizclubRegister.getBrId();
	}

	
	public Integer updateBizclubRegister(BizclubRegister bizclubRegister) {
		// TODO Auto-generated method stub
		java.sql.Timestamp now = new java.sql.Timestamp(new Date().getTime());
		bizclubRegister.setUpdatedDate(now);
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
		BizclubRegister user = entityManager.find(BizclubRegister.class,brId );
		if(user.getBizclubProvince()!=null && user.getBizclubProvince().length()>0){
			BizclubCenter bizclubProvinceCenter = entityManager.find(BizclubCenter.class,Integer.valueOf(user.getBizclubProvince()));
			user.setBizclubProvinceShow(bizclubProvinceCenter.getBcProviceName());
		}
		if(user.getAddressProvince()!=null && user.getAddressProvince().length()>0){
			Province province = entityManager.find(Province.class,Integer.valueOf(user.getAddressProvince()));
			user.setAddressProvinceShow(province.getProvinceName());
		}
		if(user.getAddressDistrict()!=null && user.getAddressDistrict().length()>0){
			Amphur amphur = entityManager.find(Amphur.class,Integer.valueOf(user.getAddressDistrict()));
			user.setAddressDistrictShow(amphur.getAmphurName());
		}
		if(user.getAddressSubDistrict()!=null && user.getAddressSubDistrict().length()>0){
			District district = entityManager.find(District.class,Integer.valueOf(user.getAddressSubDistrict()));
			user.setAddressSubDistrictShow(district.getDistrictName());
		}
		if(user.getAddressPostCode()!=null && user.getAddressPostCode().length()>0){
			Zipcode zipcode = entityManager.find(Zipcode.class,Integer.valueOf(user.getAddressPostCode()));
			user.setAddressPostCodeShow(zipcode.getZipcode());
		}
		return user;
		
	}

	
	public List<BizclubRegister> searchBizclubRegister(
			BizclubRegister bizclubRegister) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("select u from BizclubRegister u where u.approveStatus is null ");
		if(bizclubRegister.getCorpType()!=null){
			if(bizclubRegister.getCorpType().equals("4")){
				sb.append(" and u.corpType='4'");
			}else
				sb.append(" and u.corpType!='4'");
		}
		System.out.println(sb.toString());
		sb.append(" order by u.updatedDate desc ");
		Query query=entityManager.createQuery(sb.toString()
				+ "", BizclubRegister.class);
		return query.getResultList();
	}

	
	public Integer saveBizclubPicture(BizclubPicture bizclubPicture) {
		// TODO Auto-generated method stub
		java.sql.Timestamp now = new java.sql.Timestamp(new Date().getTime());
		bizclubPicture.setUpdatedDate(now);
		bizclubPicture.setCreatedDate(now);
		entityManager.persist(bizclubPicture);
		entityManager.flush();
		return null;
	}

	
	public Integer updateBizclubPicture(BizclubPicture bizclubPicture) {
		// TODO Auto-generated method stub
		java.sql.Timestamp now = new java.sql.Timestamp(new Date().getTime());
		bizclubPicture.setUpdatedDate(now);
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
		Query query=entityManager.createQuery("select u from BizclubPicture u order by  u.updatedDate desc   "
				+ "", BizclubPicture.class);
		return query.getResultList();
	}

	
	public Integer saveBizclubAsset(BizclubAsset bizclubAsset) {
		// TODO Auto-generated method stub
		java.sql.Timestamp now = new java.sql.Timestamp(new Date().getTime());
		bizclubAsset.setUpdatedDate(now);
		bizclubAsset.setCreatedDate(now);
		entityManager.persist(bizclubAsset);
		entityManager.flush();
		return null;
	}

	
	public Integer updateBizclubAsset(BizclubAsset bizclubAsset) {
		// TODO Auto-generated method stub
		java.sql.Timestamp now = new java.sql.Timestamp(new Date().getTime());
		bizclubAsset.setUpdatedDate(now);
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
	public BizclubCenter findBizclubCenterById(Integer bcId) {
		// TODO Auto-generated method stub
		return entityManager.find(BizclubCenter.class,bcId );
	}
	public List<BizclubAsset> searchBizclubAssetByCenter(BizclubAsset bizclubAsset) {
		StringBuffer sb=new StringBuffer("select u from BizclubAsset u ");
		boolean haveWhere=false;
		if(bizclubAsset.getBaStatus()!=null ){
			if(bizclubAsset.getBaStatus().equals("1")){
				sb.append((haveWhere?"and":"where")+" ( u.baStatus = '"+bizclubAsset.getBaStatus().trim()+"' ) ");
				haveWhere=true;
			}
			if(bizclubAsset.getUser()!=null ){
					if(bizclubAsset.getUser()!=null && bizclubAsset.getUser().getUserId()!=null){
						sb.append((haveWhere?"and":"where")+"  u.user.userId="+bizclubAsset.getUser().getUserId());
						haveWhere=true;
			}	
		 }
			
		}
		sb.append(" order by u.updatedDate desc ");
		Query query=entityManager.createQuery( sb.toString(), BizclubAsset.class);
		return query.getResultList();
	}
	
	public List<BizclubAsset> searchBizclubAsset(BizclubAsset bizclubAsset) {
		// TODO Auto-generated method stub
		boolean haveWhere=false;
		StringBuffer sb=new StringBuffer("select u from BizclubAsset u ");
		if(bizclubAsset.getBaStatus()!=null ){
			if(bizclubAsset.getBaStatus().equals("1")){
				sb.append((haveWhere?"and":"where")+" ( u.baStatus = '"+bizclubAsset.getBaStatus().trim()+"' ) ");
				haveWhere=true;
			}else if(bizclubAsset.getBaStatus().equals("0")){
				if(bizclubAsset.getUser()!=null && bizclubAsset.getUser().getUserId()!=1){
					if(bizclubAsset.getUser()!=null && bizclubAsset.getUser().getUserId()!=null){
						sb.append((haveWhere?"and":"where")+"  u.user.userId="+bizclubAsset.getUser().getUserId());
						haveWhere=true;
					}else{
						sb.append((haveWhere?"and":"where")+"  u.user.userId is null ");
						haveWhere=true;
					}
				}
				
			}
		}
		if(bizclubAsset.getBaTitle()!=null && bizclubAsset.getBaTitle().length()>0){
			sb.append((haveWhere?"and":"where")+" ( u.baTitle like '%"+bizclubAsset.getBaTitle().trim()+"%' or "
					+ " u.baDetail like '%"+bizclubAsset.getBaTitle().trim()+"%' ) ");
			haveWhere=true;
		}
		System.out.println(sb.toString());
		sb.append(" order by u.updatedDate desc ");
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
	public int checkExist(String corpId,String corpType) {
		//return entityManager.find(BizclubCorpW.class,corpId );
		StringBuffer sb=new StringBuffer();
		sb.append("select count(u) from User u where u.userName=:corpId ");
		Query query=entityManager.createQuery( sb.toString());
		query.setParameter("corpId", corpId);
		 java.lang.Long count=( java.lang.Long)query.getSingleResult();
		if(count>0){
			return count.intValue();
		}else{
			sb.setLength(0);
			if(corpType.equals("1")){ // CorpbizclubRegisterM.corpId
				sb.append("select count(u) from BizclubRegister u where u.corpId=:corpId ");
						
			}else if(corpType.equals("2")){ // CorpbizclubRegisterM.corpId
				sb.append("select count(u) from BizclubRegister u where u.taxesId=:corpId ");
						
			}else if(corpType.equals("3")){ // CorpbizclubRegisterM.corpId
				sb.append("select count(u) from BizclubRegister u where u.cardId=:corpId ");
						
			}else if(corpType.equals("4")){ // CorpbizclubRegisterM.corpId
				sb.append("select count(u) from BizclubRegister u where u.cardId=:corpId ");
						
			}
			query=entityManager.createQuery( sb.toString());
			query.setParameter("corpId", corpId);
			 count=(Long)query.getSingleResult();
			return count.intValue();
		}
	 // return 0;	
	}
	
	
	public List<BizclubProvinceCenter> listProvinceCenter() {
		// TODO Auto-generated method stub 
		StringBuffer sb=new StringBuffer("select u from BizclubProvinceCenter u order by  u.provinceName ");
		Query query=entityManager.createQuery( sb.toString(), BizclubProvinceCenter.class);
		return query.getResultList();
	}
	public List<BizclubCenter> listBizclubCenter() {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("select u from BizclubCenter u order by u.bcOrder desc, u.bcProviceName ");
		Query query=entityManager.createQuery( sb.toString(), BizclubCenter.class);
		return query.getResultList();
	}
	 
	public List<Province> listProvince() {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("select u from Province u order by u.provinceName ");
		Query query=entityManager.createQuery( sb.toString(), Province.class);
		return query.getResultList();
	}
	public List<Amphur> listAmphur(Integer provinceId) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("select u from Amphur u where u.provinceId=:provinceId  order by u.amphurName ");
		Query query=entityManager.createQuery( sb.toString(), Amphur.class);
		query.setParameter("provinceId", provinceId);
		return query.getResultList();
	}
	public List<District> listDistrict(Integer amphurId)  {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("select u from District u where u.amphurId=:amphurId order by u.districtName  ");
		Query query=entityManager.createQuery( sb.toString(), District.class);
		query.setParameter("amphurId", amphurId);
		return query.getResultList();
	}
	public List<Zipcode> listZipcode(String districtId)  {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("select u from Zipcode u  where u.districtId=:districtId ");
		Query query=entityManager.createQuery( sb.toString(), Zipcode.class);
		query.setParameter("districtId", districtId);
		return query.getResultList();
	}
	
}
