
package com.quizmaster.quizmaster.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class QuizController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello! QuizMaster Java Backend is Working!";
    }

    @GetMapping("/api/questions")
    public List<Map<String, Object>> getQuestions() {

        List<Map<String, Object>> questions = new ArrayList<>();

        Map<String, Object> q1 = new LinkedHashMap<>();
        q1.put("id", 1);
        q1.put("question", "Which language is used for Java development?");
        q1.put("options", List.of("Python", "Java", "C++", "HTML"));
        questions.add(q1);

        Map<String, Object> q2 = new LinkedHashMap<>();
        q2.put("id", 2);
        q2.put("question", "Which keyword creates an object in Java?");
        q2.put("options", List.of("class", "static", "new", "void"));
        questions.add(q2);

        Map<String, Object> q3 = new LinkedHashMap<>();
        q3.put("id", 3);
        q3.put("question", "Which method is the entry point of Java?");
        q3.put("options", List.of("start()", "main()", "run()", "print()"));
        questions.add(q3);

        return questions;
    }
}
