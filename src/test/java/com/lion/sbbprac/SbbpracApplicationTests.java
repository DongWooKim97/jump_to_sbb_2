package com.lion.sbbprac;

import com.lion.sbbprac.answer.AnswerRepository;
import com.lion.sbbprac.answer.AnswerService;
import com.lion.sbbprac.question.Question;
import com.lion.sbbprac.question.QuestionRepository;
import com.lion.sbbprac.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SbbpracApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;

	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {
		for (int i = 1; i <= 300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "내용무";
			this.questionService.create(subject, content);
		}
	}

}
