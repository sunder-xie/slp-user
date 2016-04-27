package com.ai.slp.user.api.ucLoginLog.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.ucLoginLog.interfaces.IUcLoginLogInfoSV;
import com.ai.slp.user.api.ucLoginLog.param.UcLoginLogParamsRequest;
import com.ai.slp.user.api.ucLoginLog.param.UcLoginLogResponse;
import com.ai.slp.user.service.business.interfaces.IUcLoginLogBusiSV;

@Service
public class UcLoginLogInfoSVImpl implements IUcLoginLogInfoSV{

    @Autowired
    private IUcLoginLogBusiSV ucLoginLogBusiSv;
    
    @Override
    public BaseResponse insertUserLoginLog(UcLoginLogParamsRequest userLoginParam) {
        return ucLoginLogBusiSv.insertUcLoginLogInfo(userLoginParam);
    }
    @Override
    public PageInfo<UcLoginLogResponse> getUcLoginLogInfo(UcLoginLogParamsRequest ucLoginLogParam,
            int limitStart, int limitEnd) {
        return ucLoginLogBusiSv.getUcLoginLogInfo(ucLoginLogParam, limitStart, limitEnd);
    }

}
