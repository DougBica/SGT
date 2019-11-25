import { FormacaoModel } from './formacao.model';
import { ConhecimentoModel } from './conhecimento.model';
import { HistoricoTrabalhoModel } from './historicoTrabalho.model';
import { TelefoneModel } from './telefone.model';

export class UserModel{

    private nome : String;
	private idade : Number;
	private fotoPath : String;
	private conhecimentos : Array<ConhecimentoModel>;
	private formacoes : Array<FormacaoModel>;
	private historicoTrabalho : Array<HistoricoTrabalhoModel>;
	private telefones : Array<TelefoneModel>;
	private status : String;
	private permissoes : Array<String>
	
	
}