package com.taerin.common;

import lombok.Getter;

@Getter
public enum ErrorCode {

    S_200(200,  "Success"),

    //=======================================
    // json 관련 에러 2000 ~ 2999
    //=======================================

    E_2000(2000, "Param Mapping Error"),
    E_2001(2001, "Json Parse Error"),
    E_2002(2002, "Json Mapping Error"),
    E_2003(2003, "Json Parameter Error"),

    //=======================================
    //  사용자 관련 에러 3000 ~ 3999
    //=======================================

    E_3000(3000, "User Not Found"),

    //=======================================
    //  DB 관련 에러 4000 ~ 4999
    //=======================================
    E_4000(4000, "DB Error"),
    E_4001(4001, "DB No Data"),
    E_4002(4002, "DB DuplicateKey"),
    E_4003(4003, "DB Update Error"),
    E_4004(4004, "DB Insert Error"),
    E_4005(4005, "DB Delete Error"),

    //=======================================
    //  서버,기타 관련 에러 5000 ~ 6000
    //=======================================

    E_5000(5000, "Internel Exception Error"),
    E_5001(5001, "Spring Bind Error"),

    E_6000(6000, "Unknown error"),
    //=======================================
    //  DM 연동 관련 에러 6000 ~ 6099
    //=======================================

    E_7000(7000, "DM Interface Success"),
    E_7001(7001, "DM Interface Error");


    int code;
    String message;

    ErrorCode(int code, String message){
        code = code;
        message = message;
    }
}
