package com.recipe.domain.mapper;

import com.recipe.domain.entity.Auth;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AuthMapper {

    Auth findByEmail(@Param("email") String email);

    List<String> findRolesByUserId(@Param("userId") Long userId);

    List<String> findPermissionsByUserId(@Param("userId") Long userId);
}