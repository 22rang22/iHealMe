package com.project.ihealme.community.dto;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class InsertPostRequestDto {

    private int resNo;
    private String hptName;
    private String title;
    private String content;
    private String userEmail;

}
