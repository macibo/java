package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UserService {
 public abstract UserDto createUser (UserDto user);
 List<UserDto> getUsers();

 UserDto getUser(Long id);
 UserDto updateUser(Long id,UserDto user);
 Boolean deleteUser(Long id);
 Page<User> pagination( int currentPage, int pageSize);
 Page<User> pagination(Pageable pageable);
 Slice<User> slice(Pageable pageable);

}
