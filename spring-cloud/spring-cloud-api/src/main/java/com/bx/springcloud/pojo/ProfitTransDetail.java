package com.bx.springcloud.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class ProfitTransDetail implements Serializable {

    private  Long transId;
    private  String merchantCode;
    private String dbSource;

}
