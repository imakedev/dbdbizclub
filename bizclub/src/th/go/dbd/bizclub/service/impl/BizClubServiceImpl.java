package th.go.dbd.bizclub.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.go.dbd.bizclub.domain.BizclubAsset;
import th.go.dbd.bizclub.domain.BizclubCorpW;
import th.go.dbd.bizclub.domain.BizclubPicture;
import th.go.dbd.bizclub.domain.BizclubRegister;
import th.go.dbd.bizclub.domain.Role;
import th.go.dbd.bizclub.domain.RoleType;
import th.go.dbd.bizclub.domain.User;
import th.go.dbd.bizclub.model.BizclubAssetM;
import th.go.dbd.bizclub.model.BizclubCorpWM;
import th.go.dbd.bizclub.model.BizclubPictureM;
import th.go.dbd.bizclub.model.BizclubRegisterM;
import th.go.dbd.bizclub.model.RoleM;
import th.go.dbd.bizclub.model.UserM;
import th.go.dbd.bizclub.repository.BizClubRepository;
import th.go.dbd.bizclub.service.BizClubService;
import th.go.dbd.bizclub.utils.MapUtils;

@Service("bizClubServiceImpl")
public class BizClubServiceImpl extends PostCommon implements BizClubService {
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
		BeanUtils.copyProperties(userM , user,"id");
		if(userM.getRole()!=null && userM.getRole().getRoleId()!=null){
			Role role =new Role();
			role.setRoleId(userM.getRole().getRoleId());
			user.setRole(role);
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
		
		if(user.getRole()!=null){
			RoleM roleM=new RoleM();
			BeanUtils.copyProperties(user.getRole() , roleM);
			userM.setRole(roleM);
		}
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
		if(bizclubRegisterM.getDateOfBirthStr() != null && bizclubRegisterM.getDateOfBirthStr().trim().length() > 0)
			try {
				bizclubRegister.setDateOfBirth(format2.parse(bizclubRegisterM.getDateOfBirthStr()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
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
				bizclubRegisterM.setDateOfBirthStr(format1.format(bizclubRegister.getDateOfBirth()));
		StringBuffer sb=new StringBuffer();
		if(bizclubRegister.getCorpGroupId()!=null && bizclubRegister.getCorpGroupId().length()>0){
			String[] corpGroupIds=bizclubRegister.getCorpGroupId().split("-");
			if(corpGroupIds!=null && corpGroupIds.length>0){
				for (int i = 0; i < corpGroupIds.length; i++) {
					sb.append(corpGroupIdMap.get(corpGroupIds[i])+" ");
				}
			}
		}
		bizclubRegisterM.setCorpGroupId(sb.toString());
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
		BeanUtils.copyProperties(bizclubAssetM , bizclubAsset);
		if(bizclubAssetM!=null && bizclubAssetM.getUser()!=null){
			 
			User u=new User();
			u.setUserId(bizclubAssetM.getUser().getUserId());
			bizclubAsset.setUser(u);
		}
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
		BizclubAsset BizclubAsset = bizClubRepository.findBizclubAssetById(baId);
		BizclubAssetM BizclubAssetM=new BizclubAssetM();
		BeanUtils.copyProperties(BizclubAsset , BizclubAssetM);
		return BizclubAssetM;
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

}
