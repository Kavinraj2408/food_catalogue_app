package com.kavindev.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.kavindev.order.entity.Sequence;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Query.query;
import org.springframework.data.mongodb.core.query.Update;

@Service
public class SequenceGenerator {
	
	@Autowired
	private MongoOperations opr;
	
	public int generateNextOrderId() {
		Sequence  count = opr.findAndModify(
				query(where("_id").is("sequence")),
				new Update().inc("sequence", 1), 
				options().returnNew(true).upsert(true),
				Sequence.class);
		
		return count.getSequence();
	}

}
