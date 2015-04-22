package th.go.dbd.bizclub.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.co.imake.dbd.bizclub.model.MailM;
import th.go.dbd.bizclub.domain.Amphur;
import th.go.dbd.bizclub.domain.BizclubActivity;
import th.go.dbd.bizclub.domain.BizclubAsset;
import th.go.dbd.bizclub.domain.BizclubCenter;
import th.go.dbd.bizclub.domain.BizclubCorpW;
import th.go.dbd.bizclub.domain.BizclubPicture;
import th.go.dbd.bizclub.domain.BizclubProvinceCenter;
import th.go.dbd.bizclub.domain.BizclubPublicize;
import th.go.dbd.bizclub.domain.BizclubRegister;
import th.go.dbd.bizclub.domain.District;
import th.go.dbd.bizclub.domain.Province;
import th.go.dbd.bizclub.domain.Role;
import th.go.dbd.bizclub.domain.RoleType;
import th.go.dbd.bizclub.domain.User;
import th.go.dbd.bizclub.domain.Zipcode;
import th.go.dbd.bizclub.model.AmphurM;
import th.go.dbd.bizclub.model.BizclubActivityM;
import th.go.dbd.bizclub.model.BizclubAssetM;
import th.go.dbd.bizclub.model.BizclubCenterM;
import th.go.dbd.bizclub.model.BizclubCorpWM;
import th.go.dbd.bizclub.model.BizclubPictureM;
import th.go.dbd.bizclub.model.BizclubProvinceCenterM;
import th.go.dbd.bizclub.model.BizclubPublicizeM;
import th.go.dbd.bizclub.model.BizclubRegisterM;
import th.go.dbd.bizclub.model.DistrictM;
import th.go.dbd.bizclub.model.ProvinceM;
import th.go.dbd.bizclub.model.RoleM;
import th.go.dbd.bizclub.model.UserM;
import th.go.dbd.bizclub.model.ZipcodeM;
import th.go.dbd.bizclub.repository.BizClubRepository;
import th.go.dbd.bizclub.service.BizClubService;
import th.go.dbd.bizclub.utils.MapUtils;


@Service("bizClubServiceImpl")
public class BizClubServiceImpl extends PostCommon implements BizClubService {
	
	
	Logger logger = Logger.getRootLogger();
	private static SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
	private Map<String, String> corpGroupIdMap = MapUtils.asMap(MapUtils.entry("1", "ผู้ผลิต"), MapUtils.entry("2", "ธุรกิจบริการ"),
			 MapUtils.entry("3", "ค้าส่ง"), MapUtils.entry("4", "ค้าปลีก"), MapUtils.entry("5", "นำเข้า"), MapUtils.entry("6", "ส่งออก")
			 ,MapUtils.entry("7", "อื่นๆ"));
	@Autowired
	private BizClubRepository bizClubRepository;

