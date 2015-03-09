package br.com.fernandolopez.model
{
	[RemoteClass(alias="br.com.fernandolopez.model.Contato")]
	[Bindable]
	public class Contato
	{
		public var nome : String;
		public var email : String;
		
		public function Contato()
		{
		}
	}
}