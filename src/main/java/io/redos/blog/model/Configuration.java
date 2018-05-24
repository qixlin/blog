package io.redos.blog.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/24 14:08
 * @copyright ©2018
 */
@Setter
@Getter
public class Configuration implements Serializable {
    private String url;
    private String title;
    private String subTitle;
    private String logoImg;
    private String email;
    private boolean enableMarkDown;
}
