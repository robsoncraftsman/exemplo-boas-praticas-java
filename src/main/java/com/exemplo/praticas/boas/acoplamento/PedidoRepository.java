package com.exemplo.praticas.boas.acoplamento;

/*
 * Interface para descrever as operações de persistência relativas a entidade Pedido.
 *
 * Esta técnica garante um baixo acoplamento pois os componentes que precisarem
 * fazer operações de persistência relativas ao pedido, não irão depender de uma
 * implementação específica, facilitando inclusive a implementação de mocks de teste.
 */
public interface PedidoRepository {

	void salvar(final Pedido pedido);

}
