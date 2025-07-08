package sample.common.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import sample.common.dao.entity.Task;

/**
* tasksテーブル用Mapperインターフェース
*/
@Mapper
public interface TaskMapper {

	/**
	* 全タスクを取得
	* @return タスク一覧
	*/
	List<Task> findAll();
}