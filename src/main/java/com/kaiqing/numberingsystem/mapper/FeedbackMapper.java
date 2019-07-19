package com.kaiqing.numberingsystem.mapper;

import com.kaiqing.numberingsystem.model.FeedbackInfo;

import org.apache.ibatis.annotations.Insert;

/***
 *
 * @author win7
 * 个人信息 接口类
 * @param  feedbackInfo 反馈信息实体类
 */
public interface FeedbackMapper {
    /***
     * 反馈信息实体类
     * @param feedInfo
     */
    @Insert("insert into db_feedback(contactInformation,feedbackInformation) values (#{contactInformation},#{feedbackInformation})")
    int addfeedback(FeedbackInfo feedInfo);


}
