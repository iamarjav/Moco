package com.moco.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moco.main.model.Moco;
import com.moco.main.repository.MocoRepository;
import com.mongodb.client.result.DeleteResult;

@Service
public class MocoServiceImpl implements MocoService {

	@Autowired
	private MocoRepository mocoRepository;

	@Override
	public Moco createProductEntry(Moco moco) {
		// TODO Auto-generated method stub
		return mocoRepository.persistProductData(moco);
	}

	@Override
	public Moco deleteProductEntry(String mocoName) {
		// TODO Auto-generated method stub
		return mocoRepository.deleteProductData(mocoName);
	}

	@Override
	public DeleteResult updateProductEntry(String mocoName) {
		// TODO Auto-generated method stub
		return mocoRepository.updateProductData(mocoName);
	}

}
