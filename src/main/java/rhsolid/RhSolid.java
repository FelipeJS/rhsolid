package rhsolid;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import rhsolid.funcionario.Cargo;
import rhsolid.funcionario.Funcionario;
import rhsolid.reajuste.ReajusteService;
import rhsolid.reajuste.ValidacaoPercentualReajuste;
import rhsolid.reajuste.ValidacaoPeriodicidadeReajuste;
import rhsolid.reajuste.ValidacaoReajuste;

public class RhSolid {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("Felipe", "033", Cargo.ESPECIALISTA, new BigDecimal(10000),
				LocalDate.now());

		List<ValidacaoReajuste> validacoes = new ArrayList<ValidacaoReajuste>();
		validacoes.add(new ValidacaoPercentualReajuste());
		validacoes.add(new ValidacaoPeriodicidadeReajuste());

		ReajusteService reajusteService = new ReajusteService(validacoes);
		reajusteService.reajustarSalarioDoFuncionario(funcionario, new BigDecimal(4000));
	}

}
