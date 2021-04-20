package com.estagiobetha.domain;

import com.estagiobetha.domain.enums.EstadoPagamento;

public class PagamentoComCartao extends Pagamento {
	
	private static final long serialVersionUID = 1L;
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Cliente cliente,
			Endereco enderecoDeEntrega, Integer numeroDeParcelas) {
		super(id, estado, pedido, cliente, enderecoDeEntrega);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
	
}