	public BizClubServiceImpl() {
	}

	
	@Override
	public Integer saveUser(UserM userM) {
		// TODO Auto-generated method stub
		User user=new User();
		BeanUtils.copyProperties(userM , user,"id","bizclubRegister");
		if(userM.getRole()!=null && userM.getRole().getRoleId()!=null){
			Role role =new Role();
			role.setRoleId(userM.getRole().getRoleId());
			user.setRole(role);
		}
		if(userM.getDateOfBirthStr() != null)
			try {
				user.setDateOfBirth(format2.parse(userM.getDateOfBirthStr()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(userM.getBizclubRegister()!=null && userM.getBizclubRegister().getBrId()!=null){
			BizclubRegister bizclubRegister =new BizclubRegister();
			BeanUtils.copyProperties(userM.getBizclubRegister() , bizclubRegister);
			user.setBizclubRegister(bizclubRegister);
		}
		return bizClubRepository.saveUser(user);
	}

	@Override
	public Integer updateUser(UserM userM) {
		// TODO Auto-generated method stub
		User user=new User();
		BeanUtils.copyProperties(userM , user,"id");
		if(userM.getRole()!=null && userM.getRole().getRoleId()!=null){
			Role role =new Role();
			role.setRoleId(userM.getRole().getRoleId());
			user.setRole(role);
		}
		if(userM.getDateOfBirthStr() != null)
			try {
				user.setDateOfBirth(format1.parse(userM.getDateOfBirthStr()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		return bizClubRepository.updateUser(user);
	}

	@Override
	public Integer deleteUser(UserM userM) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setUserId(userM.getUserId());
		return bizClubRepository.deleteUser(user);
	}

	@Override
	public UserM findUserById(Integer userId) {
		// TODO Auto-generated method stub
		User user = bizClubRepository.findUserById(userId);
		UserM userM=new UserM();
		BeanUtils.copyProperties(user , userM);
		if(user.getDateOfBirth() != null)
			userM.setDateOfBirthStr(format1.format(user.getDateOfBirth()));	
		if(user.getRole()!=null){
			RoleM roleM=new RoleM();
			BeanUtils.copyProperties(user.getRole() , roleM);
			userM.setRole(roleM);
		}
		StringBuffer sb=new StringBuffer();
		if(user.getCorpGroupId()!=null && user.getCorpGroupId().length()>0){
			String[] corpGroupIds=user.getCorpGroupId().split("-");
			if(corpGroupIds!=null && corpGroupIds.length>0){
				for (int i = 0; i < corpGroupIds.length; i++) {
					sb.append(corpGroupIdMap.get(corpGroupIds[i])+" ");
				}
			}
		}
		userM.setCorpGroupIdShow(sb.toString());
	//	System.out.println("role=>"+user.getRole());
		return userM;
	}

	@Override
	public List<UserM> searchUser(UserM userM) {
		// TODO Auto-generated method stub
		User user=new User();
		if(userM!=null)
			BeanUtils.copyProperties(userM , user);
		List<User> users= bizClubRepository.searchUser(user);
		List<UserM> userModelList= new ArrayList<UserM>(users.size());
		for (User userDomain : users) {
			UserM userModel=new UserM();
			//System.out.println("before->"+userDomain.getServices());
			BeanUtils.copyProperties(userDomain , userModel);
			//System.out.println("after->"+userModel.getServices());
			userModelList.add(userModel);
		}
		return userModelList;
	}

	@Override
	public Integer saveBizclubRegister(BizclubRegisterM bizclubRegisterM) {
		// TODO Auto-generated method stub
		BizclubRegister bizclubRegister=new BizclubRegister();
		
		BeanUtils.copyProperties(bizclubRegisterM , bizclubRegister);
		System.out.println("getDateOfBirthStr-->"+bizclubRegisterM.getDateOfBirthStr());
		if(bizclubRegisterM.getDateOfBirthStr() != null && bizclubRegisterM.getDateOfBirthStr().trim().length() > 0)
			try {
				bizclubRegister.setDateOfBirth(format1.parse(bizclubRegisterM.getDateOfBirthStr()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("getDateOfBirth-->"+bizclubRegister.getDateOfBirth());
		return bizClubRepository.saveBizclubRegister(bizclubRegister);
	}

	@Override
	public Integer updateBizclubRegister(BizclubRegisterM bizclubRegisterM) {
		// TODO Auto-generated method stub
		BizclubRegister bizclubRegister=new BizclubRegister();
		BeanUtils.copyProperties(bizclubRegisterM , bizclubRegister);
		return bizClubRepository.updateBizclubRegister(bizclubRegister);
	}

	@Override
	public Integer deleteBizclubRegister(BizclubRegisterM bizclubRegisterM) {
		// TODO Auto-generated method stub
		BizclubRegister bizclubRegister=new BizclubRegister();
		bizclubRegister.setBrId(bizclubRegisterM.getBrId());
		return bizClubRepository.deleteBizclubRegister(bizclubRegister);
	}

	@Override
	public BizclubRegisterM findBizclubRegisterById(Integer brId) {
		// TODO Auto-generated method stub
		BizclubRegister bizclubRegister = bizClubRepository.findBizclubRegisterById(brId);
		BizclubRegisterM bizclubRegisterM=new BizclubRegisterM();
		BeanUtils.copyProperties(bizclubRegister , bizclubRegisterM);
		if(bizclubRegister.getDateOfBirth() != null)
				bizclubRegisterM.setDateOfBirthStr(format2.format(bizclubRegister.getDateOfBirth()));
		StringBuffer sb=new StringBuffer();
		if(bizclubRegister.getCorpGroupId()!=null && bizclubRegister.getCorpGroupId().length()>0){
			String[] corpGroupIds=bizclubRegister.getCorpGroupId().split("-");
			if(corpGroupIds!=null && corpGroupIds.length>0){
				for (int i = 0; i < corpGroupIds.length; i++) {
					sb.append(corpGroupIdMap.get(corpGroupIds[i])+" ");
				}
			}
		}
		bizclubRegisterM.setCorpGroupIdShow(sb.toString());
		return bizclubRegisterM;
	}

	@Override
	public List<BizclubRegisterM> searchBizclubRegister(
			BizclubRegisterM bizclubRegisterM) {
		// TODO Auto-generated method stub
		BizclubRegister bizclubRegister=new BizclubRegister();
		if(bizclubRegisterM!=null)
		BeanUtils.copyProperties(bizclubRegisterM , bizclubRegister);
		List<BizclubRegister> bizclubRegisters= bizClubRepository.searchBizclubRegister(bizclubRegister);
		List<BizclubRegisterM> bizclubRegisterModelList= new ArrayList<BizclubRegisterM>(bizclubRegisters.size());
		for (BizclubRegister bizclubRegisterDomain : bizclubRegisters) {
			BizclubRegisterM bizclubRegisterModel=new BizclubRegisterM();
			BeanUtils.copyProperties(bizclubRegisterDomain , bizclubRegisterModel);
			bizclubRegisterModelList.add(bizclubRegisterModel);
		}
		return bizclubRegisterModelList;
	}

	@Override
	public Integer saveBizclubPicture(BizclubPictureM bizclubPictureM) {
		// TODO Auto-generated method stub
		BizclubPicture bizclubPicture=new BizclubPicture();
		BeanUtils.copyProperties(bizclubPictureM , bizclubPicture);
		return bizClubRepository.saveBizclubPicture(bizclubPicture);
	}

	@Override
	public Integer updateBizclubPicture(BizclubPictureM bizclubPictureM) {
		// TODO Auto-generated method stub
		BizclubPicture bizclubPicture=new BizclubPicture();
		BeanUtils.copyProperties(bizclubPictureM , bizclubPicture);
		return bizClubRepository.updateBizclubPicture(bizclubPicture);
	}

	@Override
	public Integer deleteBizclubPicture(BizclubPictureM bizclubPictureM) {
		// TODO Auto-generated method stub
		BizclubPicture bizclubPicture=new BizclubPicture();
		bizclubPicture.setBpId(bizclubPictureM.getBpId());
		return bizClubRepository.deleteBizclubPicture(bizclubPicture);
	}

	@Override
	public BizclubPictureM findBizclubPictureById(Integer bpId) {
		// TODO Auto-generated method stub
		BizclubPicture bizclubPicture = bizClubRepository.findBizclubPictureById(bpId);
		BizclubPictureM bizclubPictureM=new BizclubPictureM();
		BeanUtils.copyProperties(bizclubPicture , bizclubPictureM);
		return bizclubPictureM;
	}

	@Override
	public List<BizclubPictureM> searchBizclubPicture(
			BizclubPictureM bizclubPictureM) {
		// TODO Auto-generated method stub
		BizclubPicture bizclubPicture=new BizclubPicture();
		BeanUtils.copyProperties(bizclubPictureM , bizclubPicture);
		List<BizclubPicture> bizclubPictures= bizClubRepository.searchBizclubPicture(bizclubPicture);
		List<BizclubPictureM> bizclubPictureModelList= new ArrayList<BizclubPictureM>(bizclubPictures.size());
		for (BizclubPicture bizclubPictureDomain : bizclubPictures) {
			BizclubPictureM bizclubPictureModel=new BizclubPictureM();
			BeanUtils.copyProperties(bizclubPictureDomain , bizclubPictureModel);
			bizclubPictureModelList.add(bizclubPictureModel);
		}
		return bizclubPictureModelList;
	}

	@Override
	public Integer saveBizclubAsset(BizclubAssetM bizclubAssetM) {
		// TODO Auto-generated method stub
		BizclubAsset bizclubAsset=new BizclubAsset();
		BeanUtils.copyProperties(bizclubAssetM , bizclubAsset);
		System.out.println("user->"+bizclubAssetM.getUser());
		 
		 if(bizclubAssetM!=null && bizclubAssetM.getUser()!=null){
		 
			User u=new User();
			u.setUserId(bizclubAssetM.getUser().getUserId());
			bizclubAsset.setUser(u);
		}
		
		return bizClubRepository.saveBizclubAsset(bizclubAsset);
	}

	@Override
	public Integer updateBizclubAsset(BizclubAssetM bizclubAssetM) {
		// TODO Auto-generated method stub
		BizclubAsset bizclubAsset=new BizclubAsset();
		BeanUtils.copyProperties(bizclubAssetM , bizclubAsset,"user");
		if(bizclubAssetM.getUser()!=null && bizclubAssetM.getUser().getUserId()!=null){
			User user=new User();
			user.setUserId(bizclubAssetM.getUser().getUserId());
			bizclubAsset.setUser(user);
		}
		System.out.println("getUser->"+bizclubAssetM.getUser());
		System.out.println("id->"+bizclubAssetM.getBaId());
		return bizClubRepository.updateBizclubAsset(bizclubAsset);
	}

	@Override
	public Integer deleteBizclubAsset(BizclubAssetM bizclubAssetM) {
		// TODO Auto-generated method stub
		BizclubAsset BizclubAsset=new BizclubAsset();
		BizclubAsset.setBaId(bizclubAssetM.getBaId());
		return bizClubRepository.deleteBizclubAsset(BizclubAsset);
	}

	@Override
	public BizclubAssetM findBizclubAssetById(Integer baId) {
		// TODO Auto-generated method stub
		BizclubAsset bizclubAsset = bizClubRepository.findBizclubAssetById(baId);
		BizclubAssetM bizclubAssetM=new BizclubAssetM();
		BeanUtils.copyProperties(bizclubAsset , bizclubAssetM,"user");
		//BeanUtils.copyProperties(BizclubAssetM , BizclubAsset,"user");
		if(bizclubAsset.getUser()!=null && bizclubAsset.getUser().getUserId()!=null){
			UserM user=new UserM();
			user.setUserId(bizclubAsset.getUser().getUserId());
			bizclubAssetM.setUser(user);
		}
		return bizclubAssetM;
	}

	@Override
	public List<BizclubAssetM> searchBizclubAsset(BizclubAssetM bizclubAssetM) {
		// TODO Auto-generated method stub
		BizclubAsset bizclubAsset=new BizclubAsset();
		BeanUtils.copyProperties(bizclubAssetM , bizclubAsset,"user");
		if(bizclubAssetM.getUser()!=null && bizclubAssetM.getUser().getUserId()!=null){
			User user=new User();
			user.setUserId(bizclubAssetM.getUser().getUserId());
			bizclubAsset.setUser(user);
		}
		List<BizclubAsset> bizclubAssets= bizClubRepository.searchBizclubAsset(bizclubAsset);
		List<BizclubAssetM> bizclubAssetModelList= new ArrayList<BizclubAssetM>(bizclubAssets.size());
		for (BizclubAsset bizclubAssetDomain : bizclubAssets) {
			BizclubAssetM bizclubAssetModel=new BizclubAssetM();
			BeanUtils.copyProperties(bizclubAssetDomain , bizclubAssetModel,"user");
			if(bizclubAssetDomain.getUser()!=null && bizclubAssetDomain.getUser().getUserId()!=null){
				UserM userM=new UserM();
				userM.setUserId(bizclubAssetDomain.getUser().getUserId());
				bizclubAssetModel.setUser(userM);
			}
			bizclubAssetModelList.add(bizclubAssetModel);
		}
		return bizclubAssetModelList;
	}


	@Override
	public List<RoleType> listRoleType(Integer rtId) {
		// TODO Auto-generated method stub
		return bizClubRepository.listRoleType(rtId);
	}


	@Override
	public BizclubCorpWM findBizclubCorpWById(String corpId,String corpType) {
		// TODO Auto-generated method stub
		BizclubCorpW bizclubCorp= bizClubRepository.findBizclubCorpWById(corpId,corpType);
		BizclubCorpWM bizclubCorpWM=new BizclubCorpWM();
		BeanUtils.copyProperties(bizclubCorp,bizclubCorpWM );
		return bizclubCorpWM;
	}

	@Override
	public String checkExist(String corpId,String corpType) {
		// TODO Auto-generated method stub
		 return String.valueOf(bizClubRepository.checkExist(corpId,corpType));
	}
	

	@Override
	public List<BizclubProvinceCenterM> listProvinceCenter() {
		// TODO Auto-generated method stub
		List<BizclubProvinceCenter>  provinces= bizClubRepository.listProvinceCenter();
		List<BizclubProvinceCenterM>  provinceMList=new ArrayList<BizclubProvinceCenterM>(provinces.size());
		for (BizclubProvinceCenter province : provinces) {
			BizclubProvinceCenterM provinceM=new BizclubProvinceCenterM();
			BeanUtils.copyProperties( province, provinceM);
			provinceMList.add(provinceM);
		}
		return provinceMList;
	}
	

	@Override
	public List<ProvinceM> listProvince() {
		// TODO Auto-generated method stub
		List<Province>  provinces= bizClubRepository.listProvince();
		List<ProvinceM>  provinceMList=new ArrayList<ProvinceM>(provinces.size());
		for (Province province : provinces) {
			ProvinceM provinceM=new ProvinceM();
			BeanUtils.copyProperties( province, provinceM);
			provinceMList.add(provinceM);
		}
		return provinceMList;
	}


	@Override
	public List<AmphurM> listAmphur(Integer provinceId) {
		// TODO Auto-generated method stub
		List<Amphur>  amphurMs= bizClubRepository.listAmphur(provinceId);
		List<AmphurM>  amphurMList=new ArrayList<AmphurM>(amphurMs.size());
		for (Amphur amphur : amphurMs) {
			AmphurM amphurM=new AmphurM();
			BeanUtils.copyProperties( amphur, amphurM);
			amphurMList.add(amphurM);
		}
		return amphurMList;
	}


	@Override
	public List<DistrictM> listDistrict(Integer amphurId) {
		// TODO Auto-generated method stub
		List<District>  districts= bizClubRepository.listDistrict(amphurId);
		List<DistrictM>  districtMList=new ArrayList<DistrictM>(districts.size());
		for (District district : districts) {
			DistrictM districtM=new DistrictM();
			BeanUtils.copyProperties( district, districtM);
			districtMList.add(districtM);
		}
		return districtMList;
	}


	@Override
	public List<ZipcodeM> listZipcode(String districtId) {
		// TODO Auto-generated method stub
		List<Zipcode>  zipcodes= bizClubRepository.listZipcode(districtId);
		List<ZipcodeM>  zipcodeMList=new ArrayList<ZipcodeM>(zipcodes.size());
		for (Zipcode zipcode : zipcodes) {
			ZipcodeM zipcodeM=new ZipcodeM();
			BeanUtils.copyProperties( zipcode, zipcodeM);
			zipcodeMList.add(zipcodeM);
		}
		return zipcodeMList;
	}


	@Override
	public List<BizclubCenterM> listBizclubCenter() {
		// TODO Auto-generated method stub
		List<BizclubCenter>  provinces= bizClubRepository.listBizclubCenter();
		List<BizclubCenterM>  provinceMList=new ArrayList<BizclubCenterM>(provinces.size());
		for (BizclubCenter province : provinces) {
			BizclubCenterM provinceM=new BizclubCenterM();
			BeanUtils.copyProperties( province, provinceM);
			provinceMList.add(provinceM);
		}
		return provinceMList;
	}


	@Override
	public BizclubCenterM findBizclubCenterById(Integer bcId) {
		// TODO Auto-generated method stub
		BizclubCenter bizclubCenter = bizClubRepository.findBizclubCenterById(bcId);
		BizclubCenterM bizclubCenterM=new BizclubCenterM();
		BeanUtils.copyProperties(bizclubCenter , bizclubCenterM,"user");
		//BeanUtils.copyProperties(BizclubCenterM , BizclubCenter,"user");
		
		return bizclubCenterM;
	}


	@Override
	public List<UserM> searchUserByCenter(UserM userM) {
		// TODO Auto-generated method stub
		User user=new User();
		if(userM!=null)
			BeanUtils.copyProperties(userM , user);
		List<User> users= bizClubRepository.searchUserByCenter(user);
		List<UserM> userModelList= new ArrayList<UserM>(users.size());
		for (User userDomain : users) {
			UserM userModel=new UserM();
			//System.out.println("before->"+userDomain.getServices());
			BeanUtils.copyProperties(userDomain , userModel);
			//System.out.println("after->"+userModel.getServices());
			userModelList.add(userModel);
		}
		return userModelList;
	}


	@Override
	public List<BizclubAssetM> searchBizclubAssetByCenter(
			BizclubAssetM bizclubAssetM) {
		// TODO Auto-generated method stub
		BizclubAsset bizclubAsset=new BizclubAsset();
		BeanUtils.copyProperties(bizclubAssetM , bizclubAsset,"user");
		if(bizclubAssetM.getUser()!=null && bizclubAssetM.getUser().getUserId()!=null){
			User user=new User();
			user.setUserId(bizclubAssetM.getUser().getUserId());
			bizclubAsset.setUser(user);
		}
		List<BizclubAsset> bizclubAssets= bizClubRepository.searchBizclubAssetByCenter(bizclubAsset);
		List<BizclubAssetM> bizclubAssetModelList= new ArrayList<BizclubAssetM>(bizclubAssets.size());
		for (BizclubAsset bizclubAssetDomain : bizclubAssets) {
			BizclubAssetM bizclubAssetModel=new BizclubAssetM();
			BeanUtils.copyProperties(bizclubAssetDomain , bizclubAssetModel,"user");
			if(bizclubAssetDomain.getUser()!=null && bizclubAssetDomain.getUser().getUserId()!=null){
				UserM userM=new UserM();
				userM.setUserId(bizclubAssetDomain.getUser().getUserId());
				bizclubAssetModel.setUser(userM);
			}
			bizclubAssetModelList.add(bizclubAssetModel);
		}
		return bizclubAssetModelList;
	}


	@Override
	public List<UserM> listStaft(Integer roleId,String bizClubProvince) {
		// TODO Auto-generated method stub
		
		List<User> users= bizClubRepository.listStaft(roleId,bizClubProvince);
		List<UserM> userModelList= new ArrayList<UserM>(users.size());
		for (User userDomain : users) {
			UserM userModel=new UserM();
			//System.out.println("before->"+userDomain.getServices());
			BeanUtils.copyProperties(userDomain , userModel);
			//System.out.println("after->"+userModel.getServices());
			userModelList.add(userModel);
		}
		return userModelList;
	}


	@Override
	public Integer saveActivity(BizclubActivityM activitiesM) {
		// TODO Auto-generated method stub
		logger.debug("saveActivity....."+activitiesM.getBaType());
		BizclubActivity activities=new BizclubActivity();
		BeanUtils.copyProperties(activitiesM , activities);
		logger.debug("activities:....."+activities.getBaType());
		return bizClubRepository.saveActivity(activities);
	}


	@Override
	public Integer updateActivity(BizclubActivityM activitiesM) {
		BizclubActivity act=new BizclubActivity();
		BeanUtils.copyProperties(activitiesM , act);
		return bizClubRepository.updateBizclubActivity(act);
	}


	@Override
	public Integer deleteActivity(BizclubActivityM activitieM) {
		BizclubActivity activity=new BizclubActivity();
		activity.setBaId(activitieM.getBaId());
		return bizClubRepository.deleteBizclubActivity(activity);
	}


	@Override
	public List<BizclubActivityM> searchActivityByCenter(BizclubActivityM activitiesM) {
		BizclubActivity activity =new BizclubActivity();
		if(activitiesM!=null) BeanUtils.copyProperties(activitiesM , activity);
		List<BizclubActivity> bizActivity= bizClubRepository.searchBizclubActivity(activity);
		List<BizclubActivityM> activityList= new ArrayList<BizclubActivityM>(bizActivity.size());
		for (BizclubActivity act : bizActivity) {
			BizclubActivityM actM=new BizclubActivityM();
			BeanUtils.copyProperties(act , actM);
			activityList.add(actM);
		}
		return activityList;
	}

	@Override
	public BizclubActivityM findBizclubActivityById(Integer baId) {
		BizclubActivity act = bizClubRepository.findBizclubActivityById(baId);
		BizclubActivityM actM=new BizclubActivityM();
		BeanUtils.copyProperties(act , actM);
		return actM;
	}
	
	//gimlee code
	@Override
	public List<BizclubCenterM> listBizclubCenter(Integer bcZone) {
		// TODO Auto-generated method stub
		List<BizclubCenter>  provinces= bizClubRepository.listBizclubCenter(bcZone);
		List<BizclubCenterM>  provinceMList=new ArrayList<BizclubCenterM>(provinces.size());
		for (BizclubCenter province : provinces) {
			BizclubCenterM provinceM=new BizclubCenterM();
			BeanUtils.copyProperties( province, provinceM);
			provinceMList.add(provinceM);
		}
		return provinceMList;
	}
	
	
	@Override
	public BizclubCenterM findBizclubCenterByZone(Integer bcZone) {
		// TODO Auto-generated method stub
		BizclubCenter bizclubCenter = bizClubRepository.findBizclubCenterByZone(bcZone);
		BizclubCenterM bizclubCenterM=new BizclubCenterM();
		BeanUtils.copyProperties(bizclubCenter , bizclubCenterM,"user");
		//BeanUtils.copyProperties(BizclubCenterM , BizclubCenter,"user");
		
		return bizclubCenterM;
	}
	
	
	@Override
	public BizclubPublicizeM findPublicizeByZone(BizclubPublicizeM bcPublicizeM) {
		BizclubPublicize bcPublicize =new BizclubPublicize();
		BizclubCenter bcCenter = new BizclubCenter();
		if(bcPublicizeM!=null) BeanUtils.copyProperties(bcPublicizeM , bcPublicize);
		if(bcPublicizeM.getBizclubCenterM()!=null){
			if(bcPublicizeM.getBizclubCenterM().getBcZone()!=null){
				bcCenter.setBcZone(bcPublicizeM.getBizclubCenterM().getBcZone());
			}else{
				bcCenter.setBcZone(0);
			}
		}
		bcPublicize.setBizclubCenter(bcCenter);
		bcPublicize = bizClubRepository.findPublicizeByZone(bcPublicize);
		BizclubPublicizeM actM=new BizclubPublicizeM();
		BeanUtils.copyProperties(bcPublicize , actM);
		if(bcPublicize.getBizclubCenter()!=null){
			BizclubCenterM bcCenterM = new BizclubCenterM();
			BeanUtils.copyProperties(bcPublicize.getBizclubCenter() , bcCenterM);
			actM.setBizclubCenterM(bcCenterM);
		}else{
			BizclubCenterM bcCenterM = new BizclubCenterM();
			bcCenterM.setBcId(bcPublicizeM.getBizclubCenterM().getBcId());
			bcCenterM.setBcZone(bcPublicizeM.getBizclubCenterM().getBcZone());
			actM.setBizclubCenterM(bcCenterM);
		}
		return actM;
	}
	
	
	@Override
	public List<BizclubPublicizeM> searchPublicizeByCenter(BizclubPublicizeM publicizeM) {
		BizclubPublicize publicize =new BizclubPublicize();
		if(publicizeM!=null) BeanUtils.copyProperties(publicizeM , publicize);
		if(publicizeM.getBizclubCenterM()!=null){
			BizclubCenter bizclubCenter = new BizclubCenter();
			if (publicizeM.getBizclubCenterM().getBcId()!=0) {
				bizclubCenter.setBcId(publicizeM.getBizclubCenterM().getBcId());
			}if(publicizeM.getBizclubCenterM().getBcZone()!=0) {
				bizclubCenter.setBcZone(publicizeM.getBizclubCenterM().getBcZone());
			}
			publicize.setBizclubCenter(bizclubCenter);
		}
		List<BizclubPublicize> bizclubPublicize= bizClubRepository.searchPublicizeByCenter(publicize);
		List<BizclubPublicizeM> listPublicizeM= new ArrayList<BizclubPublicizeM>(bizclubPublicize.size());
		for (BizclubPublicize act : bizclubPublicize) {
			BizclubPublicizeM actM=new BizclubPublicizeM();
			BeanUtils.copyProperties(act , actM);
			BizclubCenterM bcCenterM = new BizclubCenterM();
			BeanUtils.copyProperties(act.getBizclubCenter() , bcCenterM);
			actM.setBizclubCenterM(bcCenterM);
			listPublicizeM.add(actM);
		}
		return listPublicizeM;
	}

	@Override
	public BizclubPublicizeM findPublicizeByBpId(BizclubPublicizeM bizclubPublicizeM) {
		BizclubPublicize bizclubPublicize =new BizclubPublicize();
		if(bizclubPublicizeM!=null) BeanUtils.copyProperties(bizclubPublicizeM , bizclubPublicize);
		BizclubCenter bcCenter = new BizclubCenter();
		bcCenter.setBcId(bizclubPublicizeM.getBizclubCenterM().getBcId());
		bizclubPublicize.setBizclubCenter(bcCenter);
		BizclubPublicize bizPublic= bizClubRepository.findPublicizeByBpId(bizclubPublicize);
		BizclubPublicizeM actM=new BizclubPublicizeM();
		BeanUtils.copyProperties(bizPublic , actM);
		BizclubCenterM bcCenterM = new BizclubCenterM();
		bcCenterM.setBcId(bizPublic.getBizclubCenter().getBcId());
		bcCenterM.setBcZone(bizPublic.getBizclubCenter().getBcZone());
		actM.setBizclubCenterM(bcCenterM);
		return actM;
	}
	

	@Override
	public Integer savePublicize(BizclubPublicizeM bizclubPublicizeM) {
		BizclubPublicize bizclubPublicize=new BizclubPublicize();
		BeanUtils.copyProperties(bizclubPublicizeM , bizclubPublicize);
		BizclubCenter bizclubCenter = new BizclubCenter();
		bizclubCenter.setBcId(bizclubPublicizeM.getBizclubCenterM().getBcId());
		bizclubPublicize.setBizclubCenter(bizclubCenter);
		return bizClubRepository.savePublicize(bizclubPublicize);
	}


	@Override
	public Integer updatePublicize(BizclubPublicizeM bizclubPublicizeM) {
		BizclubPublicize bizclubPublicize=new BizclubPublicize();
		BeanUtils.copyProperties(bizclubPublicizeM , bizclubPublicize);
		BizclubCenter bizclubCenter = new BizclubCenter();
		bizclubCenter.setBcId(bizclubPublicizeM.getBizclubCenterM().getBcId());
		bizclubPublicize.setBizclubCenter(bizclubCenter);
		return bizClubRepository.updatePublicize(bizclubPublicize);
	}


	@Override
	public Integer deletePublicize(BizclubPublicizeM bizclubPublicizeM) {
		BizclubPublicize bizclubPublicize=new BizclubPublicize();
		bizclubPublicize.setBpId(bizclubPublicizeM.getBpId());
		return bizClubRepository.deletePublicize(bizclubPublicize);
	}


	@Override
	public MailM sendMail(MailM mailM) {
		// TODO Auto-generated method stub
		
	//	mailM.setServiceName(ServiceConstant.UTILIZATION_ITEM_FIND_BY_ID);
		th.co.imake.syndome.bpm.xstream.common.ImakeResultMessage imakeMessage =postMessage(mailM,mailM.getClass().getName(),"mail",true);
		if(imakeMessage.getResultListObj()!=null && imakeMessage.getResultListObj().size()>0)
			return ((MailM)imakeMessage.getResultListObj().get(0));
		else
			return null;
	}
	
}
