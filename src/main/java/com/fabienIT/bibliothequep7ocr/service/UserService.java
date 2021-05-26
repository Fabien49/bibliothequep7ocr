package com.fabienIT.bibliothequep7ocr.service;

import com.fabienIT.bibliothequep7ocr.model.User;

public interface UserService {

	User findUserByEmail(String email);
	void saveUser(User user);
	void saveMembre(User user);

}
