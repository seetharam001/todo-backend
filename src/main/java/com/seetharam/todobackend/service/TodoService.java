package com.seetharam.todobackend.service;
import java.util.Optional;
import com.seetharam.todobackend.entity.Todo;
import com.seetharam.todobackend.repository.TodoRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo createTodo(Todo todo) {

        todo.setCompleted(false);
        todo.setCreatedAt(LocalDateTime.now());

        return todoRepository.save(todo);
    }

    public Todo getTodoById(Long id) {

        Optional<Todo> todo = todoRepository.findById(id);

        return todo.orElse(null);
    }

    public Todo updateTodo(Long id, Todo updatedTodo) {

        Todo existingTodo = todoRepository.findById(id).orElse(null);

        if (existingTodo == null) {
            return null;
        }

        existingTodo.setTitle(updatedTodo.getTitle());
        existingTodo.setDescription(updatedTodo.getDescription());
        existingTodo.setCompleted(updatedTodo.getCompleted());

        return todoRepository.save(existingTodo);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}