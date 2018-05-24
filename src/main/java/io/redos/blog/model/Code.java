package io.redos.blog.model;

import lombok.Getter;
import lombok.Setter;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/24 15:16
 * @copyright ©2018
 */
@Getter
@Setter
public class Code {
    private String id;
    private String field;
    private String name;
    private String value;
    private TypeEnum type;
}
