package com.example.userservice.enities.value_objects;

import com.example.userservice.enities.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Builder
public class ResponseTemplateVO {
    private User user;
    private Department department;
}
