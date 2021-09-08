package rhsolid.promocao;

import rhsolid.funcionario.Cargo;
import rhsolid.funcionario.Funcionario;

public class PromocaoService {

	public void promover(Funcionario funcionario, boolean metaBatida) {

		Cargo cargoAtual = funcionario.getCargo();

		if (cargoAtual == Cargo.GERENTE) {
			throw new RuntimeException("Gerentes nao podem ser promovidos!");
		}

		if (!metaBatida) {
			throw new RuntimeException("Meta nao foi batida, nao pode ser promovido");
		}

		Cargo novoCargo = cargoAtual.proximoCargo();
		funcionario.promover(novoCargo);
	}
}
