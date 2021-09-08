package rhsolid.reajuste;

import java.math.BigDecimal;

import rhsolid.funcionario.Funcionario;

public interface ValidacaoReajuste {

	void validar(Funcionario funcionario, BigDecimal aumento);

}