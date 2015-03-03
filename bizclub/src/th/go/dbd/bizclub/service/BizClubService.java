// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 5/27/2012 12:14:17 AM
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   MissExamService.java

package th.go.dbd.bizclub.service;

import java.util.List;

import th.go.dbd.bizclub.model.AmphurM;
import th.go.dbd.bizclub.model.BizclubAssetM;
import th.go.dbd.bizclub.model.BizclubCorpWM;
import th.go.dbd.bizclub.model.BizclubPictureM;
import th.go.dbd.bizclub.model.BizclubProvinceCenterM;
import th.go.dbd.bizclub.model.BizclubRegisterM;
import th.go.dbd.bizclub.model.DistrictM;
import th.go.dbd.bizclub.model.ProvinceM;
import th.go.dbd.bizclub.model.UserM;
import th.go.dbd.bizclub.model.ZipcodeM;


public interface BizClubService {
	public List<th.go.dbd.bizclub.domain.RoleType> listRoleType(Integer rtId);
	// User
	public Integer saveUser(UserM userM) ;
	public Integer updateUser(UserM userM) ;
	public Integer deleteUser(UserM userM);
	public UserM findUserById(Integer userId);
	public List<UserM> searchUser(UserM userM) ;

	// 
	public Integer saveBizclubRegister(BizclubRegisterM bizclubRegisterM) ;
	public Integer updateBizclubRegister(BizclubRegisterM bizclubRegisterM) ;
	public Integer deleteBizclubRegister(BizclubRegisterM bizclubRegisterM);
	public BizclubRegisterM findBizclubRegisterById(Integer brId);
	public List<BizclubRegisterM> searchBizclubRegister(BizclubRegisterM bizclubRegisterM) ;
	
	public Integer saveBizclubPicture(BizclubPictureM bizclubPictureM) ;
	public Integer updateBizclubPicture(BizclubPictureM bizclubPictureM) ;
	public Integer deleteBizclubPicture(BizclubPictureM bizclubPictureM);
	public BizclubPictureM findBizclubPictureById(Integer bpId);
	public List<BizclubPictureM> searchBizclubPicture(BizclubPictureM bizclubPictureM) ;
	
	public Integer saveBizclubAsset(BizclubAssetM bizclubAssetM) ;
	public Integer updateBizclubAsset(BizclubAssetM bizclubAssetM) ;
	public Integer deleteBizclubAsset(BizclubAssetM bizclubAssetM);
	public BizclubAssetM findBizclubAssetById(Integer baId);
	public List<BizclubAssetM> searchBizclubAsset(BizclubAssetM bizclubAssetM) ;
	
	public BizclubCorpWM findBizclubCorpWById(String corpId,String corpType) ;
	
	public List<BizclubProvinceCenterM> listProvinceCenter() ;
	public List<ProvinceM> listProvince() ;
	public List<AmphurM> listAmphur(Integer provinceId) ;
	public List<DistrictM> listDistrict(Integer amphurId) ;
	public List<ZipcodeM> listZipcode(String districtId) ;
}
