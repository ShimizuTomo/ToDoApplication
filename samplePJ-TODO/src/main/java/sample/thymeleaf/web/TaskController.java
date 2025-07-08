package sample.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sample.common.service.TaskService;

/**
* タスク画面用コントローラ
*/
@Controller
public class TaskController {

	private final TaskService taskService;

	// コンストラクタインジェクションでTaskServiceを注入
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}

	/**
	* タスク一覧表示
	* http://localhost:8080/tasks にアクセスするとtasks.htmlを返す
	*/
	@GetMapping("/tasks")
	public String tasks(Model model) {
		// Service経由でタスク一覧を取得し、ビューに渡す
		model.addAttribute("tasks", taskService.getAllTasks());
		return "tasks"; // → resources/templates/tasks.html
	}
}