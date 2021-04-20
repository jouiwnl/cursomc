package com.estagiobetha.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.estagiobetha.domain.enums.EstadoPagamento;

@Entity
public class Pagamento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	private EstadoPagamento estado;
	
	
	@OneToOne
	@JoinColumn(name="pedido_id")
	@MapsId
	private Pedido pedido;
	
	private Cliente cliente;
	
	private Endereco enderecoDeEntrega;
	
	public Pagamento() {
		
	}

	public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido, Cliente cliente, Endereco enderecoDeEntrega) {
		super();
		this.id = id;
		this.estado = estado;
		this.pedido = pedido;
		this.cliente = cliente;
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EstadoPagamento getEstado() {
		return estado;
	}

	public void setEstado(EstadoPagamento estado) {
		this.estado = estado;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}

	public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
