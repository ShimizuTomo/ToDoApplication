package sample.common.service;

import java.util.List;

import sample.common.dao.entity.Task;

/**
* タスクサービスインターフェース
*/
public interface TaskService {
	/**
	* 全タスク取得
	* @return タスク一覧
	*/
	List<Task> getAllTasks();
}