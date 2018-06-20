package com.milfist.poc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    String getLanguageByUser(@Param("userName") String userName);
    String getMessageByLanguage(@Param("language") String language);
}
