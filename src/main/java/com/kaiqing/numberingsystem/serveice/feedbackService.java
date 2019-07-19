package com.kaiqing.numberingsystem.serveice;

import com.kaiqing.numberingsystem.common.ResultModel;
import com.kaiqing.numberingsystem.common.ResultTools;
import com.kaiqing.numberingsystem.mapper.FeedbackMapper;
import com.kaiqing.numberingsystem.model.FeedbackInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author win7
 */
@Service
public class feedbackService {
    @Autowired
  private FeedbackMapper feedMapper;
    /***
     * 反馈信息
     */
    public ResultModel addfeedback (FeedbackInfo feedInfo){
        try {
            int code=feedMapper.addfeedback(feedInfo);
            if (code==1){
                return ResultTools.result(0,"",null);
            }
            return ResultTools.result(404,"",null);

        }catch (Exception e){
            return ResultTools.result(404,e.getMessage(),null);
        }
    }
}
