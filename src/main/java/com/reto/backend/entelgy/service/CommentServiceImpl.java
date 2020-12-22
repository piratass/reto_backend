package com.reto.backend.entelgy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reto.backend.entelgy.dto.CommentDTO;
import com.reto.backend.entelgy.dto.CommentDataDTO;
import com.reto.backend.entelgy.model.Comment;
import com.reto.backend.entelgy.repository.external.CommentRepositoryExternal;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	CommentRepositoryExternal commentRepositoryExternal;
	
	@Override
	public CommentDataDTO getCommentData() {
		List<CommentDTO> listCommentDTO =new ArrayList<CommentDTO>();
		List<Comment> commentList =commentRepositoryExternal.getCommet();
		commentList.forEach(comment->{
			CommentDTO commentDTO = new CommentDTO(); 
			commentDTO.setPostId(comment.getPostId());
			commentDTO.setId(comment.getId());
			commentDTO.setEmail(comment.getEmail());
			listCommentDTO.add(commentDTO);
		});
		CommentDataDTO commentDataDTO =new CommentDataDTO();
		commentDataDTO.setData(listCommentDTO);
		return commentDataDTO;
	}

}
