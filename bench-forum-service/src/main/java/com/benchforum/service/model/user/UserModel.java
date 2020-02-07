package com.benchforum.service.model.user;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class UserModel {
    private static final long serialVersionUID = -5415120947023621620L;
    private String userId;
    private String userName;
    private String password;
    private String email;
    private String mobile;
    private String loginType;
    private String userType;
    private String orgId;
    private boolean isPasswordChange;
    private boolean isActive;
    private Date createdDate;
}
