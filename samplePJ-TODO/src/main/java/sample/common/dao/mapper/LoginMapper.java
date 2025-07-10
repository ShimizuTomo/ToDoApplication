package sample.common.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import sample.common.dao.entity.Login;

@Mapper
public interface LoginMapper {
	// ユーザ登録
	void insert(Login login);

	// ユーザ名とパスワードで1件取得
	Login selectByUsernameAndPassword(@Param("username") String username, 
	                                  @Param("password") String password);
}
