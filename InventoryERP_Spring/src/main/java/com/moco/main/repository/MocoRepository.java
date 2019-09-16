package com.moco.main.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.moco.main.model.Moco;
import com.mongodb.client.result.DeleteResult;

@Repository
public class MocoRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	public Moco persistProductData(Moco moco) {
		// TODO Auto-generated method stub
		Moco save = mongoTemplate.save(moco, "Moco");
		return save;
	}

	public Moco deleteProductData(String mocoName) {
		// TODO Auto-generated method stub
		Criteria criteria = Criteria.where("mocoName").is(mocoName);
		Query query = new Query();
		query.addCriteria(criteria);
		Update update = new Update();
		update.set("mocoName", "Zennith");
		Moco find = mongoTemplate.findAndModify(query, update, Moco.class, "Moco");

		return find;
	}

	public DeleteResult updateProductData(String mocoName) {
		// TODO Auto-generated method stub
		Criteria criteria = Criteria.where("mocoName").is(mocoName);
		Query query = new Query();
		query.addCriteria(criteria);
		return mongoTemplate.remove(query, "Moco");

	}

}
