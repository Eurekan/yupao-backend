package com.yupi.yupao.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 退出队伍请求体
 */
@Data
public class TeamQuitRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 队伍id
     */
    private Long teamId;

}
