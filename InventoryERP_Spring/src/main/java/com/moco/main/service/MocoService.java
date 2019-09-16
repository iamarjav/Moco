package com.moco.main.service;

import com.moco.main.model.Moco;
import com.mongodb.client.result.DeleteResult;

public interface MocoService {

	Moco createProductEntry(Moco moco);

	Moco deleteProductEntry(String mocoName);

	DeleteResult updateProductEntry(String mocoName);

}
