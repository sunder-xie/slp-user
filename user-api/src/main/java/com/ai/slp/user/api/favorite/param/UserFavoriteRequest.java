package com.ai.slp.user.api.favorite.param;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.favorite.interfaces.IUserFavoriteSV;

/**
 * 用户用户收藏信息查询入参
 * Date: 2016年4月20日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class UserFavoriteRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 收藏ID
     * NOT NULL
     */
    @NotNull(message="收藏Id不能为空",groups={IUserFavoriteSV.QueryFavorite.class})
    private String favoriteId;
    /**
     * 用户ID
     * NOT NULL
     */
    @NotNull(message="用户Id不能为空",groups={IUserFavoriteSV.QueryFavorite.class})
    private Integer userId;
}