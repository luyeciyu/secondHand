package com.yws.server.dto;

import javax.persistence.Transient;
import java.util.Date;

/**
 * Created by yangweisen on 2017/3/14.
 */
public class BaseDTO {
    private Date createDate;
    private Integer createBy;
    private Date lastUpdateDate;
    private Integer lastUpdateBy;
    @Transient
    private String _status;

    public String get_status() {
        return _status;
    }

    public BaseDTO set_status(String _status) {
        this._status = _status;
        return this;
    }


}
