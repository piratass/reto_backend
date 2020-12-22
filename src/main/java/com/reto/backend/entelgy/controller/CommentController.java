package com.reto.backend.entelgy.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.reto.backend.entelgy.constants.Constants;
import com.reto.backend.entelgy.dto.CommentDataDTO;

import org.springframework.beans.factory.annotation.Autowired;
import com.reto.backend.entelgy.service.CommentService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(Constants.API_VERSION + Constants.RESOURCE_COMMENTS)
public class CommentController {
	@Autowired
	CommentService commentService;
	
    @GetMapping()
    public CommentDataDTO getCommentsData() {
    	return commentService.getCommentData();
    }
}
