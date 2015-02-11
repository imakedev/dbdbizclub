package th.go.dbd.bizclub.service.impl;

import org.springframework.stereotype.Service;

import th.go.dbd.bizclub.service.BizClubService;

import com.gl.finwiz.core.constant.RouterConStant;
import com.gl.finwiz.core.constant.ServiceConstant;
import com.gl.finwiz.core.model.UserLoginM;
import com.gl.finwiz.core.xstream.common.FinWizResultMessage;

@Service("bizClubService")
public class BizClubServiceImpl extends PostCommon
    implements BizClubService
{

    public BizClubServiceImpl()
    {
    }

	@Override
	public UserLoginM login(UserLoginM userLoginM) {
		// TODO Auto-generated method stub
		userLoginM.setServiceName(ServiceConstant.USER_PROFILE_LOGIN);
	        FinWizResultMessage resultMessage = postMessage(userLoginM, userLoginM.getClass().getName(), RouterConStant.USER_ENDPOINT, true);
	        userLoginM = (UserLoginM)resultMessage.getResultListObj().get(0);
	     return userLoginM; 
	}


}
