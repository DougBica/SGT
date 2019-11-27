import { FormacaoModel } from './formacao.model';
import { ConhecimentoModel } from './conhecimento.model';
import { HistoricoTrabalhoModel } from './historicoTrabalho.model';
import { TelefoneModel } from './telefone.model';

export class UserModel{
	private _id : Number;
    private _nome : String;
	private _idade : Number;
	private _fotoPath : String;
	private _conhecimentos : Array<ConhecimentoModel>;
	private _formacoes : Array<FormacaoModel>;
	private _historicoTrabalho : Array<HistoricoTrabalhoModel>;
	private _telefones : Array<TelefoneModel>;
	private _status : String;
	private _permissoes : Array<String>


	get id(){
		return this._id;
	}

	get nome(){
		return this._nome;
	}

	get idade(){
		return this._idade;
	}

	
	
}