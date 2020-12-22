package com.reto.backend.entelgy.Controller;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.reto.backend.entelgy.controller.CommentController;
import com.reto.backend.entelgy.service.CommentService;


public class CommentControllerTest {
	
	@InjectMocks
	CommentController commentController;
	@Mock
	CommentService commentService;
	@BeforeEach
	void setUp() throws Exception{
		
	}
	@Test
	@DisplayName(value = "Test1 -> service Comment") //El texto que se mostrará cuando ejecutamos el test
	final void testGetComments() {
		when(commentService.getCommentData()).thenReturn(null);
		
	}
}
