package com.taerin.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.taerin.common.ErrorCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data //getter,setter
@ApiModel(value = "ResponseVO", description = "모든 리턴 VO")
public class ResponseVO {

    @ApiModelProperty(value = "서버 에러코드", example = "XXXX")
    private Integer code;
    @ApiModelProperty(value = "서버 기본 에러메시지", example = "기본 에러 메시지")
    private String message;
    @ApiModelProperty(value = "서버 상세 에러메시지", example = "예외 처리 메시지")
    private String exceptionMessage;
    @ApiModelProperty(value = "서버 리턴 시간", example = "yyyy-MM-ddThh:mm:ss")
    private LocalDateTime serverTime;

    @JsonInclude(JsonInclude.Include.NON_NULL) //null값 제외 출력
    private Object result;


    public ResponseVO(){
        this.code = ErrorCode.E_6000.getCode();
        this.message = ErrorCode.E_6000.getMessage();

        this.serverTime = LocalDateTime.now(); //현재시각
    }

}
