package com.reto.backend.entelgy.repository.external;

import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import com.reto.backend.entelgy.constants.ConstantsExternal;
import com.reto.backend.entelgy.model.Comment;


import java.net.URI;

@Repository
public class CommentRepositoryExternalImpl implements CommentRepositoryExternal {

    @Autowired
    private RestTemplate restTemplate;
	
	@Override
	public List<Comment> getCommet() { 
		 	try {
	        URI uri =  new URI(ConstantsExternal.RESOURCE_COMMENTS);
	        RequestEntity<Void> requestEntity = RequestEntity.get(uri).build();
	            ResponseEntity<Comment[]> response = restTemplate.exchange(requestEntity, Comment[].class);
	            List<Comment> listComment= Arrays.asList(response.getBody());
	            return listComment;
		 	}catch (Exception ex) {
	        	System.out.println(ex.getMessage());
	        	return null;
	        }
	}

}
