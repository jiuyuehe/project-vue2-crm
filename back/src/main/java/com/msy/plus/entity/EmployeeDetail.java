package com.msy.plus.entity;

import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDetail extends User{
    List<Long> roleIds;
}
