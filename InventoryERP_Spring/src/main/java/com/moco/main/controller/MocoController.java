package com.moco.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moco.main.exception.MocoException;
import com.moco.main.model.Moco;
import com.moco.main.service.MocoService;
import com.mongodb.client.result.DeleteResult;

@RestController
public class MocoController {

	@Autowired
	private MocoService mocoService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Moco addProductData(@RequestBody Moco moco) throws MocoException {
		if (moco == null || moco.getMocoId() == null || moco.getMocoName().isEmpty() || moco.getMocoDesc().isEmpty()) {
			throw new MocoException("Values cannot be null");
		}
		return mocoService.createProductEntry(moco);

	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public Moco deleteProductData(@RequestParam(value = "mocoName") String mocoName) throws MocoException {
		System.out.println(mocoName);
		if (mocoName.isEmpty()) {
			throw new MocoException("Values cannot be null");
		}
		return mocoService.deleteProductEntry(mocoName);

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public DeleteResult updateProductData(@RequestParam(value = "mocoName") String mocoName) throws MocoException {
		System.out.println(mocoName);
		if (mocoName.isEmpty()) {
			throw new MocoException("Values cannot be null");
		}
		return mocoService.updateProductEntry(mocoName);

	}
}
