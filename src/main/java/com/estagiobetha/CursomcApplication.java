package com.estagiobetha;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.estagiobetha.domain.Categoria;
import com.estagiobetha.domain.Cidade;
import com.estagiobetha.domain.Cliente;
import com.estagiobetha.domain.Endereco;
import com.estagiobetha.domain.Estado;
import com.estagiobetha.domain.ItemPedido;
import com.estagiobetha.domain.Pagamento;
import com.estagiobetha.domain.PagamentoComBoleto;
import com.estagiobetha.domain.PagamentoComCartao;
import com.estagiobetha.domain.Pedido;
import com.estagiobetha.domain.Produto;
import com.estagiobetha.domain.enums.EstadoPagamento;
import com.estagiobetha.domain.enums.TipoCliente;
import com.estagiobetha.repositories.CategoriaRepository;
import com.estagiobetha.repositories.CidadeRepository;
import com.estagiobetha.repositories.ClienteRepository;
import com.estagiobetha.repositories.EnderecoRepository;
import com.estagiobetha.repositories.EstadoRepository;
import com.estagiobetha.repositories.ItemPedidoRepository;
import com.estagiobetha.repositories.PagamentoRepository;
import com.estagiobetha.repositories.PedidoRepository;
import com.estagiobetha.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
